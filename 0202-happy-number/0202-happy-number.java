class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer >set=new HashSet<>();
        int r=0;
        int sum=0;
        int v=n;
        while(v!=0)
        {
            r=v%10;
            sum=sum+(r*r);
            v=v/10;
            if(v==0&&sum!=1)
            {
                if(set.contains(sum))
                {
                    return false;
                }
                set.add(sum);
                v=sum;
                sum=0;
            }
        }
        return true;
    }
}