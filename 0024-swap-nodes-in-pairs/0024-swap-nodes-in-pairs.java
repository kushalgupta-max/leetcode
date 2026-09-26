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
    public ListNode swapPairs(ListNode head) {
        if(head==null)
        {
            return null;
        }
        if(head.next==null)
        {
            return head;
        }
        ListNode temp=head.next;
        head.next=temp.next;
        temp.next=head;
        head=temp;
        temp=head.next;
        if(temp.next==null)
        {
            return head;
        }
        ListNode fast=temp.next.next;
        ListNode slow=temp.next;
        while(fast!=null)
        {
            slow.next=fast.next;
            temp.next=fast;
            fast.next=slow;
            temp=slow;
            slow=slow.next;
            if(fast.next.next==null)
            {
                break;
            }
            fast=fast.next.next.next;
        }
        return head;
    }
}