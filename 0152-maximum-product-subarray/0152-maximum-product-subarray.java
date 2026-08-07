class Solution {
    public int maxProduct(int[] l) {
        int n=l.length-1;
        int pro=1;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<=n;i++)
        {
            pro=1;
            for(int j=i;j<=n;j++)
            {
                pro=pro*l[j];
                if(ms<pro)
                {
                    ms=pro;
                }
            }
        }
        return ms;
    }
}