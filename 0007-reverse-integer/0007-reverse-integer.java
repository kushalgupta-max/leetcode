class Solution {
    public int reverse(int x)
    {
        int rev = 0;
        int k=0;
        while (x != 0)
        {
            int digit = x % 10;
            int currev = rev * 10 + digit;
            if((currev-digit)/10!=rev)
            {
                return 0;
            }
                rev=currev;
            x /= 10;

        }
        return rev;
    }
}