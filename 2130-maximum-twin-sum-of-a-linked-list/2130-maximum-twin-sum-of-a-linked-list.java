/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverse(ListNode head)
    {
        if(head==null||head.next==null)
        {
            return head;
        }
        ListNode newhead=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;
    }
    public int pairSum(ListNode head) {
        ListNode fast=head.next;
        ListNode slow=head;
        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode temp=slow.next;
        slow.next=null;
        ListNode newhead=reverse(temp);
        int ms=0;
        int sum=0;
        while(newhead!=null)
        {
            sum=newhead.val+head.val;
            if(ms<sum)
            {
                ms=sum;
            }
            newhead=newhead.next;
            head=head.next;
        }
        return ms;
    }
}