class Solution {
    public boolean canPlaceFlowers(int[] l, int m) {
        int n=l.length;
        ArrayList<Integer>k=new ArrayList<>();
        k.add(0);
        for(int i=0;i<n;i++)
        {
            k.add(l[i]);
        }
        k.add(0);
        for(int i=1;i<k.size()-1;i++)
        {
            if(k.get(i)==0&&k.get(i+1)==0&&k.get(i-1)==0)
            {
                m--;
                k.set(i,1);
            }
        }
        if(m<=0)
        {
            return true;
        }
        return false;
    }
}