class Solution {
    public boolean isPossibleToSplit(int[] l) {
        int n=l.length-1;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<=n;i++)
        {
            map.put(l[i],map.getOrDefault(l[i],0)+1);
            if(map.get(l[i])>2)
            {
                return false;
            }
        }
        return true;
    }
}