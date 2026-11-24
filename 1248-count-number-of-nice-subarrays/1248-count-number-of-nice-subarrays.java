class Solution {
    public int numberOfSubarrays(int[] l, int target) {
        int n=l.length;
        int odds=0;
        int i=-1;
        int j=0;
        int count=0;
        for(int k=0;k<n;k++)
        {
            if(l[k]%2!=0)
            {
                odds++;
            }
            if(odds==target)
            {
                while(l[j]%2==0)
                {
                    j++;
                }
                count=count+(j-i);
            }
            else if(odds>target)
            {
                i=j;
                j++;
                while(l[j]%2==0)
                {
                    j++;
                }
                odds--;
                count=count+(j-i);
            }
        }
        return count;
    }
}