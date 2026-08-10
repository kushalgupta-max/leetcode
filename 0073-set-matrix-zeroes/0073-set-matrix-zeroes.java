class Solution {
    public void setZeroes(int[][] l) {
        int n=l.length-1;
        int m=l[0].length-1;
        int col=l[0][0];
        int count=0;
        int x=0;
        for(int i=0;i<=m;i++)
            {
                if(l[0][i]==0)
                {
                    count++;
                    break;
                }
            }
        for(int i=0;i<=n;i++)
            {
                if(l[i][0]==0)
                {
                    x++;
                    break;
                }
            }
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=m;j++)
            {
                if(l[i][j]==0)
                {
                    l[0][j]=0;
                    l[i][0]=0;
                }
            }
        }
        col=l[0][0];
        for(int i=n;i>=1;i--)
        {
            for(int j=m;j>=1;j--)
            {
                if(l[0][j]==0||l[i][0]==0)
                    {
                        l[i][j]=0;
                    }
            }
        }
        if(count!=0)
        {
            for(int i=0;i<=m;i++)
            {
                l[0][i]=0;
            }
        }
        if(x!=0)
        {
            for(int i=0;i<=n;i++)
            {
                l[i][0]=0;
            }
        }
    }
}