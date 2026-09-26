
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null)
        {
            return null;
        }
        if(head.next==null)
        {
            return head;
        }
        ListNode fast=head.next;
        ListNode slow=head;
        ListNode temp=null;
        head=fast;
        do
        {
            slow.next=fast.next;
            if(temp!=null)
            {
                temp.next=fast;
            }
            fast.next=slow;
            temp=slow;
            slow=slow.next;
            if(slow==null)
            {
                break;
            }
            fast=slow.next;
        }while(fast!=null);
        return head;
    }
}