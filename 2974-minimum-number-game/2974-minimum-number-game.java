class Solution {
    public int[] numberGame(int[] l) {
        int n=l.length;
        Arrays.sort(l);
        int i=0;
        int j=1;
        int swap=0;
        while(j<n)
        {
            swap=l[i];
            l[i]=l[j];
            l[j]=swap;
            i=i+2;
            j=j+2;
        }
        return l;
    }
}