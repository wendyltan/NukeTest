package nukeTest;

public class Test2 {

    public String replaceSpace(StringBuffer str) {
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)==' '){
                str.replace(i,i+1,"%20");
            }
        }
        return str.toString();
    }
    public static void main(String[] args){
        Test2 test2 = new Test2();
        System.out.println(test2.replaceSpace(new StringBuffer("We ara Happy")));
    }
}
