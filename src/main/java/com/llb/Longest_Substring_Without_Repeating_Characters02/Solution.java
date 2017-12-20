package Longest_Substring_Without_Repeating_Characters02;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by LiuLubao on 2017/12/20.
 */
public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int length=0;
        int maxlength = 0;
        int min=0;
        int mid=0;
        char[] all = s.toCharArray();
        Map<String,Integer> m = new HashMap<String, Integer>();
        for (int i=0;i<all.length;i++){
            char a=all[i];
            if(m.containsKey(String.valueOf(a))){
                mid = m.get(String.valueOf(a));
                length=length-1-(mid-min);
                for(;min<mid+1;min++){
                    char b=all[min];
                    m.remove(String.valueOf(b));
                }
            }
            m.put(String.valueOf(a),i);
            length+=1;
            maxlength=maxlength>length?maxlength:length;

        }
        return maxlength;
    }
}
