class Solution {
    public List<Integer> targetIndices(int[] l, int target) {
        Arrays.sort(l);
        int n=l.length;
        ArrayList<Integer>k=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(l[i]==target)
            {
                k.add(i);
            }
        }
        return k;
    }
}