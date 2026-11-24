class Solution {
    public int findGCD(int[] l) {
        int n=l.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            min=Math.min(min,l[i]);
            max=Math.max(max,l[i]);
        }
        while(min!=0)
        {
            int x=max;
            max=min;
            min=x%min;
        }
        return max;
    }
}