class Solution {
    public int majorityElement(int[] l) {
        int n=l.length-1;
        int count=1;
        int x=l[0];
        for(int i=1;i<=n;i++)
        {
            if(l[i]==x)
            {
                count++;
            }
            else
            {
                count--;
            }
            if(count==0)
            {
                x=l[i];
                count++;
            }
        }
        return x;
    }
}