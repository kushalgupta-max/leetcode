class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(n==0)
        {
            return 0;
        }
        int count=0;
        int max=1;
        int j=0;
        int x=0;
        for(int i=1;i<n;i++)
        {
            j=i-1;
            while(j>=x)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    x=j+1;
                    break;
                }
                j--;
            }
            count=i-j;
            if(max<count)
            {
                max=count;
            }
        }
        return max;
    }
}