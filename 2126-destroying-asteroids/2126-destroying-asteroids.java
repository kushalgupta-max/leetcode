class Solution {
    public boolean asteroidsDestroyed(int mass, int[] l) {
    int n=l.length;
    Arrays.sort(l);
    int i=0;
    long v=mass;
        while(i<n&&v>=l[i])
        {
            v=v+l[i];
            i++;
        }
    if(i==n)
    {
        return true;
    }
    return false;
    }
}