class Solution {
    public int numJewelsInStones(String j, String s) {
        int n=s.length();
        int m=j.length();
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<m;i++)
        {
            set.add(j.charAt(i));
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(set.contains(s.charAt(i)))
            {
                count++;
            }
        }
        return count;
    }
}