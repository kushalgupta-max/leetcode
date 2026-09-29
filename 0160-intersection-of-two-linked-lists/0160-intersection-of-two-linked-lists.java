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
        for(int i=0;i<count-1;i++)
        {
            temp=headB;
            for(int j=0;j<pro-1;j++)
            {
                if(headA==temp)
                {
                    return headA;
                }
                temp=temp.next;
            }
            headA=headA.next;
        }
        return null;
    }
}