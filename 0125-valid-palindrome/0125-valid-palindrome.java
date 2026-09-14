class Solution {
    public boolean isPalindrome(String s) {
        String l=s.replaceAll(" ","");
        String k=l.toLowerCase();
        String j=k.replaceAll("[^a-z0-9]","");
        int n=j.length();
        int start=0;
        int end=n-1;
        while(start<end)
        {
            if(j.charAt(start)!=j.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}