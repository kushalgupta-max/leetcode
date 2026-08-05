class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int n=0;
        int sum=0;
        int v=x;
        while(x!=0)
        {
            n=x%10;
            sum=sum+n;
            x=x/10;
        }
        if(v%sum==0)
        {
            return sum;
        }
        return -1;
    }
}