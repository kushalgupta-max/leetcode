class Solution {
    public int minDeletions(int[] l) {
        int n=l.length;
        int j=0;
        int count=0;
        for(int i=1;i<n;i++)
        {
            if(l[i]==l[i-1])
            {
                count++;
            }
        }
        return count;
    }
}