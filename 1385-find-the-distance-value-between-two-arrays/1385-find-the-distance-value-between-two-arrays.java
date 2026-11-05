class Solution {
    public int findTheDistanceValue(int[] l, int[] k, int d) {
        int n=l.length;
        int m=k.length;
        int res=0;
        for(int i=0;i<n;i++)
        {
        int count=0;
            for(int j=0;j<m;j++)
            {
                if(Math.abs(l[i]-k[j])<=d)
                {
                    count++;
                }
            }
            if(count==0)
            {
                res++;
            }
        }
        return res;
    }
}