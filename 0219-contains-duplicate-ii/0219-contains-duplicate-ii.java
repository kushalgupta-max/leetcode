class Solution {
    public boolean containsNearbyDuplicate(int[] l, int k) {
        int n=l.length-1;
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<=n;i++)
        {
            if(hash.containsKey(l[i]))
            {
                if(i-(hash.get(l[i]))<=k)
                {
                    return true;
                }
            }
            hash.put(l[i],i);
        }
        return false;
    }
}