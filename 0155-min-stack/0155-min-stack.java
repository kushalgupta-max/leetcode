class MinStack {
    private Stack<Integer>stack=new Stack<>();
    private Stack<Integer>stk=new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int value) {
        stack.push(value);
        if(stk.empty())
        {
            stk.push(value);
        }
        else if(stk.peek()>=stack.peek())
        {
            stk.push(stack.peek());
        }
    }
    
    public void pop() {
        if(stack.peek().equals(stk.peek()))
        {
            stk.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return stk.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */