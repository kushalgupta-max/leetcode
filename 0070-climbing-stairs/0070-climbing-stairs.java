class Solution {
    public int climbStairs(int n) {
        int k[]=new int[n];
        int ans=0;
        if(n==1)
        {
            return 1;
        }
        if(n==2)
        {
            return 2;
        }
        k[0]=1;
        k[1]=2;
        for(int i=2;i<n;i++)
        {
            k[i]=k[i-1]+k[i-2];
            ans=k[i];
        }
        return ans;
    }
}