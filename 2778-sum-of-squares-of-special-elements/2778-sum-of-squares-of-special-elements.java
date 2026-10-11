class Solution {
    public int sumOfSquares(int[] l) {
        int n=l.length;
        int sum=0;
        int v=n;
        for(int i=0;i<n;i++)
        {
            int x=i+1;
            if(v%x==0)
            {
                sum=sum+(l[i]*l[i]);
            }
        }
        return sum;
    }
}