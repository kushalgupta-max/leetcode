class Solution {
    public int countCommas(int n) {
        int r=0;
        int sum=0;
        int v=n;
        int count=0;
        while(n!=0)
        {
            n=n/10;
            count++;
        }
        if(count<4)
        {
            return 0;
        }
        int p=(v-1000)+1;
        return p;
    }
}