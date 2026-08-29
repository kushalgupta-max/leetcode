class Solution {
    public long koko(int mid,int l[],int n)
    {
        long count=0;
        for(int i=0;i<=n;i++)
        {
            int v=l[i];
            count = count + ((v + mid - 1) / mid);
        }
        return count;
    }
    public int minEatingSpeed(int[] l, int h) {
        int n=l.length-1;
        int ms=0;
        for(int i=0;i<=n;i++)
        {
            if(ms<l[i])
            {
                ms=l[i];
            }
        }
        int start=1;
        int end=ms;
        int x=0;
        int mid=0;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            long count=koko(mid,l,n);
            if(count>h)
            {
                start=mid+1;
            }
            else
            {
                x=mid;
                end=mid-1;
            }
        }
    return x;
    }
}