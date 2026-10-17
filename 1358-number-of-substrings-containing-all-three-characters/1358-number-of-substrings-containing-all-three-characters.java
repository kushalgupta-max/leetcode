class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int x=0;
        int count=0;
        int max=0;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(!map.containsKey(s.charAt(i)))
            {
                x++;
            }
            map.put(s.charAt(i),i);
            if(x==3)
            {
                max=Integer.MAX_VALUE;
                for(Integer j:map.values())
                {
                    max=Math.min(max,j);
                }
            count=count+max+1;
            }
        }
        return count;
    }
}