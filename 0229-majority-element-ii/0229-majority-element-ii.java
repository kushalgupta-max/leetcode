class Solution {
    public List<Integer> majorityElement(int[] l) {
        int n=l.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            map.put(l[i],map.getOrDefault(l[i],0)+1);
        }
        for(int i=0;i<n;i++)
        {
            if(map.get(l[i])>(n/3))
            {
                if(!list.contains(l[i]))
                {
                list.add(l[i]);
                }
            }
        }
        return list;
    }
}