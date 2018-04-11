package nukeTest;

import java.util.ArrayList;

/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class Test11 {
    /**
     * 算法思想：把一个整数减去 1，在与原数做与运算，
     * 会把该整数最右边的 1 变成 0（
     * 例如原数 1100，减 1 得 1011，做完与运算后得 1000.）.
     * 那么一个整数的二进制表示中有多少个 1 ，
     * 就可以进行多少次这样的操作
     * @param n
     * @return
     */
    public int NumberOf1(int n) {
        int count=0;
        while(n!=0){
            count++;
            n=(n-1)&n;
        }
        return count;

    }
    public static void main(String[] args){
        Test11 test11 = new Test11();
        System.out.println(test11.NumberOf1(-256));
    }
}
