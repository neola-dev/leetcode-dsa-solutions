class Solution {

    // This method calculates the maximum profit that can be achieved
    // by buying and selling the stock only once.
    public int maxProfit(int[] prices) {

        // Initialize minimum price with the first day's price
        int min = prices[0];

        // Variable to store the maximum profit found so far
        int maxProfit = 0;

        // Traverse the price array starting from day 1
        for (int i = 1; i < prices.length; i++) {

            // Calculate profit if we sell on the current day
            int cost = prices[i] - min;

            // Update maximum profit if current profit is higher
            maxProfit = Math.max(maxProfit, cost);

            // Update minimum price if a lower price is found
            min = Math.min(min, prices[i]);
        }

        // Return the maximum profit
        return maxProfit;
    }
}
