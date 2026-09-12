class Solution {
    public boolean checkPerfectNumber(int l) {
        int sum=0;
        HashSet<Integer>set=new HashSet<>();
        for(int i=1;i<=l/2;i++)
        {
            if(l%i==0)
            {
                set.add(i);
            }
        }
        for(int freq:set)
        {
            sum=sum+freq;
        }
        if(sum!=l)
        {
            return false;
        }
        return true;
    }
}