package Longest_Palindromic_Substring005;

/**
 * Created by LiuLubao on 2017/12/21.
 */
public class Test {
    public static void main(String[] args){
        String strStringType="ssss"; //创建一个字符串变量strStringType
        char[] chrCharArray=strStringType.toCharArray();
//        for(char i:chrCharArray){
            System.out.println(Solution.longestPalindrome(strStringType));
//        }
    }
}
