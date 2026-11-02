class Solution {
    public int minMoves2(int[] l) {
        int n=l.length;
        Arrays.sort(l);
        int mid=n/2;
        int result=0;
        for(int i:l)
        {
            result=result+Math.abs(i-l[mid]);
        }
        return result;
    }
}