class Solution {
    public int countEven(int n) {
        int sum=0;
        int r=0;
        int count=0;
        for(int i=1;i<=n;i++)
        {
            sum=0;
            int v=i;
            while(v!=0)
            {
                r=v%10;
                sum=sum+r;
                v=v/10;
            }
            if(sum%2==0)
            {
                count++;
            }
        }
        return count;
    }
}