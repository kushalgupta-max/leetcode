class Solution {
    public int findFinalValue(int[] l, int k) {
        int n=l.length;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            set.add(l[i]);
        }
        while(set.contains(k))
        { 
            k=k*2;
        }
        return k;
    }
}