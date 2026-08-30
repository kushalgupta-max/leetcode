class Solution {
    public int minimumDeletions(int[] l) {
        int n=l.length-1;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int x=0;
        int y=0;
        for(int i=0;i<=n;i++)
        {
            if(min>l[i])
            {
                min=l[i];
                x=i;
            }
            if(max<l[i])
            {
                max=l[i];
                y=i;
            }
        }
        if(x<y)
        {
            int swap=x;
            x=y;
            y=swap;
        }
        int v=x-y-1;
        int b=n-x;
        int k=y;
        int count=Math.max(v,Math.max(b,k));
        int m=n-count+1;
        return m;
    }
}