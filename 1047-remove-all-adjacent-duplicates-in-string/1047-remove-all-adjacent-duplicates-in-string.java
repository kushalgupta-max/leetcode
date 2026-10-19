class Solution {
    public String removeDuplicates(String s) {
        int n=s.length();
        Stack<Character>stk=new Stack<>();
        for(int i=0;i<n;i++)
        {
            if(stk.empty()==true)
            {
                stk.push(s.charAt(i));
            }
            else if(s.charAt(i)!=stk.peek())
            {
                stk.push(s.charAt(i));
            }
            else
            {
                stk.pop();
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char i:stk)
        {
            sb.append(i);
        }
        return sb.toString();
    }
}