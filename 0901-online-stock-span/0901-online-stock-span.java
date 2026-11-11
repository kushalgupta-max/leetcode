class StockSpanner {
    Stack<Integer>stack=new Stack<>();
    HashMap<Integer,Integer>map=new HashMap<>();
        int i=0;
    public StockSpanner() {
        
    }
    
    public int next(int l) {
        i++;
        map.put(l,i);
        if(!stack.isEmpty()&&stack.peek()>l)
        {
            stack.push(l);
            return 1;
        }
        else 
        {
            while(!stack.isEmpty()&&stack.peek()<=l)
            {
                stack.pop();
            }
            if(!stack.isEmpty())
            {
                int x=stack.peek();
                stack.push(l);
                return i-map.get(x);
            }
            else
            {
                stack.push(l);
                return i;
            }
        }
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */