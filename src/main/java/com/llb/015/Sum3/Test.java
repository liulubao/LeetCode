package Sum3;

import javafx.print.Collation;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by LiuLubao on 2018/3/7.
 */
public class Test {
    public static void main(String[] args){
//        int[] t = {-1, 0, 1, 2, -1, -4};
//        int[] t={0,0,0};
//        int[] t={1,2,-2,-1};
        int[] t={-1,0,1,2,-1,-4};
//        List<Integer> i= new LinkedList<Integer>();
//        i.add(5);
//        i.add(1);
//        i.add(7);
//        Collections.sort(i);
        System.out.println(new Solution().threeSum(t));
    }
}
