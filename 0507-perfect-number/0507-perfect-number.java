class Solution {
    public boolean checkPerfectNumber(int l) {
        int sum=0;
        for(int i=1;i<=l/2;i++)
        {
            if(l%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum!=l)
        {
            return false;
        }
        return true;
    }
}