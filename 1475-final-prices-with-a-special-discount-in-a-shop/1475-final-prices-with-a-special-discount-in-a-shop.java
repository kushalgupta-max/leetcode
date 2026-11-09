class Solution {
    public int[] finalPrices(int[] l) {
        int n=l.length;
        int k[]=new int[n];
        Stack<Integer>stack=new Stack<>();
        k[n-1]=l[n-1];
        stack.push(l[n-1]);
        for(int i=n-2;i>=0;i--)
        {
            if(stack.peek()<=l[i])
            {
                k[i]=Math.abs(l[i]-stack.peek());
            }
            else
            {
                while(!stack.isEmpty()&&stack.peek()>l[i])
                {
                    stack.pop();
                }
                if(stack.isEmpty())
                {
                    k[i]=l[i];
                }
                else
                {
                    k[i]=Math.abs(l[i]-stack.peek());
                }
            }
            stack.push(l[i]);
        }
        return k;
    }
}