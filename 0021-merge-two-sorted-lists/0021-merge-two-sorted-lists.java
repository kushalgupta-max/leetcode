class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp=new ListNode(100);
        ListNode tail=temp;
        while(list1!=null&&list2!=null)
        {
        if(list1.val<list2.val)
        {
            ListNode node=list1;
            tail.next=node;
            tail=tail.next;
            list1=list1.next;
        }
        else
        {
            ListNode node=list2;
            tail.next=node;
            tail=tail.next;
            list2=list2.next;
        }
        }
        tail.next=(list1!=null)?list1:list2;
        return temp.next;
    }
}