package leedcode.problem121;

public class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            // Update minimum price
            minPrice = Math.min(minPrice, prices[i]);

            // Update maximum profit if selling at current price gives a higher profit
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example usage:
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = solution.maxProfit(prices);

        System.out.println("Maximum Profit: " + result);
    }
}

