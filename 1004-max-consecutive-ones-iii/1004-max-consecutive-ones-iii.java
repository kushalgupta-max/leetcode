class Solution {
    public int longestOnes(int[] l, int k) {
        int n=l.length;
        int max=0;
        int count=0;
        int x=0;
        int j=0;
        for(int i=0;i<n;i++)
        {
           if(l[i]==0)
           {
                x++;
           }
           if(x>k)
           {
                if(l[j]==0)
                {
                    x--;
                }
                j++;
           }
           count=i-j+1;
           max=Math.max(max,count);
        }
        return max;
    }
}