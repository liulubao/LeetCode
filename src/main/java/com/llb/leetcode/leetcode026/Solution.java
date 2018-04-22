package leetcode026;

/**
 * Created by LiuLubao on 2018/4/21.
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        int result=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                result++;
                nums[result]=nums[i];
                System.out.println("i:"+i+"result:"+nums[result]);
            }
        }
        return result+1;
    }
}
