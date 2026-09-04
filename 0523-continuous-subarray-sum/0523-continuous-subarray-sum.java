class Solution {
    public boolean checkSubarraySum(int[] l, int k) {
        int n=l.length-1;
        int j[]=new int[n+1];
        j[0]=l[0];
        for(int i=1;i<=n;i++)
        {
            j[i]=j[i-1]+l[i];
        }
        HashMap<Integer,Integer>hash=new HashMap<>();
        hash.put(0,-1);
        for(int i=0;i<=n;i++)
        {
            int x=j[i]%k;
            if(hash.containsKey(x)==true)
            {
                if((i-hash.get(x))>=2)
                {
                    return true;
                }
            }
            else
            hash.put(x,i);
        }
        return false;
    }
}