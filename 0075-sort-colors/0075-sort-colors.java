class Solution {
    public void conqure(int l[],int start,int end,int mid)
    {
        int k[]=new int[end+1-start];
        int i=start;
        int j=mid+1;
        int v=0;
        while(i<=mid&&j<=end)
        {
            if(l[i]>l[j])
            {
                k[v]=l[j];
                j++;
            }
            else
            {
                k[v]=l[i];
                i++;
            }
            v++;
        }
        while(i<=mid)
        {
            k[v]=l[i];
            v++;
            i++;
        }
        while(j<=end)
        {
            k[v]=l[j];
            v++;
            j++;
        }
        for(int w=0,o=start;w<k.length;w++,o++)
        {
            l[o]=k[w];
        }
    }
    public void divide(int l[],int start,int end)
    {
        if(start==end)
        {
            return;
        }
        int mid=start+(end-start)/2;
        divide(l,start,mid);
        divide(l,mid+1,end);
        conqure(l,start,end,mid);
    }
    public void sortColors(int[] l) {
        int n=l.length;
        int start=0;
        int end=n-1;
        divide(l,start,end);
    }
}