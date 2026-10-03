/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node node=new Node(100);
        Node temp=head;
        Node newhead=node;
        HashMap<Node,Node>map=new HashMap<>();
        while(temp!=null)
        {
            Node rax=new Node(temp.val);
            node.next=rax;
            node=node.next;
            map.put(temp,rax);
            temp=temp.next;
        }
        newhead=newhead.next;
        Node tail=newhead;
        while(tail!=null)
        {
            tail.random=map.get(head.random);
            head=head.next;
            tail=tail.next;
        }
        return newhead;
    }
}