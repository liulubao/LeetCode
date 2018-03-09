package Remove_Nth_Node_From_End_of_List;

/**
 * Created by LiuLubao on 2018/3/9.
 */
public class Te {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        while(cur.next != null && n > 0) {
            System.out.println(cur.val);
            cur = cur.next;
            n--;
        }
        ListNode tmp = dummy;
        while(cur.next != null) {
            System.out.println(tmp.val);
            tmp = tmp.next;
            cur = cur.next;
        }
        tmp.next = tmp.next.next;
        return dummy.next;
    }
}
