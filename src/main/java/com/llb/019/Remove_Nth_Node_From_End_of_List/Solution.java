package Remove_Nth_Node_From_End_of_List;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LiuLubao on 2018/3/9.
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode l = head;
        List<ListNode> result = new ArrayList<ListNode>();
        int i=0;
        while(head!=null){
            result.add(head);
            head=head.next;
            i++;
        }
        if(n==i){
            ListNode li=result.get(0);
            l=li.next;
        }else{
            i--;
            ListNode li=result.get(i-n);
            li.next=li.next.next;
        }

        return l;
    }
}
