class Solution {
    public String reverseVowels(String s) {
        int n=s.length();
        char l[]=s.toCharArray();
        HashSet<Character>set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('I');
        set.add('A');
        set.add('U');
        set.add('O');
        set.add('E');
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<n;i++)
        {
            if(set.contains(l[i]))
            {
                stack.push(l[i]);
            }
        }
        for(int i=0;i<n;i++)
        {
            if(set.contains(l[i]))
            {
                l[i]=stack.pop();
            }
        }
        String str = new String(l);
        return str;
    }
}