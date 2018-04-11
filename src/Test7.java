package nukeTest;


/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
 * n<=39
 */
public class Test7 {

    public int Fibonacci(int n) {
        if(n < 0 || n>39){
            return -1;
        }else if(n == 0){
            return 0;
        }else if (n == 1 || n == 2){
            return 1;
        }else{
            int[] fibAry = new int[n + 1];
            fibAry[0] = 0;
            fibAry[1] = fibAry[2] = 1;
            for(int i = 3; i <= n; i++){
                fibAry[i] = fibAry[i - 1] + fibAry[i - 2];
            }
            return fibAry[n];
        }
    }
    public static void main(String[] args){
       Test7 test7 = new Test7();
        System.out.println(test7.Fibonacci(39));
    }
}
