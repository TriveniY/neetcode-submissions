class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int left = 0;
        int maxProfit = 0;
        for(int right =0;right<n;right++){
            int buyingPrice = prices[left];
            int currentPrice = prices[right];
            if(currentPrice<buyingPrice){
                left = right;
            }
            int profit = prices[right]-prices[left];
            maxProfit = Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
}
