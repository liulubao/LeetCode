package Longest_Common_Prefix;

/**
 * Created by LiuLubao on 2018/3/7.
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            System.out.println(2);
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }

        String pre = strs[0];
        int i=0;
        for(String s:strs){
            if(s.equals("")){
                System.out.println(1);
                return "";
            }
            if(!s.startsWith(pre)){
                if(s.charAt(0)!=pre.charAt(0)){
                    System.out.println(0);
                    return "";
                }
//                System.out.println(i);
                while(s.charAt(i)==pre.charAt(i)&&i<s.length()-1&&i<pre.length()-1){
                    i++;
//                    System.out.println(i);
                }

                if(s.charAt(i)==pre.charAt(i)){

                    pre=pre.substring(0,i+1);
                }else{

                    pre=pre.substring(0,i);
                }

                i=0;
            }
        }
        return pre;
    }
}
