class Solution {
    public int sumOfUnique(int[] l) {
        int n=l.length-1;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<=n;i++)
        {
            map.put(l[i],map.getOrDefault(l[i],0)+1);
        }
        int sum=0;
        for(int i=0;i<=n;i++)
        {
            if(map.get(l[i])==1)
            {
                sum=sum+l[i];
            }
        }
        return sum;
    }
}