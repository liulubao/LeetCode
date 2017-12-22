package ZigZag_Conversion006;

/**
 * Created by LiuLubao on 2017/12/22.
 */
public class Solution {
    public static String convert(String s, int numRows) {
        String result="";
        int space=numRows*2-2;
        int num=0;
        if (s.length()==0){
            return "";
        }
        if(s.length()<=numRows){
            return s;
        }
        for(int i=0;i<numRows;i++){
            num=i;
            while(num<s.length()){
                result = result+s.charAt(num);
                if(i!=0&&i!=numRows){
                    if((num+(numRows-i)*2-2)<s.length()&&(num+(numRows-i)*2-2)!=num){
                        result = result+s.charAt(num+(numRows-i)*2-2);
                    }
                }
                num+=space;
            }
        }
        return result;
    }
}
