class Solution {
    public int minSubArrayLen(int target, int[] l) {
        int n=l.length;
        int count=0;
        int min=Integer.MAX_VALUE;
        int sum=0;
        int j=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+l[i];
            while(sum>=target)
            {
                count=i-j+1;
                if(count<min)
                {
                    min=count;
                }
                sum=sum-l[j];
                j++;
            }
        }
        if(min==Integer.MAX_VALUE)
        {
            return 0;
        }
        return min;
    }
}