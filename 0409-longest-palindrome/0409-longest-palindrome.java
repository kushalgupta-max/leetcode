class Solution {
    public int longestPalindrome(String s) {
        int n=s.length();
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int count=0;
        int x=0;
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                if(map.get(s.charAt(i))%2==0)
                {
                    count=count+map.get(s.charAt(i));
                }
                else
                {
                    count=count+map.get(s.charAt(i));
                    count--;
                    x=1;
                }
            }
            map.remove(s.charAt(i));
        }
        if(x==1)
        {
            count++;
        }
        return count;
    }
}