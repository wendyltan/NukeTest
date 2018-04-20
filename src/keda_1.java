import java.util.Scanner;

/**
 * 输入：
 * 2 ：多少行输入以及结果输出
 * 1 ：获得第一个素数
 * 3 ：获得第三个素数
 *
 * 输出：
 * 2
 * 5
 */
public class keda_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int lineNumber = scanner.nextInt();
        int[] whichPrime = new int[lineNumber];
        for (int i=0;i<lineNumber;i++){
            whichPrime[i] = scanner.nextInt();
        }

        for (int i=0;i<lineNumber;i++){
            getTopPrime(whichPrime[i]);
        }
    }

    /**
     * 素数判断
     * @param number
     * @return
     */

    public static boolean isPrime(int number){
        if(number<2){//若此数小于2，则不是质数
            return false;
        }
        //从1-number本身循环取余计算
        for(int i=1;i<number;i++){
            if(number % i == 0){//余数为0，能整除
                if(number == i){//是否是本身
                    return true;
                }else if(i!=1){//是否是1
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * 获得第m个素数
     * @param m
     */
    public static void getTopPrime(int m){
        int primArr[] = new int[m];
        if(m<1){
            System.out.println("输入有误！");
        }else{
            int num = 0;//要计算的数
            int index = 0;//第几个质数
            while(index < m){//数量不到m个一直循环
                num++;//自增，不断计算
                if(isPrime(num)){
                    primArr[index] = num;
                    index++;
                }
            }
        }
        if(primArr.length>0){
            System.out.println(primArr[primArr.length-1]);
        }
    }
}
