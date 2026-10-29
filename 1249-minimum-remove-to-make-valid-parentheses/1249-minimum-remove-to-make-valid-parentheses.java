class Solution {
    public String minRemoveToMakeValid(String s) {
        int n=s.length();
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='(')
            {
                stack.push(i);
            }
            else if(s.charAt(i)==')')
            {
                if(!stack.isEmpty()&&s.charAt(stack.peek())=='(')
                {
                    stack.pop();
                }
                else if(stack.isEmpty()||s.charAt(stack.peek())==')')
                {
                    stack.push(i);
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)!='('&&s.charAt(i)!=')')
            {
                sb.append(s.charAt(i));
            }
            else if(!stack.contains(i))
            {
                sb.append(s.charAt(i));
            }
        }
        String t=new String(sb);
        return t;
    }
}