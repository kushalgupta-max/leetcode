class Solution 
{
    public int maxNumberOfBalloons(String s) {
        String t=s.replaceAll("[^balon]","");
        int v=t.length();
        if(v<7)
        {
            return 0;
        }
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<v;i++)
        {
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }
        if(!map.containsKey('l')||!map.containsKey('b')||!map.containsKey('a')||!map.containsKey('o')||!map.containsKey('n'))
        {
            return 0;
        }
        map.put('l',map.get('l')/2);
        map.put('o',map.get('o')/2);
        int min=Integer.MAX_VALUE;
        for(Integer i:map.values())
        {
            min=Math.min(min,i);
        }
        return min;
    }
}