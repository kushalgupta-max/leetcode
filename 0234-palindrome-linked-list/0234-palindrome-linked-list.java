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
    public boolean isPalindrome(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        int count=0;
        while(fast.next!=null&&fast.next.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            count++;
        }
        if(count%2==0)
        {
            ListNode n=slow;
            slow=slow.next;
            n.next=null;
        }
        else
        {
            ListNode p=slow;
            slow=slow.next;
            p.next=null;
        }
        ListNode rev=reverse(slow);
        while(rev!=null)
        {
            if(rev.val!=head.val)
            {
                return false;
            }
            rev=rev.next;
            head=head.next;
        }
        return true;
    }
}