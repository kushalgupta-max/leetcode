class Solution {
    public int mostWordsFound(String[] l) {
        int n=l.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int j=0;
            int count=0;
            String v=l[i];
            while(j<v.length())
            {
                if(v.charAt(j)==' ')
                {
                    count++;
                }
                j++;
            }
            max=Math.max(max,count+1);
        }
        return max;
    }
}