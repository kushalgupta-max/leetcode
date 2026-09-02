class Solution {
    public boolean containsDuplicate(int[] l) {
        int count=0;
        int n=l.length-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<=n;i++)
        {
            map.put(l[i],map.getOrDefault(l[i],0)+1);
        }
        for(int i=0;i<=n;i++)
        {
            if(map.get(l[i])>1)
            {
                return true;
            }
        }
        return false;
    }
}