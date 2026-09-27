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
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null||head.next.next==null)
        {
            return head;
        }
        ListNode tail=head;
        while(tail.next!=null)
        {
            tail=tail.next;
        }
        ListNode curr=head.next;
        ListNode pre=head;
        ListNode temp=head.next;
        do
        {
            pre.next=curr.next;
            curr.next=null;
            tail.next=curr;
            tail=tail.next;
            pre=pre.next;
            curr=pre.next;
        }
        while(temp!=pre&&curr!=temp);
        return head;
    }
}