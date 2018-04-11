package nukeTest;

/**
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */
public class Test10 {
    public int RectCover(int target) {
        //一种比较好的防止栈溢出的解法！
        if (target<=0){
            return 0;
        }
        else if (target == 1){
            return 1;
        }else if(target==2){
            return 2;
        }else{
            int[] fibAry = new int[target+1];
            fibAry[0] = 1;
            fibAry[1] = 2;
            for(int i = 2; i <=target; i++){
                fibAry[i] = fibAry[i - 1] + fibAry[i - 2];
            }
            return fibAry[target-1];
        }
    }

    public static void main(String[] args){
        Test10 test10 = new Test10();
        System.out.println(test10.RectCover(4));

    }
}
