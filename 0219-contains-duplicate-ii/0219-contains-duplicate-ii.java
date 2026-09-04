class Solution {
    public boolean containsNearbyDuplicate(int[] l, int k) {
        int n=l.length-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<=n;i++)
        {
            map.put(l[i],map.getOrDefault(l[i],0)+1);
            if(map.get(l[i])>=2)
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