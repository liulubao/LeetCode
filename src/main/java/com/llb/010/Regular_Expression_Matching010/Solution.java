package Regular_Expression_Matching010;

/**
 * Created by LiuLubao on 2017/12/23.
 */
public class Solution {
    public static boolean isMatch(String s, String p) {
        if(p.length()==0&&p.length()!=s.length()){
            return false;
        }
        char pre=' ';
        int nump = p.length()-1;
        for (int i = s.length()-1; i >= 0; i--) {
            System.out.println(i+"  "+nump);
            if(p.charAt(nump)=='*'){
                nump-=1;
                if(s.charAt(i)!=p.charAt(nump)&&p.charAt(nump)!='.'){
                    i++;
//                    nump--;
                }else{
                    pre = p.charAt(nump);
                    nump=nump+2;
                }
            }else if(s.charAt(i)!= p.charAt(nump)&&p.charAt(nump)!='.'){
                System.out.println("1"+"   "+i+"   "+nump);
                return false;
            }
            nump--;
            if(nump<0&&i!=0){
                System.out.println("2"+"   "+i+"   "+nump);
                return false;
            }

        }
        while(nump>=0){
            if(p.charAt(nump)!='*'&&p.charAt(nump)!=pre){
                System.out.println("3");
                return false;
            }else{
                nump=nump-2;
            }
        }
        return true;
//        int nump = 0;
//        if(s.length()==0||p.length()==0){
//            return false;
//        }
//        for(int i = 0; i <s.length() ; i++) {
//            if(p.charAt(nump)=='*'){
//                nump-=1;
//                if(s.charAt(i)!=p.charAt(nump)&&p.charAt(nump)!='.'){
//                    i--;
//                    nump++;
//                }
//            }else{
//                if(s.charAt(i)!=p.charAt(nump)&&p.charAt(nump)!='.'){
//                    if(nump<(p.length()-1)&&p.charAt(nump+1)!='*'){
//                        return false;
//                    }
//                }
//            }
//            nump++;
//            if(nump==p.length()&&i!=(s.length()-1)){
//                return false;
//            }
//        }
//        if(p.length()!=nump){
//            if(p.charAt(nump)!='*'){
//                return false;
//            }
//        }
//        return true;



//        int nump = 0;
//        for (int i = 0; i < s.length() ; i++) {
//            if(nump!=(p.length()-1)){
//                if(p.charAt(nump+1)=='*'&&p.charAt(nump)!='.'){
//                    if(s.charAt(i)==p.charAt(nump)||p.charAt(nump)=='.'){
//                        while((i+1)!=s.length()&&s.charAt(i)==s.charAt(i+1)){
//                            i++;
//                            if(i==(s.length()-1)){
//                                break;
//                            }
//                        }
//                        nump++;
//                    }else{
//                        i--;
//                        nump++;
//                    }
//                }else if(p.charAt(nump)!=s.charAt(i)){
//                    return false;
//                }
//            }else if(p.charAt(nump)!=s.charAt(i)&&p.charAt(nump)!='.'){
//                return false;
//            }
//
//            nump++;
//            if(nump==p.length()&&i!=(s.length()-1)){
//                return false;
//            }
//        }
//
//        return true;
    }

}
