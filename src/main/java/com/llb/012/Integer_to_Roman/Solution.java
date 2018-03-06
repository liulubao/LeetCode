package Integer_to_Roman;

/**
 * Created by LiuLubao on 2018/3/6.
 */
public class Solution {
    public  String intToRoman(int num) {
        String s = new String();
        int a= num%10;
        s=solve(a,"I","V","X");
        int b = (num%100)/10;
        s=solve(b,"X","L","C")+s;
        int c = (num%1000)/100;
        s=solve(c,"C","D","M")+s;
        int d = num/1000;
        s=solve(d,"M","","")+s;
        return s;
    }
    public  String solve(int m,String a,String b,String c){
        if(m==1){
            return a;
        }else if(m==2){
            return a+a;
        }else if(m==3){
            return a+a+a;
        }else if(m==4){
            return a+b;
        }else if(m==5){
            return b;
        }else if(m==6){
            return b+a;
        }else if(m==7){
            return b+a+a;
        }else if(m==8){
            return b+a+a+a;
        }else if(m==9){
            return a+c;
        }
        return "";
    }
}
