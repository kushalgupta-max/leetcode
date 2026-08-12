class Solution {
    public int arraySign(int[] l) {
        int n=l.length-1;
        int count=0;
        for(int i=0;i<=n;i++)
        {
            if(l[i]<0)
            {
                count++;
            }
            if(l[i]==0)
            {
                return 0;
            }
        }
        if(count%2==0)
        {
            return 1;
        }
        return -1;
    }
}