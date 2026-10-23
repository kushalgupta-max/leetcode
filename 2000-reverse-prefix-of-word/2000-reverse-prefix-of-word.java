class Solution {
    public String reversePrefix(String s, char ch) {
        char l[]=s.toCharArray();
        int n=l.length;
        Stack<Character>stack=new Stack<>();
        int i=0;
        while(l[i]!=ch)
        {
            stack.push(l[i]);
            i++;
            if(i==n)
            {
                return s;
            }
        }
        stack.push(l[i]);
        for(int j=0;j<=i;j++)
        {
            l[j]=stack.pop();
        }
        String sb=new String(l);
        return sb;
    }
}