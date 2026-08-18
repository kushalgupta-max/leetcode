class Solution {
    public boolean isPerfectSquare(int n) {
        long start=1;
        long count=0;
        long end=n/2;
        long mid=0;
        if(n==1)
        {
            return true;
        }
        while(start<=end)
        {
            mid=start+(end-start)/2;
            long sq=mid*mid;
            if(sq==n)
            {
                return true;
            }
            if(sq<n)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return false;
    }
}