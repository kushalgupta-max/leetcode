class Solution {
    public int numOfSubarrays(int[] l, int k, int threshold) {
        int n=l.length;
        int count=0;
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum=sum+l[i];
        }
        if(sum/k>=threshold)
        {
            count++;
        }
        for(int i=1,j=i+k-1;j<n;i++,j++)
        {
            sum=sum-l[i-1];
            sum=sum+l[j];
            if(sum/k>=threshold)
            {
                count++;
            }
        }
        return count;
    }
}