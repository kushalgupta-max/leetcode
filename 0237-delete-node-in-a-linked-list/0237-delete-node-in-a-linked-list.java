/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        int swap=0;
        while(node.next!=null)
        {
            swap=node.val;
            node.val=node.next.val;
            node.next.val=swap;
            if(node.next.next==null)
            {
                node.next=null;
                break;
            }
            node=node.next;
        }
    }
}