class Solution {
    public int longestConsecutive(int[] l) {
        int n=l.length-1;
        int count=1;
        Arrays.sort(l);
        int ms=0;
        if(n==0)
        {
            return 1;
        }
        for(int i=1;i<=n;i++)
        {
            if((l[i]-1)==l[i-1])
            {
                count++;
            }
            else
            {
                if(l[i]!=l[i-1])
                {
                count=1;
                }
            }
            if(ms<count)
            {
                ms=count;
            }
        }
        return ms;
    }
}