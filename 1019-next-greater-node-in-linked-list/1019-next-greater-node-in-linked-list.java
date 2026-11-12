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
    public int[] nextLargerNodes(ListNode head) {
        Stack<Integer>stack=new Stack<>();
        ArrayList<Integer>list=new ArrayList<>();
        while(head!=null)
        {
            list.add(head.val);
            head=head.next;
        }
        int l[]=new int[list.size()];
        stack.push(list.get(list.size()-1));
        for(int i=list.size()-2;i>=0;i--)
        {
            if(list.get(i)<stack.peek())
            {
                l[i]=stack.peek();
            }
            else
            {
                while(!stack.isEmpty()&&stack.peek()<=list.get(i))
                {
                    stack.pop();
                }
                if(!stack.isEmpty())
                {
                    l[i]=stack.peek();
                }
            }
            stack.push(list.get(i));
        }
        return l;
    }
}