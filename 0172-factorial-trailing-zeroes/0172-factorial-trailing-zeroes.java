class Solution {
    public int trailingZeroes(int n) {
        int pro=0;
        int r=0;
        while(n!=0)
        {
            r=n/5;
            pro=pro+r;
            n=r;
        }
        return pro;
    }
}