class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        n=n*n;
        int r=maxWeight/w;
        if(r>n)
        {
            return n;
        }
        return r;
    }
}