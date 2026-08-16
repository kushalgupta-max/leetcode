class Solution {
    public int singleNonDuplicate(int[] l) {
        int n=l.length-1;
        if(n==0)
        {
            return l[n];
        }
        if(l[0]!=l[1])
        {
            return l[0];
        }
        if(l[n]!=l[n-1])
        {
            return l[n];
        }
        int start=2;
        int  end=n-2;
        int mid=0;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(l[mid]!=l[mid-1]&&l[mid]!=l[mid+1])
            {
                return l[mid];
            }
            if(l[mid]==l[mid-1])
            {
                if(mid%2==0)
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
            else
            {
                if(mid%2==0)
                {
                    start=mid+1;
                }
                else
                {
                    end=mid-1;
                }
            }
        }
        return l[mid];
    }
}