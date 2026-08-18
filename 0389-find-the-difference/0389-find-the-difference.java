class Solution {
    public char findTheDifference(String s, String t) {
        int m=t.length();
        int n=s.length();
        char a=0;
        for(int i=0;i<m;i++)
        {
            a=(char)(a^t.charAt(i));
        }
        for(int i=0;i<n;i++)
        {
            a=(char)(a^s.charAt(i));
        }
        return a;
    }
}