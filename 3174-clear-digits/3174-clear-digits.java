class Solution {
    public String clearDigits(String s) {
        int n=s.length();
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<n;i++)
        {
            if(!Character.isDigit(s.charAt(i)))
            {
                stack.push(s.charAt(i));
            }
            else
            {
                if(!stack.isEmpty())
                {
                    stack.pop();
                }
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