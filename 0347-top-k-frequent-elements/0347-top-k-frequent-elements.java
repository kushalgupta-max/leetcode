class Solution {
    public int[] topKFrequent(int[] l, int k) {
        int n=l.length-1;
        int j[]=new int[k];
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<=n;i++)
        {
            map.put(l[i],map.getOrDefault(l[i],0)+1);
        }
        int x=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<k;i++)
        {
            ms=Integer.MIN_VALUE;
            for(int p=0;p<=n;p++)
            {
                if(ms<map.get(l[p]))
                {
                    ms=map.get(l[p]);
                    j[i]=l[p];
                    x=l[p];
                }
            }
            map.put(x,0);
        }
        return j;
    }
}