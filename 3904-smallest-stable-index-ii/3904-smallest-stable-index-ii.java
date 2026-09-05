class Solution {
    public int firstStableIndex(int[] l, int k) {
        int n=l.length-1;
        int min[]=new int[n+1];
        min[n]=l[n];
        for(int i=n-1;i>=0;i--)
        {
            if(l[i]>min[i+1])
            {
                min[i]=min[i+1];
            }
            else
            {
                min[i]=l[i];
            }
        }
        int x=0;
        for(int i=0;i<=n;i++)
        {
            if(i==0)
            {
                x=l[0];
            }
            else
            {
                if(x<l[i])
                {
                    x=l[i];
                }
            }
            int count=x-min[i];
            if(count<=k)
            {
                return i;
            }
        }
        return -1;
    }
}