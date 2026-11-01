class Solution {
    public int[] nextGreaterElement(int[] l, int[] k) {
        int n=l.length;
        int m=k.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int x=0;
            for(int j=0;j<m;j++)
            {
                if(l[i]==k[j])
                {
                    x++;
                }
                if(x==1)
                {
                    if(l[i]<k[j])
                    {
                        ans[i]=k[j];
                        break;
                    }
                }
            }
            if(ans[i]==0)
            {
                ans[i]=-1;
            }
        }
        return ans;
    }
}