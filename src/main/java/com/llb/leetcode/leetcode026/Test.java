package leetcode026;

/**
 * Created by LiuLubao on 2018/4/21.
 */
public class Test {
    public static void main(String[] args){
        int[] a={1,1,2};
        int mid=new Solution().removeDuplicates(a);
        for(int i=0;i<mid;i++){
            System.out.println(a[i]);
        }
    }
}
