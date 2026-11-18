class Solution {
    public int minChanges(String s) {
        int n=s.length();
        int x=s.charAt(0)-'0';
        int count=0;
        for(int i=1;i<n;i++)
        {
            if(i%2!=0)
            {
                if(x!=s.charAt(i)-'0')
                {
                    count++;
                }
            }
            else
            {
                x=s.charAt(i)-'0';
            }
        }
        return count;
    }
}