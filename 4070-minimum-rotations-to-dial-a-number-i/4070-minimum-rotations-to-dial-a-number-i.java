class Solution {
    public int minRotations(String s) {
        int n=s.length();
        int i=0;
        int j=0;
        int sum=0;
        while(i<n)
        {
            int v=Math.abs((s.charAt(i)-'0')-j);
            int r=10-v;
            int result=Math.min(v,r);
            sum=sum+result;
            j=s.charAt(i)-'0';
            i++;
        }
        return sum;
    }
}