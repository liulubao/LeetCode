package cn.llb;

/**
 * Created by LiuLubao on 2018/4/21.
 */
public class Test {
    public static void main(String[] args){
        ListNode l = new ListNode(1);
        ListNode s = l;
        l.next=new ListNode(2);
        l.next.next=new ListNode(3);
        l.next.next.next=new ListNode(4);
        l.next.next.next.next=new ListNode(5);
        l.next.next.next.next.next=new ListNode(6);
//        l=new Solution().swapPairs(l);
//        while(l!=null){
//            System.out.println(l.val);
//            l=l.next;
//        }
//        l=l.next;
//        if(l.next!=null){
//            ListNode e = l;
//            l=l.next;
//        }
//        while(s!=null){
//            System.out.println(s.val);
//            s=s.next;
//        }
        s=new Solution().reverseKGroup(l,3);
        System.out.println("------------------");
        while(s!=null){
            System.out.println(s.val);
            s=s.next;
        }
    }
}
