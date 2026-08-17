class Solution {
    public int findPeakElement(int[] l) {
        int n=l.length-1;
        if(n==0)
        {
            return 0;
        }
        if(l[n]>l[n-1])
        {
            return n;
        }
        if(l[0]>l[1])
        {
            return 0;
        }
        int start=0;
        int end=n;
        int mid=0;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(l[mid]>l[mid-1]&&l[mid]>l[mid+1])
            {
                return mid;
            }
            if(l[mid]<l[mid+1])
            {
                start=mid+1;
            }
            else 
            { 
                end=mid;
            }
        }
        return mid;
    }
}