package Longest_Palindromic_Substring005;

/**
 * Created by LiuLubao on 2017/12/21.
 */
public class Solution {
    public static String longestPalindrome(String s) {
        int num=1;
        int start = 0;
        int end=1;
        int min=0,max=1;
        for(int i=0;i<s.length();i++){
            min=i;
            max=i+1;
            while(min>=0&&max<s.length()&&s.charAt(min)==s.charAt(max)){
                if((max-min+1)>num){
                    start=min;
                    end=max+1;
                    num=max-min+1;
                }
                min-=1;
                max+=1;
            }
            min=i-1;
            max=i+1;
            while(min>=0&&max<s.length()&&s.charAt(min)==s.charAt(max)){
                if((max-min+1)>num){
                    start=min;
                    end=max+1;
                    num=max-min+1;
                }
                min-=1;
                max+=1;
            }
        }
        return s.substring(start,end);
    }
}
