class Solution {
    public int[] dailyTemperatures(int[] l) {
        int n=l.length;
        Stack<Integer>stack=new Stack<>();
        stack.push(n-1);
        int k[]=new int[n];
        for(int i=n-2;i>=0;i--)
        {
            if(l[stack.peek()]>l[i])
            {
                k[i]=stack.peek()-i;
            }
            else
            {
                while(!stack.isEmpty()&&l[stack.peek()]<=l[i])
                {
                    stack.pop();
                }
                if(!stack.isEmpty())
                {
                    k[i]=stack.peek()-i;
                }
            }
            stack.push(i);
        }
        return k;
    }
}