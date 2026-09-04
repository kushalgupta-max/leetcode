class Solution {
    public int numSubarraysWithSum(int[] l, int k) {
        int n=l.length-1;
        int j[]=new int[n+1];
        j[0]=l[0];
        for(int i=1;i<=n;i++)
        {
            j[i]=j[i-1]+l[i];
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        int count=0;
        for(int i=0;i<=n;i++)
        {
            if(j[i]==k)
            {
                count++;
            }
            int x=j[i]-k;
            if(map.containsKey(x)==true)
            {
                count=count+map.get(x);
            }
            map.put(j[i],map.getOrDefault(j[i],0)+1);
        }
        return count;
    }
}