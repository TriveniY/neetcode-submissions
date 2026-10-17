class Solution {
    int[] dp;
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        dp = new int[n];
        for(int i =0;i<n;i++){
            dp[i] = -1;
        }  
        return robHouse(nums,nums.length-1);
    }
    public int robHouse(int[] nums, int n){
        if(n==0) return nums[0] ; 
        if(n ==1) return Math.max(nums[0],nums[1]);
        if(dp[n]!=-1) return dp[n];
        return dp[n] = Math.max(nums[n]+robHouse(nums,n-2),robHouse(nums,n-1));    
    }
}
