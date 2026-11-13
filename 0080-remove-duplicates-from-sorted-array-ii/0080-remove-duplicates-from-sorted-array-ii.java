class Solution {
    public int removeDuplicates(int[] l) {
        int n=l.length;
        Stack<Integer>stack=new Stack<>();
        stack.push(l[0]);
        int x=1;
        for(int i=1;i<n;i++)
        {
            if(stack.peek()==l[i])
            {
                if(x<2)
                {
                    stack.push(l[i]);
                }
                x++;
            }
            else
            {
                x=1;
                stack.push(l[i]);
            }
        }
        int j=stack.size();
        int v=0;
        for(int i:stack)
        {
            l[v]=i;
            v++;
        }
        return j;
    }
}