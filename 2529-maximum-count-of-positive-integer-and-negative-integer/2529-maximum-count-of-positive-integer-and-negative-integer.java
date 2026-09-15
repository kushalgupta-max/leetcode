class Solution {
    public int maximumCount(int[] l) {
        int n=l.length;
        int count=0;
        int pro=0;
        for(int i=0;i<n;i++)
        {
            if(l[i]>0)
            {
                count++;
            }
            if(l[i]<0)
            {
                pro++;
            }
        }
        if(count>pro)
        {
            return count;
        }
        return pro;
    }
}