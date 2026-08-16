class Solution {
    public int differenceOfSum(int[] l) {
        int n=l.length-1;
        int sum=0;
        for(int i=0;i<=n;i++)
        {
            sum=sum+l[i];
        }
        int pro=0;
        int r=0;
        int v=0;
        for(int i=0;i<=n;i++)
        {
            r=l[i];
            while(r!=0)
            {
                v=r%10;
                pro=pro+v;
                r=r/10;
            }
        }
        int diff=sum-pro;
        return diff;
    }
}