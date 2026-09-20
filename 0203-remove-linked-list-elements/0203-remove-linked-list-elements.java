class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode start=head;
        if(head==null)
        {
            return null;
        }
        while(head.val==val)
        {
            start=head;
            head=head.next;
            start.next=null;
            if(head==null)
            {
                return null;
            }
        }
        ListNode temp=head;
        if(temp.next==null)
        {
            if(temp.val==val)
            {
                return null;
            }
            else
            {
                return head;
            }
        }
        while(temp.next!=null)
        {
            ListNode end=temp.next;
            if(temp.next.val==val)
            {
                temp.next=temp.next.next;
                end.next=null;
            }
            else
            temp=temp.next;
        }
        return head;
    }
}