class Solution {
    public String removeKdigits(String s, int k) {
        int n=s.length();
        if(n==k)
        {
            return "0";
        }
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
        }
        while(x<k)
        {
            stack.pop();
            x++;
        }
        StringBuilder sb=new StringBuilder();
        for(int i:stack)
        {
            sb.append(i);
        }
        int i=0;
        while(!sb.isEmpty()&&sb.charAt(i)=='0')
        {
            sb.deleteCharAt(i);
        }
        if(sb.isEmpty())
        {
            return "0";
        }
        String t=new String(sb);
        return t;
    }
}