package Remove_Nth_Node_From_End_of_List;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LiuLubao on 2018/3/9.
 */
public class Test {
    public static void main(String[] args){
        ListNode l = new ListNode(5);
        List<ListNode> result = new ArrayList<ListNode>();
        ListNode l1 = l;
        l.next=new ListNode(4);
        l=l.next;
        l.next=new ListNode(3);
        l=l.next;
        l.next=new ListNode(2);
        l=l.next;
        l.next=new ListNode(6);
        l=l.next;
        l.next=new ListNode(7);
        l=l.next;
        l.next=new ListNode(8);
        l=l1;
//        int i=0;
//        ListNode dummy = new ListNode(0);
//        dummy.next=l;
//        ListNode cur = dummy;
////        int n=;
//        cur.next=cur.next.next;
//        while(cur != null) {
//            System.out.println(cur.val);
////            tmp = tmp.next;
//            cur = cur.next;
//        }
//        ListNode tmp = dummy;
//        while(tmp != null) {
//            System.out.println(tmp.val);
//            tmp = tmp.next;
////            cur = cur.next;
//        }


        ListNode dummy = new ListNode(0);
        dummy.next = l;
        ListNode cur = dummy;
        int n=3;
        while(cur.next != null ) {
            System.out.println(cur.val);
            cur = cur.next;
//            n--;
        }
        ListNode tmp = dummy;
        while(tmp.next != null) {
            System.out.println(tmp.val);
            tmp = tmp.next;
//            cur = cur.next;
        }
        tmp.next = tmp.next.next;
//        return dummy.next;


//        ListNode n = new Te().removeNthFromEnd(l,2);
//        while(n!=null){
//            System.out.println(n.val);
//            n=n.next;
//        }
//        while(l1!=null){
//            System.out.println(l1.val);
//            l1=l1.next;
//        }
    }
}
