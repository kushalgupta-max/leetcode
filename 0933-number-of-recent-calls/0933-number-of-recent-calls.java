class RecentCounter {
    int x=0;
    private Queue<Integer> queue=new LinkedList<>();
    public RecentCounter() {
        
    }
    
    public int ping(int t) {
        if(!queue.isEmpty())
        {
            x=t-queue.peek();
        }  
        while(!queue.isEmpty()&&x>3000)
        {
            queue.remove();
            if(!queue.isEmpty())
            x=t-queue.peek();
        }
        queue.offer(t);
        return queue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */