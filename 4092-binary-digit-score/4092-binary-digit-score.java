class Solution {
    public int calculateScore(int a, int b) {
        int s1=0;
        int s2=0;
        String x=Integer.toBinaryString(a);
        String y=Integer.toBinaryString(b);
        int n=x.length();
        int m=y.length();
        for(int i=0;i<n;i++)
        {
            if(x.charAt(i)=='1')
            {
                s1++;
            }
        }
        for(int i=0;i<m;i++)
        {
            if(y.charAt(i)=='1')
            {
                s2++;
            }
        }
        if(s1>=s2)
        {
            return s1*s2;
        }
        return s2/s1;
    }
}