class Solution {
    public int minMoves(int[] l) {
        int n=l.length;
        int result=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            min=Math.min(min,l[i]);
        }
        for(int i=0;i<n;i++)
        {
            result=result+(l[i]-min);
        }
        return result;
    }
}