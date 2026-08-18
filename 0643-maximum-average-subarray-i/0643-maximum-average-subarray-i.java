class Solution {
    public double findMaxAverage(int[] l, int k) {
        int n=l.length-1;
        int j[]=new int[n+2];
        int m=j.length-1;
        j[0]=0;
        if(n==0)
        {
            return l[0]/k;
        }
        for(int i=1;i<=m;i++)
        {
            j[i]=j[i-1]+l[i-1];
        }
        double x=0;
        double sum=0;
        int i=0;
        int t=i+k;
        double ms=Integer.MIN_VALUE;
        while(t<=m)
        {
            sum=j[t]-j[i];
            x=sum/k;
            if(ms<x){
                ms=x;
            }
            i++;
            t++;
        }
        return ms;
    }
}