class Solution {
    public String makeGood(String s) {
        int n=s.length();
        Stack<Character>stack=new Stack<>();
        stack.push(s.charAt(0));
        for(int i=1;i<n;i++)
        {
            if(!stack.isEmpty()&&Character.isLowerCase(stack.peek()))
            {
            if(s.charAt(i)==Character.toUpperCase(stack.peek()))
            {
                stack.pop();
            }
            else
            {
                stack.push(s.charAt(i));
            }
            }
            else if(!stack.isEmpty()&&Character.isUpperCase(stack.peek()))
            {
            if(s.charAt(i)==Character.toLowerCase(stack.peek()))
            {
                stack.pop();
            }
            else
            {
                stack.push(s.charAt(i));
            }  
            }
            else
            {
                stack.push(s.charAt(i));
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char i:stack)
        {
            sb.append(i);
        }
        String t=new String(sb);
        return t;
    }
}