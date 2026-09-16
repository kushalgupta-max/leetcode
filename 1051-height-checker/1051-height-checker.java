class Solution {
    public int heightChecker(int[] l) {
        int n=l.length-1;
        int k[]=new int[n+1];
        int count=0;
        for(int i=0;i<=n;i++)
        {
            k[i]=l[i];
        }
        Arrays.sort(l);
        for(int i=0;i<=n;i++)
        {
            if(k[i]!=l[i])
            {
                count++;
            }
        }
        return count;
    }
}