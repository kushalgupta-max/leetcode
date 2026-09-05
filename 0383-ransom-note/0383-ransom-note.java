class Solution {
    public boolean canConstruct(String r, String m) {
        int n=r.length()-1;
        int v=m.length()-1;
        if(n>v)
        {
            return false;
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
                hash.put(r.charAt(i),hash.get(r.charAt(i))-1);
            }
            else
            {
                return false;
            }
            if(hash.get(r.charAt(i))==0)
            {
                hash.remove(r.charAt(i));
            }
        }
        return true;
    }
}