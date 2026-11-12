class Solution {
    public int party(int []l,int start,int end)
    {
        int index=start-1;
        int swap=0;
        for(int i=start;i<end;i++)
        {
            if(l[i]<=l[end])
            {
                index++;
                swap=l[index];
                l[index]=l[i];
                l[i]=swap;
            }
        }
        index++;
        swap=l[index];
        l[index]=l[end];
        l[end]=swap;
        return index;
    }
    public void quick(int l[],int start,int end)
    {
        if(start<end)
        {
            int pivt=party(l,start,end);
            quick(l,start,pivt-1);
            quick(l,pivt+1,end);
        }
    }
    public void sortColors(int[] l) {
        int n=l.length;
        int start=0;
        int end=n-1;
        quick(l,start,end);
    }
}