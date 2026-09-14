class Solution {
    public int countDigits(int n) {
        int r=0;
        int count=0;
        int v=n;
        while(v!=0)
        {
            r=v%10;
            if(n%r==0)
            {
                count++;
            }
            v=v/10;
        }
        return count;
    }
}