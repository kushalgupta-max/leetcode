class Solution {
    public boolean uniformArray(int[] l) {
        int n=l.length-1;
        int count=0;
        int pro=0;
        for(int i=0;i<=n;i++)
        {
            if(l[i]%2==0)
            {
                count++;
            }
            if(l[i]%2!=0)
            {
                pro++;
            }
        }
        if(count==0||pro==0)
        {
            return true;
        }
        int ms=Integer.MAX_VALUE;
        for(int i=0;i<=n;i++)
        {
            if(ms>l[i])
            {
                ms=l[i];
            }
        }
        if(ms%2==0)
        {
            return false;
        }
        return true;
    }
}