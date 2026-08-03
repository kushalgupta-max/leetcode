class Solution {
    public int minimumPushes(String s) {
        int n=s.length();
        int push=0;
        for(int i=0;i<n;i++)
        {
            push=push+(i/8 +1);
        }
        return push;
    }
}