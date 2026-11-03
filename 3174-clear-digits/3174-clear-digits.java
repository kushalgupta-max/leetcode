class Solution {
    public String clearDigits(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            if(!Character.isDigit(s.charAt(i)))
            {
                sb.append(s.charAt(i));
            }
            else
            {
                sb.deleteCharAt(sb.length()-1);
            }
        }
        String t=new String(sb);
        return t;
    }
}