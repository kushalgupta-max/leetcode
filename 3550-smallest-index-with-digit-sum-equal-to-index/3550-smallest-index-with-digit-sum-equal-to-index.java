class Solution {
    public int smallestIndex(int[] l) {
        int n=l.length;
        for(int i=0;i<n;i++)
        {
            int r=0;
            int sum=0;
            int v=i;
            while(l[i]!=0)
            {
                r=l[i]%10;
                sum=sum+r;
                l[i]=l[i]/10;
            }
            if(sum==v)
            {
                return v;
            }
        }
        return -1;
    }
}