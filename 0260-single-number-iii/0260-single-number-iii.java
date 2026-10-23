class Solution {
    public int[] singleNumber(int[] l) {
        int n=l.length;
        int k[]=new int[2];
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            if(!set.contains(l[i]))
            {
                set.add(l[i]);
            }
            else
            {
                set.remove(l[i]);
            }
        }
        int x=0;
        for(int i:set)
        {
            k[x]=i;
            x++;
        }
        return k;
    }
}