class Solution {
    public String removeKdigits(String s, int k) {
        int n=s.length();
        Stack<Integer>stack=new Stack<>();
        stack.push(s.charAt(0)-'0');
        int x=0;
        for(int i=1;i<n;i++)
        {
            while(!stack.isEmpty()&&stack.peek()>s.charAt(i)-'0'&&x<k)
            {
                stack.pop();
                x++;
            }
            stack.push(s.charAt(i)-'0');
            if(stack.size()==1&&stack.peek()==0)
            {
                stack.pop();
            }
        }
        while(!stack.isEmpty()&&x<k)
        {
            stack.pop();
            x++;
        }
        if(stack.isEmpty())
        {
            return "0";
        }
        StringBuilder sb=new StringBuilder();
        for(int i:stack)
        {
            sb.append(i);
        }
        String t=new String(sb);
        return t;
    }
}