class Solution {
    public long maxAlternatingSum(int[] l) {
        int n=l.length;
        for(int i=0;i<n;i++)
        {
            if(l[i]<0)
            {
                l[i]=l[i]*(-1);
            }
        }
        Arrays.sort(l);
        long sum=0;
        int k=n/2;
        for(int i=0;i<k;i++)
        {
            sum=sum-(l[i]*l[i]);
        }
        for(int i=k;i<n;i++)
        {
            sum=sum+(l[i]*l[i]);
        }
        return sum;
    }
}