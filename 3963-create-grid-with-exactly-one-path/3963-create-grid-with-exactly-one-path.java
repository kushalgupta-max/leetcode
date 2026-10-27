class Solution {
    public String[] createGrid(int m, int n) {
        String[]ans=new String[m];
        int index=0;
        for(int i=0;i<m;i++){
            String sub="";
            for(int j=0;j<n;j++){
                if(i==0 || j==n-1){
                    sub+=".";
                }
                else{
                    sub+="#";
                }
            }
            ans[index++]=sub;
        }
        return ans;
    }
}