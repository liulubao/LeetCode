package leetcode027;

/**
 * Created by LiuLubao on 2018/4/22.
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        int result=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                result++;
            }else{
                if(result!=0){
                    nums[i-result]=nums[i];
                }
            }
        }
        return nums.length-result;
    }
}
