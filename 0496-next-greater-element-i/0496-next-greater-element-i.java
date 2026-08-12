class Solution {
    public int[] nextGreaterElement(int[] l, int[] k) {
        int n=l.length-1;
        int m=k.length-1;
        int count=0;
        int ans[]=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            count=0;
            for(int j=0;j<=m;j++)
            {
                if(l[i]==k[j])
                {
                    count++;
                }
                if(count!=0)
                {
                    if(l[i]<k[j])
                    {
                        ans[i]=k[j];
                        break;
                    }
                else
                {
                    ans[i]=-1;
                }
                }
            }
        }
        return ans;
    }
}