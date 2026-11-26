class Solution {
    public boolean canAliceWin(int n) {
        int v=10;
        boolean win=true; 
        while(n>=0)
        {
            win=(win==false)?true:false;
            n=n-v;
            v--;
        }
        return win;
    }
}