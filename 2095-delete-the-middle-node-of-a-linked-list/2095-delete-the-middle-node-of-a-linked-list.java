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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null)
        {
            return null;
        }
        ListNode fast=head.next.next;
        ListNode slow=head.next;
        ListNode pre=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            pre=pre.next;
            fast=fast.next.next;
        }
        pre.next=slow.next;
        return head;
    }
}