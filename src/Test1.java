package nukeTest;

public class Test1 {
    public boolean Find(int target, int [][] array) {
        for (int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(array[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }

    private int [][] a = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};

    public static void main(String[] args){
        Test1 test1 = new Test1();
        for (int[] row:test1.a){
            for (int col : row){
                System.out.print(col+" ");
            }
        }
        System.out.println(test1.Find(17,test1.a));
    }
}
