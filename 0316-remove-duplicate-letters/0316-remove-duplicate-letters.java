class Solution {
    public String removeDuplicateLetters(String s) {
        int n=s.length();
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(s.charAt(i),i);
        }
        HashMap<Character,Boolean>set=new HashMap<>();
        for(char ch='a';ch<='z';ch++)
        {
            set.put(ch,false);
        }
        Stack<Character>stack=new Stack<>();
        stack.push(s.charAt(0));
        set.put(s.charAt(0),true);
        for(int i=1;i<n;i++)
        {
            if(set.get(s.charAt(i))==false)
            {
            if(stack.peek()<s.charAt(i))
            {
                stack.push(s.charAt(i));
                set.put(s.charAt(i),true);
            }
            else if(stack.peek()>=s.charAt(i))
            {
                while(!stack.isEmpty()&&stack.peek()>=s.charAt(i)&&map.get(stack.peek())>i)
                {
                    set.put(stack.peek(),false);
                    stack.pop();
                }
                stack.push(s.charAt(i));
                set.put(s.charAt(i),true);
            }
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char a:stack)
        {
            sb.append(a);
        }
        String t=new String(sb);
        return t;
    }
}