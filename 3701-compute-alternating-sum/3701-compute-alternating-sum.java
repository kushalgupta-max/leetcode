class Solution {
    public int alternatingSum(int[] l) {
        int n=l.length-1;
        int sum=0;
        int x=0;
        for(int i=0;i<=n;i++)
        {
            if(i%2!=0)
            {
                x=l[i]*(-1);
            }
            else
            {
                x=l[i];
            }
            sum=sum+x;
        }
        return sum;
    }
}