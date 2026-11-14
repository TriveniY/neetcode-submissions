class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n+1][amount+1];
        
        for(int i =0;i<=n;i++){
            dp[i][0] = 0;
        }
        for(int j=1;j<=amount;j++){
            dp[0][j] = Integer.MAX_VALUE;
        }
        for(int i=1;i<=n;i++){
            for(int j =1;j<=amount;j++){
                int picked = Integer.MAX_VALUE;
                if(j>=coins[i-1]){
                    picked = dp[i][j-coins[i-1]];
                }
                int nonPicked = dp[i-1][j];
                if(picked != Integer.MAX_VALUE){
                    picked = 1+picked;
                }

                dp[i][j] = Math.min(picked,nonPicked);
            }
        }
        return dp[n][amount] == Integer.MAX_VALUE?-1:dp[n][amount];
    }
}
