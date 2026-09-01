class Solution {
    public int minOperations(int[] l, int k) {
        int n=l.length-1;
        int count=0;
        for(int i=0;i<=n;i++)
        {
            if(l[i]<k)
            {
                count++;
            }
        }
        return count;
    }
}