class Solution {
    public boolean detectCapitalUse(String word) {
        int n=word.length();
        int count=0;
        int x=0;
        for(int i=0;i<n;i++)
        {
            if(word.charAt(i)>=65&&word.charAt(i)<=96)
            {
                count++;
                x=i;
            }
        }
        if(count==1&&x==0||count==n||count==0)
        {
            return true;
        }
        return false;
    }
}