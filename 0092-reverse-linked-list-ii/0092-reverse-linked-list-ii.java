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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp=head;
        int count=1;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        temp=head;
        int l[]=new int[count];
        int x=0;
        while(temp!=null)
        {
            l[x]=temp.val;
            temp=temp.next;
            x++;
        }
        int swap=0;
        int i=left-1;
        int j=right-1;
        while(i<j)
        {
            swap=l[i];
            l[i]=l[j];
            l[j]=swap;
            i++;
            j--;
        }
        temp=head;
        x=0;
        while(temp!=null)
        {
            temp.val=l[x];
            x++;
            temp=temp.next;
        }
        return head;
    }
}