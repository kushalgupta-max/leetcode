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
    public int getDecimalValue(ListNode head) {
        ListNode tail=reverse(head);
        double r=0;
        int x=0;
        ListNode temp=tail;
        while(temp!=null)
        {
            r=r+(Math.pow(2,x)*(temp.val));
            temp=temp.next;
            x++;
        }
        return (int)r;
    }
}