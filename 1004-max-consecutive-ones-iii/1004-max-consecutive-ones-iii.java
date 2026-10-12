class Solution {
    public int longestOnes(int[] l, int k) {
        int n=l.length;
        int max=0;
        int count=0;
        int x=0;
        int j=0;
        int i=0;
        while(i<n)
        {
            if(l[i]==0)
            {
                x++;
            }
            if(x>k)
            {
                while(l[j]!=0)
                {
                    j++;
                }
                j++;
                x--;
            }
            i++;
            if(i>n)
            {
                count--;
            }
            count=i-j;
            max=Math.max(max,count);
        }
        return max;
    }
}