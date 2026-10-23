class Solution {
    public String removeOuterParentheses(String s) {
        char l[]=s.toCharArray();
        int n=l.length;
        int x=0;
        ArrayList<Character>list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(l[i]=='(')
            {
                if(x!=0)
                {
                    list.add(l[i]);
                }
                x++;
            }
            else
            {
                x--;
                if(x!=0)
                {
                    list.add(l[i]);
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char i:list)
        {
            sb.append(i);
        }
        String t=new String(sb);
        return t;
    }
}