class Solution {
    public int subarraySum(int[] l, int k) {
        int n=l.length-1;
        HashMap <Integer,Integer> map=new HashMap<>();
        int pre[]=new int[n+1];
        pre[0]=l[0];
        for(int i=1;i<=n;i++)
        {
            pre[i]=pre[i-1]+l[i];
        }
        int count=0;
        for(int i=0;i<=n;i++)
        {
            if(pre[i]==k)
            {
                count++;
            }
            int x=pre[i]-k;
            if(map.containsKey(x)==true)
            {
                count=count+map.get(x);
            }
            map.put(pre[i],map.getOrDefault(pre[i],0)+1);
        }
        return count;
    }
}