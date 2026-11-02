class Solution {
    public int minMoves2(int[] l) {
        int n=l.length;
        Arrays.sort(l);
        int start=0;
        int mid=start+(n-start)/2;
        int result=0;
        for(int i=0;i<n;i++)
        {
            result=result+Math.abs(l[i]-l[mid]);
        }
        return result;
    }
}