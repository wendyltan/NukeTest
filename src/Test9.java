package nukeTest;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法
 */
public class Test9 {
    public int JumpFloorII(int target) {
        if (target==1){
            return 1;
        }else if(target==2){
            return 2;
        }
        int sum=0;
        //记得不要误用等差数列的公式
        for (int i=1;i<target;i++){
            sum += JumpFloorII(i);
        }
        sum+=1;
        return sum;
    }
    public static void main(String[] args){
        Test9 test9 = new Test9();
        for (int i=1;i<=5;i++){
            System.out.println(test9.JumpFloorII(i));
        }

    }
}
