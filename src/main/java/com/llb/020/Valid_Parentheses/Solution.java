package Valid_Parentheses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * Created by LiuLubao on 2018/3/9.
 */
public class Solution {
    public boolean isValid(String s) {
        boolean result = false;
//        List l = new ArrayList();
        char[] cc = {'(',')','{','}','[',']'};
        List l=Arrays.asList(cc);
//        List<Character> list= Arrays.asList(c);
        Stack ss = new Stack();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='{'){
                ss.push('}');
            }else if(s.charAt(i)=='('){
                ss.push(')');
            }else if(s.charAt(i)=='['){
                ss.push(']');
            }else if(s.charAt(i)==']'){
                if(!ss.empty()&&ss.peek().equals(']')){
                    ss.pop();
                    if((i<s.length()-1)&&!test(s.charAt(i+1))&&ss.empty()){
                        System.out.println(1);
                        return false;
                    }
                }else{
                    return false;
                }
            }else if(s.charAt(i)==')'){
                if(!ss.empty()&&ss.peek().equals(')')){
                    ss.pop();
                    if((i<s.length()-1)&&!test(s.charAt(i+1))&&ss.empty()){
                        System.out.println(l.contains(s.charAt(i+1)));
                        return false;
                    }
                }else{
                    return false;
                }
            }else if(s.charAt(i)=='}'){
                if(!ss.empty()&&ss.peek().equals('}')){
                    ss.pop();
                    if((i<s.length()-1)&&!test(s.charAt(i+1))&&ss.empty()){
                        System.out.println(3);
                        return false;
                    }
                }else{
                    return false;
                }
            }

        }
        if(ss.empty()){
            result=true;
        }
        return result;
    }
    public boolean test(char c){
        char[] cc = {'(',')','{','}','[',']'};
        for(int i=0;i<cc.length;i++){
            if(cc[i]==c){
                return true;
            }
        }
        return false;
    }
}
