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
    public int getDecimalValue(ListNode head) {
        ListNode temp=head;
        int count=1;
        while(temp.next!=null)
        {
            count++;
            temp=temp.next;
        }
        int x=1;
        temp=head;
        double sum=0;
        while(temp!=null)
        {
            sum=sum+(Math.pow(2,count-x)*(temp.val));
            temp=temp.next;
            x++;
        }
        return (int)sum;
    }
}