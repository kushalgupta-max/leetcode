class Solution {
    public long countSubarrays(int[] l, int minK, int maxK) {
        int n=l.length;
        long count=0;
        int i=0;
        int j=0;
        while(i<n)
        {
            if(l[i]<minK||l[i]>maxK)
            {
                count=count+(long)(i-j)*(i-j+1)/2;
                j=i+1;
            }
            i++;
        }
        if(l[n-1]>=minK&&l[n-1]<=maxK)
        {
            count=count+(i-j)*(long)(i-j+1)/2;
        }
        return count;
    }
}