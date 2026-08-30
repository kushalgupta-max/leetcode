class Solution {
    public int bloom(int mid,int l[],int j,int m,int n)
    {
        int count=0;
        int pro=0;
        for(int i=0;i<n;i++)
        {
            if(l[i]<=mid)
            {
                count++;
            }
            else
            {
                count=0;
            }
            if(count==j)
            {
                pro++;
                count=0;
            }
            if(pro==m)
            {
                return 1;
            }
        }
        return -1;
    }
    public int minDays(int[] l, int m, int k) {
        int n=l.length;
        long j=k*m;
        if(n<j)
        {
            return -1;
        }
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(ms<l[i])
            {
                ms=l[i];
            }
        }
        int start=1;
        int end=ms;
        int x=-1;
        int mid=0;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            int count=bloom(mid,l,k,m,n);
            if(count==1)
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