package Add_Two_Numbers002;

/**
 * Created by LiuLubao on 2017/12/20.
 */
public class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode lr=null;
//        ListNode mr = new ListNode();
        int mr = 0;
        int i=0;
        do{
//            System.out.println(i);
            mr+=i;
            if(l1!=null){
                mr+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                mr+=l2.val;
                l2=l2.next;
            }
            i=0;
            if(mr<=9){
                if(result==null){
                    result = new ListNode(mr);
                    lr=result;
                }else{
                    result.next=new ListNode(mr);
                    result=result.next;
                }
            }else{
                i=mr/10;
                if(result==null){
                    result = new ListNode(mr%10);
                    lr=result;
                }else{
                    result.next=new ListNode(mr%10);
                    result = result.next;
                }
            }
            mr=0;
        }while(i!=0||l1!=null||l2!=null);
        return lr;
    }
}
