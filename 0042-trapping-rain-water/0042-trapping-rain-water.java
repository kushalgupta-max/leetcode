class Solution {
    public int trap(int[] l) {
        int n=l.length;
        int i=0;
        int j=n-1;
        int lmax=0;
        int rmax=0;
        int total=0;
        int count=0;
        int res=0;
        while(i<j)
        {
            lmax=Math.max(lmax,l[i]);
            rmax=Math.max(rmax,l[j]);
            int v=Math.min(lmax,rmax);
            if(lmax<rmax)
            {
                res=v-l[i];
                i++;
            }
            else
            {
                res=v-l[j];
                j--;
            }
            count=count+res;
        }
        return count;
    }
}