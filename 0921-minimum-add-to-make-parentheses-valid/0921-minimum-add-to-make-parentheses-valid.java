class Solution {
    public int minAddToMakeValid(String s) {
        int n=s.length();
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='(')
            {
                stack.push(s.charAt(i));
            }
            else
            {
                if(stack.isEmpty())
                {
                    stack.push(s.charAt(i));
                }
                else
                {
                if(stack.peek()=='(')
                {
                    stack.pop();
                }
                else
                {
                    stack.push(s.charAt(i));
                }
                }
            }
        }
        return stack.size();
    }
}