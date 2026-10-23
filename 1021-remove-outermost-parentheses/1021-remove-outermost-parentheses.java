class Solution {
    public String removeOuterParentheses(String s) {
        char l[]=s.toCharArray();
        int n=l.length;
        int x=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            if(l[i]=='(')
            {
                if(x!=0)
                {
                    sb.append(l[i]);
                }
                x++;
            }
            else
            {
                x--;
                if(x!=0)
                {
                    sb.append(l[i]);
                }
            }
        }
        String t=new String(sb);
        return t;
    }
}