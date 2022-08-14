class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int sellPrice = prices[prices.length - 1];
        
        for(int i = prices.length - 2; i>=0; i--) {
            sellPrice = Math.max(sellPrice, prices[i+1]);
            profit = Math.max(profit, sellPrice - prices[i]);
        }
        
        return profit;
    }
}