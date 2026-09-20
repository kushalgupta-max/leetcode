class Solution {
    public int reverseDegree(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int x=27;
        for(char i='a';i<='z';i++)
        {
            map.put(i,--x);
        }
        char l[]=s.toCharArray();
        int n=l.length-1;
        int v=1;
        int result=0;
        for(int i=0;i<=n;i++)
        {
            result=result+(v*map.get(l[i]));
            v++;
        }
        return result;
    }
}