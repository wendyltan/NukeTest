package nukeTest;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * 其实就是斐波那契的变形！（解题思路）
 */
public class Test8 {
    public int JumpFloor(int target) {
       if (target==1){
           return 1;
       }else if(target==2){
           return 2;
       }
       return JumpFloor(target-1)+JumpFloor(target-2);
    }

    public static void main(String[] args){
        Test8 test8 = new Test8();
        System.out.println(test8.JumpFloor(10));
    }
}
