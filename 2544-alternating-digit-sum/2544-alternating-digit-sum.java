class Solution {
    public int alternateDigitSum(int n) {
        int r=0;
        int pro=0;
        int count=0;
        while(n!=0)
        {
            r=n%10;
            pro=(pro*10)+r;
            n=n/10;
        } 
        int sum=0; 
        while(pro!=0)
        {
            r=pro%10;
            count++;
            if(count%2==0)
            {
                r=r*(-1);
            }
            sum=sum+r;
            pro=pro/10;
        }
        return sum;
    }
}