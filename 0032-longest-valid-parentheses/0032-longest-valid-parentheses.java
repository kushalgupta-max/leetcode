class Solution {
    public int longestValidParentheses(String s) {
        int n=s.length();
        Stack<Integer>stack=new Stack<>();
        boolean l[]=new boolean[n];
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='(')
            {
                stack.push(i);
                l[i]=true;
            }
            else
            {
                if(!stack.isEmpty()&&s.charAt(stack.peek())=='(')
                {
                    l[stack.peek()]=false;
                    l[i]=false;
                    stack.pop();
                }
                else
                {
                     l[i]=true;
                }
            }
        }
        int count=0;
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(l[i]==false)
            {
                count++;
            }
            else
            {
                count=0;
            }
            if(max<count)
            {
                max=count;
            }
        }
        return max;
    }
}