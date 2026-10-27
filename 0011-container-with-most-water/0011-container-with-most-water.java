class Solution {
    public int maxArea(int[] l) {
        int n=l.length;
        int max=0;
        int pro=0;
        int i=0;
        int j=n-1;
        while(i<j)
        {
            pro=(j-i)*Math.min(l[i],l[j]);
            if(max<pro)
            {
                max=pro;
            }
            if(l[i]>l[j])
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        return max;
    }
}