class Solution {
    public int longestMonotonicSubarray(int[] l) {
        int n=l.length;
        int max=1;
        int count=1;
        for(int i=0;i<n-1;i++)
        {
            if(l[i]<l[i+1])
            {
                count++;
            }
            else
            {
                count=1;
            }
            if(count>max)
            {
                max=count;
            }
        }
        count=1;
        for(int i=0;i<n-1;i++)
        {
            if(l[i]>l[i+1])
            {
                count++;
            }
            else
            {
                count=1;
            }
            if(count>max)
            {
                max=count;
            }
        }
        return max;
        
    }
}