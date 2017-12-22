package Add_Two_Numbers002;

/**
 * Created by LiuLubao on 2017/12/20.
 */
public class Solution1 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode lr=null;
        ListNode mr=null;
        String s1 = new String("");
        String s2 = new String("");
        while(l1!=null){
            s1=l1.val+s1;
            l1=l1.next;
        }
        while (l2!=null){
            s2=l2.val+s2;
            l2=l2.next;
        }
        long i1 = Long.parseLong(s1);
        long i2 = Long.parseLong(s2);
        long result = i1+i2;
        while(result>0){
            if(mr==null){
                mr=new ListNode((int)result%10);
                lr=mr;
            }else{
                mr.next=new ListNode((int)result%10);
                mr=mr.next;
            }
            result=result/10;
        }

//        while(result>0){
//            if(lr==null){
//                mr = new ListNode(result%10);
//                lr=mr;
//            }else{
//                mr.next=new ListNode(result%10);
//                mr=mr.next;
//            }
//            mr=mr.next;
//            result=result/10;
//        }
        return lr;
    }

}
