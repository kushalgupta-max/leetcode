class Solution {
    public char findTheDifference(String s, String t) {
        int n=s.length();
        int m=t.length();
        char k[]=new char[n];
        char x;
        if(m==1)
        {
            return t.charAt(0);
        }
        for(int i=0;i<k.length;i++)
        {
            k[i]=s.charAt(i);
        }
        for(int i=0;i<m;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(k[j]==t.charAt(i))
                {
                    count++;
                    k[j]=0;
                    break;
                }
            }
            if(count==0)
            {
                x=t.charAt(i);
                return x;
            }
        }
        return 0;
    }
}