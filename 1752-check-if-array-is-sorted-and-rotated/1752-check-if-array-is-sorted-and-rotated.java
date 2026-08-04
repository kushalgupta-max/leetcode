class Solution {
    public boolean check(int[] l) {
        int n=l.length-1;
        int x=0;
        for(int i=1;i<=n;i++)
        {
            if(l[i]<l[i-1])
            {
                x++;
            }
        }
        if(l[n]>l[0])
        {
            x++;
        }
        if(x>1)
        {
            return false;
        }
        return true;
    }
}