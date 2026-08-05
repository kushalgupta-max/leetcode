class Solution {
    public int[] rearrangeArray(int[] l) {
        int n=l.length-1;
        int k[]=new int[n+1];
        int x=0;
        for(int i=0;i<=n;i++)
        {
            if(l[i]>0)
            {
                k[x]=l[i];
                x=x+2;
            }
        }
        x=1;
        for(int i=0;i<=n;i++)
        {
            if(l[i]<0)
            {
                k[x]=l[i];
                x=x+2;
            }
        }
        return k;
    }
}