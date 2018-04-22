package leetcode027;

/**
 * Created by LiuLubao on 2018/4/22.
 */
public class Test {
    public static void main(String[] args){
        int[] s={0,1,2,2,3,0,4,2};
        int mid=new Solution().removeElement(s,2);
        for(int i=0;i<mid;i++){
            System.out.println(s[i]);
        }
    }
}
