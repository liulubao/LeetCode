package Sum4;

/**
 * Created by LiuLubao on 2018/3/9.
 */
public class Test {
    public static void main(String[] args){
//        [-1,0,1,2,-1,-4]
//        -1
//        int[] test={1, 0, -1, 0, -2, 2};
//        [-1,0,-5,-2,-2,-4,0,1,-2]
//        -9
        int[] test={-1,0,-5,-2,-2,-4,0,1,-2};
        System.out.println(new Solution().fourSum(test,-9));
    }
}
