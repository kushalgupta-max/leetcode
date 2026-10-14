class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        HashSet<Character>set=new HashSet<>();
        int count=0;
        int x=0;
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(!set.contains(s.charAt(i)))
            {
                x++;
                set.add(s.charAt(i));
            }
            if(x==3)
            {
                j=i-1;
                while(s.charAt(i)==s.charAt(j))
                {
                    j--;
                }
                int v=j;
                j--;
                while(s.charAt(j)==s.charAt(v)||s.charAt(j)==s.charAt(i))
                {
                    j--;
                }
                count=count+j+1;
            }
        }
        return count;
    }
}