class Solution {
    public boolean canConstruct(String r, String m) {
        int n=r.length()-1;
        int v=m.length()-1;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<=n;i++)
        {
            map.put(r.charAt(i),map.getOrDefault(r.charAt(i),0)+1);
        }
        HashMap<Character,Integer>hash=new HashMap<>();
        for(int i=0;i<=v;i++)
        {
            hash.put(m.charAt(i),hash.getOrDefault(m.charAt(i),0)+1);
        }
        for(int i=0;i<=n;i++)
        {
            if(hash.containsKey(r.charAt(i))==true)
            {
                if(map.get(r.charAt(i))>hash.get(r.charAt(i)))
                {
                    return false;
                }
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}