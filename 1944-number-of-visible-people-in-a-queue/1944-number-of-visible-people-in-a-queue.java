class Solution {
    public int[] canSeePersonsCount(int[] l) {
        int n=l.length;
        Stack<Integer>stack=new Stack<>();
        stack.push(l[n-1]);
        int ans[]=new int[n]; 
        for(int i=n-2;i>=0;i--)
        {
            if(stack.peek()>l[i])
            {
                ans[i]=1;
            }
            else
            {
                int count=0;
                while(!stack.isEmpty()&&l[i]>=stack.peek())
                {
                    stack.pop();
                    count++;
                }
                if(stack.isEmpty())
                    ans[i]=count;
                else
                    ans[i]=++count;
            }
            stack.push(l[i]);
        }
        return ans;
    }
}