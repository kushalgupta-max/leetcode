class Solution {
    public int minMoves(int[] l) {
        int n=l.length;
        Arrays.sort(l);
        int result=0;
        for(int i=1;i<n;i++)
        {
            result=result+(l[i]-l[0]);
        }
        return result;
    }
}