class Solution {
    public int addDigits(int n) {
        int r=0;
        int pro=0;
        while(n!=0)
        {
            r=n%10;
            pro=pro+r;
            n=n/10;
            if(pro>9&&n==0)
            {
                n=pro;
                pro=0;
            }
        }
        return pro;
    }
}