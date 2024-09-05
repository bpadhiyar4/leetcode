class Solution {
    public int maxProfit(int[] prices) {

        int buy = -1;
        int sell = -1;
        int len = prices.length;
        int max = 0;

        for (int price : prices) {
            if (buy == -1 || buy > price) {
                buy = price;
                sell = price;
            } else if (sell == -1 || sell <= price) {
                sell = price;
                int profit = sell - buy;
                if (profit > max) {
                    max = profit;
                }
            }
        }
        return max;
    }
}