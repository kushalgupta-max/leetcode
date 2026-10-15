class Solution {
    public boolean threeConsecutiveOdds(int[] l) {
        int n=l.length;
        int x=0;
        for(int i=0;i<n;i++)
        {
            if(l[i]%2!=0)
            {
                x++;
            }
            else
            {
                x=0;
            }
            if(x==3)
            {
                return true;
            }
        }
        return false;
    }
}