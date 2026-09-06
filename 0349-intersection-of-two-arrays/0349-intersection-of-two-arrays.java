class Solution {
    public int[] intersection(int[] l, int[] k) {
        int n=l.length;
        int m=k.length;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            set.add(l[i]);
        }
        int count=0;
        HashSet<Integer>hash=new HashSet<>();
        for(int i=0;i<m;i++)
        {
            hash.add(k[i]);
        }
        for(int freq:set)
        {
            if(hash.contains(freq))
            {
                count++;
            }
        }
        int j[]=new int[count];
        int x=0;
        for(int freq:set)
        {
            if(hash.contains(freq))
            {
                j[x]=freq;
                x++;
            }
        }
        return j;
    }
}