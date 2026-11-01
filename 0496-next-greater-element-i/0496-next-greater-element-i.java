class Solution {
    public int[] nextGreaterElement(int[] l, int[] k) {
        int n=l.length;
        int m=k.length;
        int ans[]=new int[m];
        Stack<Integer>stack=new Stack<>();
        stack.push(k[m-1]);
        ans[m-1]=-1;
        for(int i=m-2;i>=0;i--)
        {
            while(!stack.isEmpty()&&stack.peek()<k[i])
            {
                stack.pop();
            }
            if(!stack.isEmpty())
            {
                ans[i]=stack.peek();
            }
            else
            {
                ans[i]=-1;;
            }
            stack.push(k[i]);
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<m;i++)
        {
            map.put(k[i],ans[i]);
        }
        for(int i=0;i<n;i++)
        {
            l[i]=map.get(l[i]);
        }
        return l;
    }
}