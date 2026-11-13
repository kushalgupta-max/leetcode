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
    public ListNode removeNodes(ListNode head) {
        ListNode temp=head;
        ArrayList<Integer>list=new ArrayList<>();
        while(temp!=null)
        {
            list.add(temp.val);
            temp=temp.next;
        }
        Stack<Integer>stack=new Stack<>();
        stack.push(list.get(list.size()-1));
        for(int i=list.size()-2;i>=0;i--)
        {
            if(list.get(i)>=stack.peek())
            {
                stack.push(list.get(i));
            }
        }
        ListNode tail=new ListNode(100);
        ListNode newhead=tail;
        while(!stack.isEmpty())
        {
            ListNode again=new ListNode(stack.pop());
            tail.next=again;
            tail=tail.next;
        }
        return newhead.next;
    }
}