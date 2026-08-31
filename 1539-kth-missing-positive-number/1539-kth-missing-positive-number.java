class Solution {
    public int findKthPositive(int[] l, int k) {
        int n=l.length-1;
        if(k<l[0])
        {
            return k;
        }
        int bro=0;
        int start=0;
        int end=n;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            bro=l[mid]-(mid+1);
            if(bro>=k)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        k=k-(l[end]-(end+1));
        int count=l[end]+k;
        return count;
    }
}