class Solution {
    public String minRemoveToMakeValid(String s) {
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
            else if(s.charAt(i)==')')
            {
                if(!stack.isEmpty()&&s.charAt(stack.peek())=='(')
                {
                    l[stack.peek()]=false;
                    stack.pop();
                }
                else if(stack.isEmpty()||s.charAt(stack.peek())==')')
                {
                    stack.push(i);
                    l[i]=true;
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            if(l[i]!=true)
            {
                sb.append(s.charAt(i));
            }
        }
        String t=new String(sb);
        return t;
    }
}