class Solution {
    public int longestConsecutive(int[] l) {
        int n=l.length;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            set.add(l[i]);
        }
        int count=0;
        int ms=0;
        for(int freq:set)
        {
            count=1;
            int x=freq;
            if(!set.contains(x-1))
            {
                while(set.contains(x+1))
                {
                    count++;
                    x=x+1;
                }
                if(ms<count)
                {
                    ms=count;
                }
            }
        }
        return ms;
    }
}