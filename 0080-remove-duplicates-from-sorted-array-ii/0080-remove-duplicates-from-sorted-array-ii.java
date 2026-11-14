class Solution {
    public int removeDuplicates(int[] l) {
        int n=l.length;
        ArrayList<Integer>stack=new ArrayList<>();
        stack.add(l[0]);
        int x=1;
        for(int i=1;i<n;i++)
        {
            if(stack.get(stack.size()-1)==l[i])
            {
                if(x<2)
                {
                    stack.add(l[i]);
                }
                x++;
            }
            else
            {
                x=1;
                stack.add(l[i]);
            }
        }
        int j=stack.size();
        int v=0;
        for(int i:stack)
        {
            l[v]=i;
            v++;
        }
        return j;
    }
}