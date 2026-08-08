class Solution {
    public void reverse(int []l,int start,int end)
    {
        int swap=0;
        while(start<end)
        {
            swap=l[start];
            l[start]=l[end];
            l[end]=swap;
            start++;
            end--;
        }
    }
    public void nextPermutation(int[] l) {
        int n=l.length-1; 
        int x=0;
        int swap=0;
        int count=0;
        for(int i=n;i>0;i--)
        {
            if(l[i]>l[i-1])
            {
                x=i-1;
                count++;
                break;
            }
        }
        int start=x;
        if(count!=0)
        {
        for(int i=n;i>x;i--)
        {
            if(l[i]>l[x])
            {
                swap=l[x];
                l[x]=l[i];
                l[i]=swap;
                break;
            }
        }
        start=x+1;
        }
        int end=n;
        reverse(l,start,end);
    }
}