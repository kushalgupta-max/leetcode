class Solution {
    public int findKthPositive(int[] l, int k) {
        int n=l.length-1;
        if(k<l[0])
        {
            return k;
        }
        int j[]=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            j[i]=l[i]-(i+1);
        }
        int start=0;
        int end=n;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(j[mid]>=k)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        k=k-j[end];
        int count=l[end]+k;
        return count;
    }
}