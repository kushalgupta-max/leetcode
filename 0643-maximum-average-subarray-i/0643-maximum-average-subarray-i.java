class Solution {
    public double findMaxAverage(int[] l, int k) {
        int n=l.length-1;
        double sum=0;
        double ms=Integer.MIN_VALUE;
        for(int i=0;i<k;i++)
        {
            sum=sum+l[i];
        }
        ms=sum/k;
        for(int i=1,j=i+k-1;j<=n;i++,j++)
        {
            sum=sum-l[i-1];
            sum=sum+l[j];
            if(sum/k>ms)
            {
                ms=sum/k;
            }
        }
        return ms;
    }
}