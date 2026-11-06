class MyStack {
    Queue<Integer>queue=new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        queue.offer(x);
        int v=queue.size()-1;
        while(v-->0)
        {
            int peek=queue.peek();
            queue.remove();
            queue.offer(peek);
        }
    }
    
    public int pop() {
        int i=queue.remove();
        return i;
    }
    
    public int top() {
        return queue.peek();
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */