class Solution {
    public int maxProfit(int[] l) 
{
    int buy=Integer.MAX_VALUE;
    int n=l.length-1;
    int x=0;
    int maxprofit=0;
        for(int i=0;i<=n;i++)
        {
           if(buy<l[i])
           {
            int profit=l[i]-buy;
            maxprofit=Math.max(profit,maxprofit);
           }
           else
           {
            buy=l[i];
           }
        }  
        return maxprofit;
    }
}