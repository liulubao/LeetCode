package Letter_Combinations_of_a_Phone_Number;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by LiuLubao on 2018/3/9.
 */
public class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result=new LinkedList<String>();
        char[] res=digits.toCharArray();
        Character[] num={'2','3','4','5','6','7','8'};
        String[] s={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<Character> l = new LinkedList<Character>();
        l= Arrays.asList(num);
        for(int i=0;i<digits.length();i++){
            if(l.contains(digits.charAt(i))){
                result=test(result,s[Integer.parseInt(""+digits.charAt(i))-2]);
            }else{
                return new LinkedList<String>();
            }
        }
        return result;
    }
    public List<String> test(List<String> list,String s){
        List<String> result=new LinkedList<String>();
        if(list.isEmpty()){
            for(int j=0;j<s.length();j++){
                result.add(String.valueOf(s.charAt(j)));
            }
        }else{
            for(int i=0;i<list.size();i++){
                for(int j=0;j<s.length();j++){
                    result.add(list.get(i)+s.charAt(j));
                }
            }
        }

        return result;
    }
}
