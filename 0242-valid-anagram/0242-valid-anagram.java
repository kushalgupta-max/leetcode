class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length()-1;
        int m=t.length()-1;
        if(n!=m)
        {
            return false;
        }
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<=n;i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        HashMap<Character,Integer>hash=new HashMap<>();
        for(int j=0;j<=m;j++)
        {
            hash.put(t.charAt(j),hash.getOrDefault(t.charAt(j),0)+1);
        }
            if(map.equals(hash)!=true)
            {
                return false;
            }
        return true;
    }
}