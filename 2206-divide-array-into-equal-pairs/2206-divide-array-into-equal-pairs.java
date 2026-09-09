class Solution {
    public boolean divideArray(int[] l) {
        int n=l.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(l[i],map.getOrDefault(l[i],0)+1);
        }
        for(int i=0;i<n;i++)
        {
            if(map.get(l[i])%2!=0)
            {
                return false;
            }
        }
        return true;
    }
}