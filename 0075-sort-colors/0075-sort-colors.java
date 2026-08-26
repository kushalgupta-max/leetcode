class Solution {
    public void sortColors(int[] l) {
      int n=l.length-1;   
      int mid=0;
      int low=0;
      int high=n;
      int swap=0;
      while(mid<=high)
      {
        if(l[mid]==0)
        {
            swap=l[mid];
            l[mid]=l[low];
            l[low]=swap;
            mid++;
            low++;
        }
        else if(l[mid]==2)
        {
            swap=l[mid];
            l[mid]=l[high];
            l[high]=swap;
            high--;
        }
        else if(l[mid]==1)
        {
            mid++;
        }
      }
      for(int i=0;i<=n;i++)
      {
        System.out.println(l[i]);
      }
    }
}