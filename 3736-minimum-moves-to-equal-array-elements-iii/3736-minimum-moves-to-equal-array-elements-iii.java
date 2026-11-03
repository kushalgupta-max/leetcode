class Solution {
    public int minMoves(int[] l) {
        int n=l.length;
        int min=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            min=Math.max(min,l[i]);
        }
        int result=0;
        for(int i=0;i<n;i++)
        {
            result=result+(min-l[i]);
        }
        return result;
    }
}