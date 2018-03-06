package Median_of_Two_Sorted_Arrays;

/**
 * Created by LiuLubao on 2018/3/6.
 */
public class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double m;
        int te=0;
        int l=nums1.length+nums2.length;
        int[] t=new int[l];
        int l1=0;
        int l2=0;
        while(l1< nums1.length&&l2<nums2.length){
            if(nums1[l1]<nums2[l2]){
                t[te++]=nums1[l1++];
            }else if(nums1[l1]>nums2[l2]){
                t[te++]=nums2[l2++];
            }else{
                t[te++]=nums1[l1++];
                t[te++]=nums2[l2++];
            }
        }
        while(l1<nums1.length){
            t[te++]=nums1[l1++];
        }
        while(l2<nums2.length){
            t[te++]=nums2[l2++];
        }
        for(int i:t){
            System.out.println(i);
        }
        if(l%2==0){
            System.out.println(t[l/2]);
            System.out.println(t[l/2-1]);
            m=((double) t[l/2]+(double)t[l/2-1])/2;
        }else{
            m=t[l/2];
        }
        return m;
    }

}
