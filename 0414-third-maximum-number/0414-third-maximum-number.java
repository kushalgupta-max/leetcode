class Solution {
    public int thirdMax(int[] l) {
        int n=l.length-1;
        int v1=n;
        int v2=n-1;
        int v3=n-2;
        int x=0;
        Arrays.sort(l);
        if(l[0]==l[n]){
            x=l[0];
        }
        else
        {
        while(true)
        {
            if(v3<0)
            {
                x=l[v1];
                break;
            }
            if(l[v1]!=l[v2])
            {
                if(l[v2]!=l[v3])
                {
                    x=l[v3];
                    break;
                }
                else
                {
                    v3--;
                    v2--;
                }
            }
            else
            {
                v1--;
                v2--;
                v3--;
            }
        }
        }
        return x;
    }
}