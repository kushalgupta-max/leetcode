class Solution {
    public int totalFruit(int[] l) {
        int n=l.length;
        int count=1;
        int max=1;
        int x=0;
        HashSet<Integer>set=new HashSet<>();
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(!set.contains(l[i]))
            {
                x++;
                set.add(l[i]);
                if(x>2)
                {
                    j=i-2;
                    while(l[j]==l[i-1])
                    {
                        j--;
                    }
                    set.remove(l[j]);
                    j++;
                }
            }
            count=i-j+1;
            max=Math.max(max,count);
        }
        return max;
    }
}