class Solution {
    public int countGoodSubstrings(String s) {
        int k=3;
        int n=s.length();
        int count=0;
        for(int i=0,j=i+k-1;j<n;i++,j++)
        {
            if(s.charAt(i)!=s.charAt(i+1)&&s.charAt(i)!=s.charAt(j)&&s.charAt(i+1)!=s.charAt(j))
            {
                count++;
            }
        }
        return count;
    }
}