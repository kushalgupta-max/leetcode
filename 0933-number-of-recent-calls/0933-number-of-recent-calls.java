class RecentCounter {
    Queue<Integer>queue=new LinkedList<>();
    int x=0;
    public RecentCounter() {
        
    }
    
    public int ping(int t) {
        queue.offer(t);
        x=t-queue.peek();
        while(!queue.isEmpty()&&x>3000)
        {
            queue.remove();
            if(!queue.isEmpty())
            x=t-queue.peek();
        }
        return queue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */