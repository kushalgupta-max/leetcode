class Solution {
    public boolean isPalindrome(int x) 
    {
        int a=0;
        int pallin=0;
        int k=x;
        while(x>0)
        {
            a=x%10;
            pallin=pallin*10+a;
            x=x/10;
        }
        if(pallin==k)
        {
            return true;
        }
        else
        {
        return false;
        }
    }
}