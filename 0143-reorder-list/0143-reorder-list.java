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
    public void reorderList(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode news=slow.next;
        slow.next=null;
        ListNode newhead=reverse(news);
        ListNode temp=head;
        while(newhead!=null)
        {
            ListNode p=newhead;
            newhead=newhead.next;
            p.next=temp.next;
            temp.next=p;
            temp=p.next;
        }
    }
}