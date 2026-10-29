class Solution {
    public String minRemoveToMakeValid(String s) {
        int n=s.length();
        Stack<Character>stack=new Stack<>();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='(')
            {
                stack.push(s.charAt(i));
                list.add(i);
            }
            else if(s.charAt(i)==')')
            {
                if(!stack.isEmpty()&&stack.peek()=='(')
                {
                    list.remove(list.size()-1);
                    stack.pop();
                }
                else
                {
                    list.add(i);
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)!='('&&s.charAt(i)!=')')
            {
                sb.append(s.charAt(i));
            }
            else if(s.charAt(i)=='(')
            {
                if(list.contains(i))
                {
                    list.remove(Integer.valueOf(i));
                }
                else
                {
                    sb.append(s.charAt(i));
                }
            }
            else
            {
                if(list.contains(i))
                {
                    list.remove(Integer.valueOf(i));
                }
                else
                {
                    sb.append(s.charAt(i));
                }
            }
        }
        String t=new String(sb);
        return t;
    }
}