class Solution {
    public int smallestNumber(int n, int t) {
        int r=0;
        int pro=1;
        int v=n;
        while(n!=0)
        {
            r=n%10;
            pro=pro*r;
            n=n/10;
        if(n==0)
        {
            if(pro%t==0)
            {
                return v;
            }
            v++;
            n=v;
            pro=1;
        }
        }
        return -1;
    }
}