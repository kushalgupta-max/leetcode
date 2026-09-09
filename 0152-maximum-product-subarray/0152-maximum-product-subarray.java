class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max =Integer.MIN_VALUE;
        for(int start =0;start<n;start++){
            int product = 1;
            for(int end =start;end<n;end++){
                product *=nums[end];
                if(product>max){
                    max =product;
                }
            }
        }
        return max;
        
    }
}