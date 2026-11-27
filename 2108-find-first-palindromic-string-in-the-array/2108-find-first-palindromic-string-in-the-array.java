class Solution {
    public String firstPalindrome(String[] l) {
        int n=l.length;
        for(int i=0;i<n;i++)
        {
            int j=0;
            int c=0;
            int k=l[i].length()-1;
            while(j<k)
            {
                if(l[i].charAt(j)!=l[i].charAt(k))
                {
                    c=1;
                    break;
                }
                j++;
                k--;
            }
            if(c==0)
            {
                return l[i];
            }
        }
        return "";
    }
}