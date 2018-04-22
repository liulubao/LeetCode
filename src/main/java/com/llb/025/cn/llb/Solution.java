package cn.llb;

/**
 * Created by LiuLubao on 2018/4/21.
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode result =null;
        ListNode last = null;
        ListNode midlast = null;
        ListNode midhead = null;
        boolean TAG = true;
        while(head!=null){
            ListNode mid = head;
            TAG=true;
            for(int i=0;i<k;i++){
                if(mid ==  null){
                    TAG=false;
                    break;
                }
                mid=mid.next;
            }
            if(TAG==false){
                if(last==null){
                    return head;
                }else{
                    last.next = head;
                    return result;
                }
            }else{
                midlast=head;
                head=head.next;
                midlast.next=null;
                midhead=midlast;
                for(int i=1;i<k;i++){
                    mid=head;
                    head=head.next;
                    mid.next=midhead;
                    midhead=mid;
                }
                if(last==null){
                    result=midhead;
                    last=midlast;
                }else{
                    last.next=midhead;
                    last=midlast;
                }

            }
//            System.out.println("result:"+head!=null);
        }
        return result;
    }
}
