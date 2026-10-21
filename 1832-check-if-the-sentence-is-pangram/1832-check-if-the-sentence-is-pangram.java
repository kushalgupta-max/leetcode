class Solution {
    public boolean checkIfPangram(String s) {
        int n=s.length();
        HashSet<Character>set=new HashSet<>();
        int count=0;
        for(int i=0;i<n;i++)
        {
            set.add(s.charAt(i));
        }
        for(int i:set)
        {
            count++;
        }
        if(count==26)
        {
            return true;
        }
        return false;
    }
}