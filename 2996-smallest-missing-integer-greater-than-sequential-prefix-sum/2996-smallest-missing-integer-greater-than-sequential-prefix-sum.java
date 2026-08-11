class Solution {
    public int missingInteger(int[] l) {
        int n=l.length-1;
        int count=0;
        int ms=0;
        int x=0;
        int sum=0;
        for(int i=0;i<=n;i++)
        {
            sum=sum+l[i];
            count++;
            if(ms<count)
            {
                ms=count;
                x=sum;
            }
            if(i==n)
            {
                break;
            }
            if(l[i+1]!=(l[i]+1))
            {
                break;
            }
        }
        int i=0;
        while(i<=n)
        {
            if(l[i]==x)
            {
                x++;
                i=-1;
            }
            i++;
        }
        return x;
    }
}