
class Solution {
    public int pairSum(ListNode head) {
        ListNode fast=head.next;
        ListNode slow=head;
        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode temp=slow;
        slow=slow.next;
        temp.next=null;
        ListNode pre=null;
        while(slow!=null)
        {
            ListNode nxt=slow.next;
            slow.next=pre;
            pre=slow;
            slow=nxt;
        }
        int ms=0;
        int sum=0;
        while(pre!=null)
        {
            sum=pre.val+head.val;
            if(ms<sum)
            {
                ms=sum;
            }
            pre=pre.next;
            head=head.next;
        }
        return ms;
    }
}