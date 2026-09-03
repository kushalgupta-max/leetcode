class Solution {
    public int majorityElement(int[] l) {
        int n=l.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(l[i],map.getOrDefault(l[i],0)+1);
            if(map.get(l[i])>n/2)
            {
                return l[i];
            }
        }
        return -1;
    }
}