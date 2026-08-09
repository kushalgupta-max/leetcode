class Solution {
    public void setZeroes(int[][] l) {
        int n=l.length-1;
        int m=l[0].length-1;
        int row[]=new int[n+1];
        int col[]=new int[m+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=m;j++)
            {
                if(l[i][j]==0)
                {
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=m;j++)
            {
                if(row[i]==1||col[j]==1)
                {
                    l[i][j]=0;
                }
            }
        }
    }
}