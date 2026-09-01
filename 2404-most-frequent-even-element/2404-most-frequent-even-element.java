class Solution {
    public int mostFrequentEven(int[] l) {
        int n=l.length;
        int ms=-1;
        int x=-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(l[i],map.getOrDefault(l[i],0)+1);
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(l[i]%2==0)
            {
                count=map.get(l[i]);
                if(count>x||ms>l[i]&&count==x)
                {
                    x=count;
                    ms=l[i];
                }
            }
        }
        return ms;
    }
}