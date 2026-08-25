class Solution {
    public int missingMultiple(int[] l, int k) {
        int n=l.length-1;
        int i=0;
        int v=k;
        while(i<=n)
        {
            if(l[i]==k)
            {
                k=k+v;
                i=-1;
            }
            i++;
        }
        return k;
    }
}