class Solution {
    public int timeRequiredToBuy(int[] l, int k) {
        int n=l.length;
        Queue<Integer>queue=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            queue.offer(l[i]);
        }
        int count=0;
        int x=k;
        while(!queue.isEmpty())
        {
            int v=queue.peek()-1;
            x--;
            count++;
            if(v!=0)
            {
                queue.offer(queue.remove()-1);
            }
            else
            {
                if(x==-1)
                {
                    return count;
                }
                queue.remove();
            }
            if(x==-1)
            {
                x=queue.size()-1;
            }
        }
        return count;
    }
}