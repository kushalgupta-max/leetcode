class Solution {
    public int numIdenticalPairs(int[] l) {
        int n=l.length-1;
        int count=0;
        int i=0;
        int j=i+1;
        while(i<n)
        {
            if(l[i]==l[j])
            {
                count++;
            }
            j++;
            if(j>n)
            {
                i++;
                j=i+1;
            }
        }
        return count;
    }
}