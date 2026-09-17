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
    public ListNode reverse(ListNode temp)
    {
        if(temp==null||temp.next==null)
        {
            return temp;
        }
        ListNode newhead=reverse(temp.next);
        temp.next.next=temp;
        temp.next=null;
        return newhead;
    }
    public ListNode reverseList(ListNode head) {
        return reverse(head);
    }
}