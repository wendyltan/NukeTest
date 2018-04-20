import java.util.Scanner;

/**
 * 一个英文句子，去掉多余空格，使得两个单词间只有一个空格，
 * 并且句子首尾没有空格。
 */
public class kuaishou1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] words = str.toCharArray();
        int counter = 0;
        //计算多余的空格数
        for (int i=0;i<str.length();i++){
            if (words[i]==' '&&words[i+1]==' '){
                counter++;
            }
        }
        char[] newline = new char[str.length()-counter];
        int j=0;
        for (int i=0;i<str.length();i++){

            if (words[i]!=' '){
                newline[j] = words[i];
                ++j;
            }else if (words[i]==' '&&words[i+1]!=' '){
                //除去多余的空格
                newline[j++] = ' ';
            }

        }
        System.out.println(String.valueOf(newline));


    }
}
