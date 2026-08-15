class Solution {
    public int longestSubsequence(int[] l) {
        int n=l.length-1;
        int pro=0;
        int count=0;
        for(int i=0;i<=n;i++)
        {
            pro=pro^l[i];
            if(l[i]==0)
            {
                count++;
            }
        }
        if(count==n+1)
        {
            return 0;
        }
        if(pro==0)
        {
            return n;
        }
        return n+1;
    }
}