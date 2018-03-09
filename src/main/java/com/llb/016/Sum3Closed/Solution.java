package Sum3Closed;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by LiuLubao on 2018/3/8.
 */
public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result=nums[nums.length-1]+nums[nums.length-2]+nums[nums.length-3];
        Arrays.sort(nums);
        int left=0,right=nums.length-1;
        for(int mid=0;mid< nums.length-2;mid++){
            if(mid == 0 || (mid > 0 && nums[mid] != nums[mid-1])){
                left=mid+1;
                right=nums.length-1;
                while(left<right){
                    if(Math.abs(nums[left]+nums[mid]+nums[right]-target)<=Math.abs(result-target)){
                        result=nums[left]+nums[mid]+nums[right];
                    }
                    if(nums[left]+nums[mid]+nums[right]<target){
                        left++;
                    }else{
                        right--;
                    }
                }
            }

        }
        return result;
    }
}
