class Solution {
    public int maxScore(int[] l, int k) {
        int n=l.length;
        int i=0;
        int j=n;
        int count=0;
        int sum=0;
        while(i<k)
        {
            sum=sum+l[i];
            i++;
        }
        i--;
        int max=sum;
        while(i>=0)
        {
            j--;
            sum=sum+l[j];
            sum=sum-l[i];
            i--;
            if(max<sum)
            {
                max=sum;
            }
        }
        return max;
    }
}