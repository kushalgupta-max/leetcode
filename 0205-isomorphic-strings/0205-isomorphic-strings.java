class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n=s.length()-1;
        HashMap<Character,Character> map=new HashMap<>();
        HashMap<Character,Character> hash=new HashMap<>();
        for(int i=0;i<=n;i++)
        {
            map.put(t.charAt(i),s.charAt(i));
            hash.put(s.charAt(i),t.charAt(i));
        }
        for(int i=0;i<=n;i++)
        {
            if(s.charAt(i)!=map.get(t.charAt(i)))
            {
                return false;
            }
            if(t.charAt(i)!=hash.get(s.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }
}