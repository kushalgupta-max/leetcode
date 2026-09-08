class Solution {
    public int countCommas(int n) {
        int p=(n-1000)+1;
        if(p>0)
        {
            return p;
        }
        return 0;
    }
}