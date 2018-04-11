package nukeTest;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * 空间占用太多!
 */
public class Test13 {
    public void reOrderArray(int [] array) {
//        int [] flag = array.clone();
//        for (int i =0;i<array.length;i++){
//            for (int j=i+1;j<array.length;j++){
//                if(array[i]%2==0&&array[j]%2!=0){
//                    //swap
//                    int temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }else if (array[i]%2==0&&array[j]%2==0){
//                    int first=0;
//                    int second=0;
//                    for (int p=0;p<flag.length;p++)
//                    {
//                        if (flag[p]==array[i]){
//                            first = p;
//                        }
//                        if (flag[p]==array[j]){
//                            second = p;
//                        }
//                    }
//                    if (first>second){
//                        //swap
//                        int temp = array[i];
//                        array[i] = array[j];
//                        array[j] = temp;
//                    }
//                }
//            }
//        }
        //better!
        for(int i = 0;i<array.length-1;i++) {
            for(int j = 0;j<array.length-1-i;j++) {
                if(array[j]%2 ==0&&array[j+1]%2 == 1) {
                    int temp =array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }


    }

    public static void main(String[] args){
        Test13 test13= new Test13();
        int[] a = {1,4,5,2,3,6,7};
        test13.reOrderArray(a);
        //1 5 3 7 4 2 6
        for (int i:a){
            if (i%2==0){
                System.out.println("偶数"+i);
            }else{
                System.out.println("奇数"+i);
            }
        }
    }
}
