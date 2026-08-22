class Solution {
    public boolean checkDivisibility(int n) {
        int r=0;
        int sum=0;
        int v=n;
        int pro=1;
        int k=0;
        int j=n;
        while(n!=0)
        {
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        while(v!=0)
        {
            k=v%10;
            pro=pro*k;
            v=v/10;
        }
        int digit=sum+pro;
        if(j%digit==0)
        {
            return true;
        }
        return false;
    }
}