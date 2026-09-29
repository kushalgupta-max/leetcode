/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int count=1;
        int pro=1;
        ListNode temp=headA;
        ListNode tail=headB;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        while(tail!=null)
        {
            pro++;
            tail=tail.next;
        }
        int x=1;
        if(pro>count)
        {
            pro=pro-count;
            while(x<=pro)
            {
                x++;
                headB=headB.next;
            }
        }
        else
        {
            count=count-pro;
            while(x<=count)
            {
                x++;
                headA=headA.next;
            }
        }
        while(headA!=null)
        {
            if(headA==headB)
            {
                return headA;
            }
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }
}