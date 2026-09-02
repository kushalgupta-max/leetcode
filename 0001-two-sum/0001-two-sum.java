class Solution {
    public int[] twoSum(int[] l, int target) {
        int n=l.length-1;
        int k[]={-1,-1};
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<=n;i++)
        {
            map.put(l[i],i);
        }
        for(int i=0;i<=n;i++)
        {
            int count=target-l[i];
            if(map.containsKey(count)==true)
            {
                if(i!=map.get(count))
                {
                    k[0]=i;
                    k[1]=map.get(count);
                    break;
                }
            }
        }
        return k;
    }
}