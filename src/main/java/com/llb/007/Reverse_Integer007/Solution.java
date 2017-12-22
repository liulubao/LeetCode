package Reverse_Integer007;

/**
 * Created by LiuLubao on 2017/12/22.
 */
public class Solution {
    public static int reverse(int x) {
        String s;
        int result=0;
        if(x<0){
            try {
                s = new StringBuilder(String.valueOf(-x)).reverse().toString();
                result = 0-Integer.parseInt(s);
            }catch (Exception e){
                result=0;
            }
        }else{
            try {
                s = new StringBuilder(String.valueOf(x)).reverse().toString();
                result = Integer.parseInt(s);
            }catch (Exception e){
                result=0;
            }

        }
        return result;
//        int result=0;
//        String s;
//        if(x<0){
//            s=String.valueOf(-x);
//        }else{
//            s=String.valueOf(x);
//        }
//        char[] ch = s.toCharArray();//字符串转换成字符数组
//        for (int i = 0 ; i < ch.length/2 ; i++){
//            char temp = ch[i];
//            ch[i] = ch[ch.length-i-1];
//            ch[ch.length-i-1] = temp;
//        }
//        if(x<0){
//            result = 0-Integer.valueOf(new String(ch).trim()).intValue();
//        }else{
//            try {
//                result= Integer.valueOf(new String(ch).trim()).intValue();
//            }catch (Exception e){
//                result=0;
//            }
//
//        }
//        return result;
//    return new String(ch);
    }
}
