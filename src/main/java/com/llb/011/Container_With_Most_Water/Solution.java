package Container_With_Most_Water;

/**
 * Created by LiuLubao on 2018/3/6.
 */
public class Solution {
    public static int maxArea(int[] height) {
        int max=0;
        int m;
//        for(int i=0;i<height.length;i++){
//            for(int j=i+1;j<height.length;j++){
//                int a=height[i];
//                int b =height[j];
//                if(a>b){
//                    max=(height[j]*(j-i))>max?(height[j]*(j-i)):max;
//                }else{
//                    max=(height[i]*(j-i))>max?(height[i]*(j-i)):max;
//                }
//            }
//
//        }
        for(int i=0;i<height.length;i++){
            int left = 0, right = height.length - 1;
            int maxArea = 0;

            while (left < right) {
                maxArea = Math.max(maxArea, Math.min(height[left], height[right])
                        * (right - left));
                if (height[left] < height[right])
                    left++;
                else
                    right--;
            }

            return maxArea;
        }
        return max;
    }
}
