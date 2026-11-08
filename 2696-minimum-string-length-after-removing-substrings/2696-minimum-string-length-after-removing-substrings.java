class Solution {
    public int minLength(String s) {
        int n=s.length();
        Stack<Character>stack=new Stack<>();
        stack.push(s.charAt(0));
        int max=n;
        for(int i=1;i<n;i++)
        {
            if(stack.isEmpty())
            {
                stack.push(s.charAt(i));
            }
            else if(stack.peek()=='A'&&s.charAt(i)=='B'||stack.peek()=='C'&&s.charAt(i)=='D')
            {
                stack.pop();
            }
            else {
                stack.push(s.charAt(i));
            }
        }
        max=stack.size();
        return max;
    }
}