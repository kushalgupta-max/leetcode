class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        Stack<Character>stk=new Stack<>();
        stk.push('a');
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
            {
                stk.push(s.charAt(i));
            }
            else if(s.charAt(i)==')')
            {
                if(stk.peek()!='(')
                {
                    return false;
                }
                else
                {
                    stk.pop();
                }
            }
            else if(s.charAt(i)=='}')
            {
                if(stk.peek()!='{')
                {
                    return false;
                }
                else
                {
                    stk.pop();
                }
            }
            else if(s.charAt(i)==']')
            {
                if(stk.peek()!='[')
                {
                    return false;
                }
                else
                {
                    stk.pop();
                }
            }
        }
        if(stk.peek()!='a')
        {
            return false;
        }
        return true;
    }
}