class MyQueue {
    Stack<Integer>stack=new Stack<>();
    Stack<Integer>stk=new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        stack.push(x);
    }
    
    public int pop() {
        if(stk.isEmpty()){
        while(!stack.isEmpty())
        {
            stk.push(stack.pop());
        }
        }
        int x=stk.pop();
        return x;
    }
    
    public int peek() {
        if(stk.isEmpty())
        {
        while(!stack.isEmpty())
        {
            stk.push(stack.pop());
        }
        }
        int x=stk.peek();
        return x;
    }
    
    public boolean empty() {
        return stack.isEmpty()&&stk.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */