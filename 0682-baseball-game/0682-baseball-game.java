class Solution {
    public int calPoints(String[] l) {
        int n=l.length;
        Stack<Integer>stk=new Stack<>();
        for(int i=0;i<n;i++)
        {
            if(l[i].equals("C"))
            {
                stk.pop();
            }
            else if(l[i].equals("D"))
            {
                stk.push(2*stk.peek());
            }
            else if(l[i].equals("+"))
            {
                int temp=stk.pop();
                int naive=temp+stk.peek();
                stk.push(temp);
                stk.push(naive);
            }
            else
            {
                stk.push(Integer.parseInt(l[i]));
            }
        }
        int sum=0;
        for(int i:stk)
        {
            sum=sum+i;
        }
        return sum;
    }
}