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
 class ll
 {
    ListNode head=null;
    ListNode tail=null;
    public ListNode merge(ListNode l1,ListNode l2)
    {
        while(l1!=null&&l2!=null)
        {
        if(l1.val<l2.val)
        {
            ListNode node=l1;
            if(head==null)
            {
                head=node;
                tail=node;
            }
            else
            {
                tail.next=node;
                tail=node;
            }
            l1=l1.next;
        }
        else
        {
            ListNode node=l2;
            if(head==null)
            {
                head=node;
                tail=node;
            }
            else
            {
                tail.next=node;
                tail=node;
            }
            l2=l2.next;
        }
        }
        if(l1!=null)
        {
            tail.next=l1;
        }
        if(l2!=null)
        {
            tail.next=l2;
        }
        return head;
    }
 }
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null)
        {
            return list2;
        }
        else if(list2==null)
        {
            return list1;
        }
        ll obj=new ll();
        ListNode newhead=obj.merge(list1,list2);
        return newhead;
    }
}