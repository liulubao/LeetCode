package Sum4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by LiuLubao on 2018/3/9.
 */
public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int j;
        int left,right=nums.length-1;
        for(int i=0;i<nums.length-1;i++){
//            System.out.println(nums[i]);
            if(i==0||(i>0&&nums[i]!=nums[i-1])){
//                j=i+1;
                for(j=i+1;j<nums.length-1;j++){
                    left=j+1;
                    right=nums.length-1;
                    if(j==i+1||(j>i+1&&nums[j]!=nums[j-1])){
                        while(left<right){
                            if(nums[i]+nums[j]+nums[left]+nums[right]==target){
                                result.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                                while(left<right&&nums[left]==nums[left+1]) left++;
                                while(left<right&&nums[right]==nums[right-1]) right--;
                                left++;
                                right--;
                            }else if(nums[i]+nums[j]+nums[left]+nums[right]<target){
                                left++;
                            }else if(nums[i]+nums[j]+nums[left]+nums[right]>target){
                                right--;
                            }
                        }
                    }
                }

            }
        }
        return result;
    }
}
