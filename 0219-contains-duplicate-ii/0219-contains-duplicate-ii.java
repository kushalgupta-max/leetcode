class Solution {
    public boolean containsNearbyDuplicate(int[] l, int k) {
        int x=0;
        int n=l.length;
        int i=0;
        HashSet<Integer>set=new HashSet<>();
        while(i<n)
        {
            if(i>k)
            {
                set.remove(l[x]);
                x++;
            }
            if(set.contains(l[i]))
            {
                return true;
            }
            else
            {
                set.add(l[i]);
            }
            i++;
        }
        return false;
    }
}