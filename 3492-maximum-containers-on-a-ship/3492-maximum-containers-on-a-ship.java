class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int count=0;
        int v=0;
        while(v<maxWeight&&count<(n*n))
        {
            v=w+v;
            count++;
        }
        if(v>maxWeight||count>(n*n))
        {
            count--;
        }
        return count;
    }
}