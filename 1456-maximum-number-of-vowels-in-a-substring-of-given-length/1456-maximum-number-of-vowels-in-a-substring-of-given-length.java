class Solution {
    public int maxVowels(String s, int k) {
        int n=s.length();
        int count=0;
        int ms=0;
        for(int i=0;i<k;i++)
        {
            if(s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='a'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
                count++;
            }
        }
        ms=count;
        for(int i=1,j=i+k-1;j<n;i++,j++)
        {
            if(s.charAt(j)=='e'||s.charAt(j)=='i'||s.charAt(j)=='a'||s.charAt(j)=='o'||s.charAt(j)=='u')
            {
                count++;
            }
            if(s.charAt(i-1)=='e'||s.charAt(i-1)=='i'||s.charAt(i-1)=='a'||s.charAt(i-1)=='o'||s.charAt(i-1)=='u')
            {
                count--;
            }
            if(ms<count)
            {
                ms=count;
            }
            if(ms==k)
            {
                return ms;
            }
        }
        return ms;
    }
}