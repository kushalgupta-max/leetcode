class Solution {
    public int sumSubarrayMins(int[] l) {
        int n=l.length;
        Stack<Integer>stack=new Stack<>();
        stack.push(0);
        int left[]=new int[n];
        int right[]=new int[n];
        left[0]=0;
        int mod=1000000007;
        for(int i=1;i<n;i++)
        {
                while(!stack.isEmpty()&&l[stack.peek()]>=l[i])
                {
                    stack.pop();
                }
                if(stack.isEmpty())
                {
                    left[i]=i;
                }
                else
                {
                    left[i]=stack.peek();
                }
            stack.push(i);
        }
        while(!stack.isEmpty())
        {
            stack.pop();
        }
        stack.push(n-1);
        right[n-1]=n-1;
        for(int i=n-2;i>=0;i--)
        {
                while(!stack.isEmpty()&&l[stack.peek()]>l[i])
                {
                    stack.pop();
                }
                if(stack.isEmpty())
                {
                    right[i]=i;
                }
                else
                {
                    right[i]=stack.peek();
                }
            stack.push(i);
        }
        long count=0;
        for(int i=0;i<n;i++)
        {
            int x=0;
            int y=0;
            if(i==left[i])
            {
                x=i+1;
            }
            else
            {
                x=i-left[i];
            }
            if(i==right[i])
            {
                y=n-i;
            }
            else
            {
                y=right[i]-i;
            }
            count=(count+(((long)x*y)*l[i])%mod)%mod;
        }
        return (int)count;
    }
}