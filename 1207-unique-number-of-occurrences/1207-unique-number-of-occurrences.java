class Solution {
    public boolean uniqueOccurrences(int[] l) {
        int n=l.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            map.put(l[i],map.getOrDefault(l[i],0)+1);
        }
        for(int freq:map.values())
        {
            if(set.contains(freq)==true)
            {
                return false;
            }
            set.add(freq);
        }
        return true;
    }
}