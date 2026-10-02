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
    public ListNode reverseList(ListNode head) {
        if(head==null)
        {
            return null;
        }
        if(head.next==null)
        {
            return head;
        }
        ListNode cur=head;
        ListNode pre=null;
        ListNode nxt=cur.next;
        while(nxt!=null&&cur!=null)
        {
            nxt=cur.next;
            cur.next=pre;
            pre=cur;
            cur=nxt;
        }
        return pre;
    }
}