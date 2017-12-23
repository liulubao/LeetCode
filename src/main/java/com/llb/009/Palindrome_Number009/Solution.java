package Palindrome_Number009;

/**
 * Created by LiuLubao on 2017/12/23.
 */
public class Solution {
    public static boolean isPalindrome(int x) {
        if(x<0){
            x=0-x;
        }
        String s = String.valueOf(x);
        for(int i=0;i<(s.length()/2);i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
