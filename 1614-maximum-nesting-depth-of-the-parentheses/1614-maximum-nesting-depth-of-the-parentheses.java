class Solution {
    public int maxDepth(String s) {
        int n=s.length();
        int count=0;
        int max=0;
        char k='(';
        char l=')';
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)==k)
            {
                count++;
            }
            else if(s.charAt(i)==l)
            {
                count--;
            }
            if(max<count)
            {
                max=count;
            }
        }
        return max;
    }
}