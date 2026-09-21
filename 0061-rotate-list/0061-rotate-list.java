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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
        {
            return null;
        }
        int x=1;
        int count=0;
        ListNode tail=head;
        while(tail.next!=null)
        {
            count++;
            tail=tail.next;
        }
        count++;
        k=k%count;
        if(k==0)
        {
            return head;
        }
        k=count-k;
        ListNode temp=head;
        while(x<k)
        {
            temp=temp.next;
            x++;
        }
        ListNode newhead=temp.next;
        temp.next=null;
        tail.next=head;
        return newhead;
    }
}