class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        Stack<Character>stack=new Stack<>();
        int x=1;
        for(int i=1;i<n;i++)
        {
            if(s.charAt(i)=='(')
            {
                if(x!=0)
                {
                    stack.push(s.charAt(i));
                }
                x++;
            }
            else
            {
                x--;
                if(x!=0)
                {
                    stack.push(s.charAt(i));
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char i:stack)
        {
            sb.append(i);
        }
        String j=new String(sb);
        return j;
    }
}