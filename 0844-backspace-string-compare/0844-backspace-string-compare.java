class Solution {
    public boolean backspaceCompare(String s, String t) {
        int n=s.length();
        int m=t.length();
        Stack<Character>stk=new Stack<>();
        for(int i=0;i<n;i++)
        {
            if(stk.empty())
            {
                if(s.charAt(i)!='#')
                {
                    stk.push(s.charAt(i));
                }
            }
            else
            {
                if(s.charAt(i)!='#')
                {
                    stk.push(s.charAt(i));
                }
                else
                {
                    stk.pop();
                }
            }
        }
        Stack<Character>map=new Stack<>();
        for(int i=0;i<m;i++)
        {
            if(map.empty())
            {
                if(t.charAt(i)!='#')
                {
                    map.push(t.charAt(i));
                }
            }
            else
            {
                if(t.charAt(i)!='#')
                {
                    map.push(t.charAt(i));
                }
                else
                {
                    map.pop();
                }
            }
        }
        if(stk.size()!=map.size())
        {
            return false;
        }
        while(!stk.empty())
        {
            if(stk.peek()!=map.peek())
            {
                return false;
            }
            stk.pop();
            map.pop();
        }
        return true;
    }
}