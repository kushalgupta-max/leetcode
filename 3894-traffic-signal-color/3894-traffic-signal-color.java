class Solution {
    public String trafficSignal(int timer) {
        String g="Green";
        String o="Orange";
        String r="Red";
        if(timer == 0)
        {
            return g;
        }
        if(timer == 30)
        {
            return o;
        }
        if(30 < timer && timer <= 90)
        {
            return r;
        }
       return "Invalid";
    }
}