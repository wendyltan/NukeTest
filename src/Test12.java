package nukeTest;


/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。
 * 求base的exponent次方。
 */
public class Test12 {
    public double Power(double base, int exponent) {
        double result;
        //小于0，base倒数，然后指数变成正数
        if (exponent<0){
            base = 1/base;
            exponent = (~exponent+1);
        }else if(base!=0&&exponent==0){
            return 1;
        }else if(base==0){
            return 0;
        }
        //指数为正则不必处理
        result = base;
        for (int i=1;i<exponent;i++){
            result = result*base;
        }
        return result;
    }

    public static void main(String[] args){
        Test12 test12= new Test12();
        System.out.println(test12.Power(2,3));
    }
}

