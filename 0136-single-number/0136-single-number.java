class Solution {
    public int singleNumber(int[] l) {
        int n=l.length-1;
        int answer=0;
        for(int i=0;i<=n;i++)
        {
            answer=answer^l[i];
        }
        return answer;
    }
}