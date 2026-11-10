class Solution {
    public int[] nextGreaterElements(int[] l) {
        int n=l.length;
        int k[]=new int[n];
        for(int i=0;i<n;i++)
        {
            k[i]=-1;
        }
        Stack<Integer>stack=new Stack<>();
        stack.push(l[n-1]);
        for(int i=n-2;i>=0;i--)
        {
            stack.push(l[i]);
        }
        for(int i=n-1;i>=0;i--)
        {
            if(stack.peek()>l[i])
            {
                k[i]=stack.peek();
            }
            else
            {
                while(!stack.isEmpty()&&stack.peek()<=l[i])
                {
                    stack.pop();
                }
                if(!stack.isEmpty())
                {
                    k[i]=stack.peek();
                }
            }
            stack.push(l[i]);
        }
        return k;
    }
}