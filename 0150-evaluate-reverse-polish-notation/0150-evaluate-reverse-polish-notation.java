class Solution {
    public int evalRPN(String[] l) {
        int n=l.length;
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<n;i++)
        {
            if(!l[i].equals("/")&&!l[i].equals("*")&&!l[i].equals("+")&&!l[i].equals("-"))
            {
                stack.push(Integer.parseInt(l[i]));
            }
            else if(l[i].equals("+"))
            {
                int x=stack.peek();
                stack.pop();
                int y=stack.peek();
                stack.pop();
                stack.push(x+y);
            }
            else if(l[i].equals("-"))
            {
                int x=stack.peek();
                stack.pop();
                int y=stack.peek();
                stack.pop();
                stack.push(y-x);
            }
            else if(l[i].equals("*"))
            {
                int x=stack.peek();
                stack.pop();
                int y=stack.peek();
                stack.pop();
                stack.push(x*y);
            }
            else
            {
                int x=stack.peek();
                stack.pop();
                int y=stack.peek();
                stack.pop();
                stack.push(y/x);
            }
        }
        return stack.peek();
    }
}