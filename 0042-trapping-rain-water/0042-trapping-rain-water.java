class Solution {
    public int trap(int[] l) {
        
         //calculating lmb
        int left[]=new int[l.length];
        left[0]=l[0];
        for(int i=1;i<=l.length-1;i++)
        {
            left[i]=Math.max(left[i-1],l[i]);
        }
        //calculating rmb
        int right[]=new int[l.length];
        right[l.length-1]=l[l.length-1];
        for(int i=l.length-2;i>=0;i--)
        {
            right[i]=Math.max(right[i+1],l[i]);
        }
        //calculating trapped rain water
        int trappedwater[]=new int[l.length];
        for(int i=0;i<l.length;i++)
        {
            int x=Math.min(right[i],left[i]);
            trappedwater[i]=x-l[i];
        }
        // calculating total trapped water
        int totaltrappedwater=0;
        for(int i=0;i<l.length;i++)
        {
            totaltrappedwater=totaltrappedwater+trappedwater[i];
        }
           return totaltrappedwater;
   }
}