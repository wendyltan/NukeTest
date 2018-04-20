import java.util.Scanner;

/**
 * 判定一个由[a-z]字符构成的字符串和一个包含'?'和'*'通配符的字符串是否匹配。通配符'?'匹配任意单一字符,'*'匹配任意多个字符包括0个字符。
 *
 * 字符串长度不会超过100，字符串不为空。
 *
 * 输入描述:
 * 字符串 str 和包含通配符的字符串 pattern。1 <= 字符串长度 <= 100
 * 输出描述:
 * true 表示匹配，false 表示不匹配
 *
 * 动态规划问题https://blog.csdn.net/gldemo/article/details/47678159
 */
public class kuaishou2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String pattern = scanner.nextLine();
        if (isMatch(str,pattern)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }


    }

    public static boolean isMatch(String str, String pattern) {
        int countXing = 0;
        //计算pattern长度
        for(char c : pattern.toCharArray())
            countXing++;

        if(pattern.length() - countXing > str.length() ) //说明pattern去掉通配符，长度也长于str
            return false;

        //动态规划设置初值
        boolean[][] dp = new boolean[pattern.length()+1][str.length()+1];
        dp[0][0] = true;

        for(int i=1; i<=pattern.length(); i++) {
            char s2_char = pattern.charAt(i-1);
            dp[i][0] = dp[i-1][0] && s2_char=='*'; //设置每次循环的初值，即当星号不出现在首位时，匹配字符串的初值都为false
            for(int j=1; j<=str.length(); j++) {
                char s1_char = str.charAt(j-1);
                if(s2_char == '*')
                    dp[i][j] = dp[i-1][j] || dp[i][j-1]; //动态规划递推式（星号） 表示星号可以匹配0个（决定于上次外循环的结果）或者多个（决定于刚才内循环的结果）
                else
                    dp[i][j] = dp[i-1][j-1] && (s2_char=='?' || s1_char == s2_char); //动态规划递推式（非星号） 表示dp值取决于上次的状态和当前状态
            }
        }
        return dp[pattern.length()][str.length()];
    }
}
