class Solution {
    public int countStudents(int[] l, int[] k) {
        int n=l.length;
        Queue<Integer>queue=new LinkedList<>();
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            queue.offer(l[i]);
            q.offer(k[i]);
        }
        int x=0;
        while(!q.isEmpty())
        {
            if(q.peek()==queue.peek())
            {
                q.remove();
                queue.remove();
                x=0;
            }
            else
            {
                queue.offer(queue.remove());
                x++;
            }
            if(x==queue.size())
            {
                return queue.size();
            }
        }
        return 0;
    }
}