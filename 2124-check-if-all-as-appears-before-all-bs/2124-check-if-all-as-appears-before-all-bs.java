class Solution {
    public boolean checkString(String s) {
        int n=s.length();
        int x=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='b')
            {
                x++;
            }
            if(s.charAt(i)=='a'&&x>0)
            {
                return false;
            }
        }
        return true;
    }
}