class Solution {
    public int subarraysDivByK(int[] l, int k) {
        int n=l.length-1;
        int j[]=new int[n+1];
        j[0]=l[0];
        for(int i=1;i<=n;i++)
        {
            j[i]=j[i-1]+l[i];
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int count=0;
        for(int i=0;i<=n;i++)
        {
            int x = ((j[i] % k) + k) % k;
            if(map.containsKey(x)==true)
            {
                count=count+map.get(x);
            }
            map.put(x,map.getOrDefault(x,0)+1);
        }
        return count;
    }
}