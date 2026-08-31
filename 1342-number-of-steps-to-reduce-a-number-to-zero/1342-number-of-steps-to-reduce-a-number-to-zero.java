class Solution {
    public int numberOfSteps(int l) {
        int count=0;
        while(l!=0)
        {
            if(l%2==0)
            {
                l=l/2;
            }
            else
            {
                l=l-1;
            }
            count++;
        }
        return count;
    }
}