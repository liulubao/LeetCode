package Sum3;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by LiuLubao on 2018/3/7.
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if(nums.length<3){
            return result;
        }
        Arrays.sort(nums);
        int left=0,right=nums.length-1;
        for(int mid=0;mid< nums.length-2;mid++){
            if(nums[mid]>0) break;
            if(mid == 0 || (mid > 0 && nums[mid] != nums[mid-1])){
                left=mid+1;
                right=nums.length-1;
                while(left<right){
                    if(nums[left]+nums[mid]+nums[right] ==0){
                        result.add(Arrays.asList(nums[mid],nums[left],nums[right]));
                        while (left < right && nums[left] == nums[left+1]) left++;
                        while (left < right && nums[right] == nums[right-1]) right--;
                        left++;
                        right--;
                    }else if(nums[left]+nums[mid]+nums[right]<0){
                        left++;
                    }else if(nums[left]+nums[mid]+nums[right]>0){
                        right--;
                    }
                }
            }

        }
        return result;
    }
}
