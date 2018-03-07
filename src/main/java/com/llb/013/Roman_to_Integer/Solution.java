package Roman_to_Integer;

/**
 * Created by LiuLubao on 2018/3/7.
 */
public class Solution {
    public int romanToInt(String s) {
        int num=0;
        char[] c = s.toCharArray();
        int[] n=trans(c);
        for(int i=0;i<n.length-1;i++){
            if(n[i]<n[i+1]){
                num-=n[i];
            }else{
                num+=n[i];
            }
        }
        num+=n[n.length-1];
        return num;
    }
    public int[] trans(char[] c){
        int[] n = new int[c.length];
        for(int i=0;i<c.length;i++){
            if(c[i]=='I'){
                n[i]=1;
            }else if(c[i]=='V'){
                n[i]=5;
            }else if(c[i]=='X'){
                n[i]=10;
            }else if(c[i]=='L'){
                n[i]=50;
            }else if(c[i]=='C'){
                n[i]=100;
            }else if(c[i]=='D'){
                n[i]=500;
            }else if(c[i]=='M'){
                n[i]=1000;
            }
        }
        return n;
    }
}
