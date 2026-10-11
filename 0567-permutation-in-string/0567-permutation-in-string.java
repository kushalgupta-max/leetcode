class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        if(m<n)
        {
            return false;
        }
        HashMap<Character,Integer>set=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            set.put(s1.charAt(i),set.getOrDefault(s1.charAt(i),0)+1);
        }
        int x=0;
        HashMap<Character,Integer>hash=new HashMap<>();
        for(int i=0;i<n-1;i++)
        {
            hash.put(s2.charAt(i),hash.getOrDefault(s2.charAt(i),0)+1);
        }
        for(int i=n-1;i<m;i++)
        {
            hash.put(s2.charAt(i),hash.getOrDefault(s2.charAt(i),0)+1);
            if(set.equals(hash))
            {
                return true;
            }
            hash.put(s2.charAt(x),hash.getOrDefault(s2.charAt(x),0)-1);
            if(hash.get(s2.charAt(x))==0)
            {
                hash.remove(s2.charAt(x));
            }
            x++;
        }
        return false;
    }
}