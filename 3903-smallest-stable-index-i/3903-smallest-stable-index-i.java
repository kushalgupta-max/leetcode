class Solution {
    public int firstStableIndex(int[] l, int k) {
        int n=l.length-1;
        int max[]=new  int[n+1];
        int min[]=new int [n+1];
        max[0]=l[0];
        for(int i=1;i<=n;i++)
        {
            if(l[i]<max[i-1])
            {
                max[i]=max[i-1];
            }
            else
            {
                max[i]=l[i];
            }
        }
        min[n]=l[n];
        for(int i=n-1;i>=0;i--)
        {
            if(l[i]<min[i+1])
            {
                min[i]=l[i];
            }
            else
            {
                min[i]=min[i+1];
            }
        }
        for(int i=0;i<=n;i++)
        {
            int count=max[i]-min[i];
            if(count<=k)
            {
                return i;
            }
        }
        return -1;
    }
}