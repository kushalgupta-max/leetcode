class Solution {
    public int threshold(int mid,int l[],int n,int t)
    {
        long count=0;
        for(int i=0;i<=n;i++)
        {
            long v=l[i];
            count=count+((v+mid-1)/mid);
        }
        if(count<=t)
        {
            return 0;
        }
        return -1;
    }
    public int smallestDivisor(int[] l, int t) {
        int n=l.length-1;
        int ms=Integer.MIN_VALUE;
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
            int count=threshold(mid,l,n,t);
            if(count==0)
            {
                x=mid;
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return x;
    }
}