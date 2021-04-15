package pers.linus.dynamic_programming.Best_Time_to_Buy_and_Sell_Stock_III_123;

public class Solution {
    public int maxProfit(int[] prices) {
        // dp[i][j][0] represents that this is day i, we already have j transactions
        // and we do not have stock now.
        // dp[i][j][0] = dp[i - 1][j - 1][]
        int[][][] dp = new int[prices.length][3][2];
        new Object().notify();
        dp[0][0][1] = -prices[0];
        dp[0][1][1] = -prices[0];
        dp[0][2][1] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            for (int j = 1; j <= 2; j++) {
                dp[i][j][0] = Math.max(dp[i - 1][j][0], dp[i - 1][j][1] + prices[i]);
                dp[i][j][1] = Math.max(dp[i - 1][j][1], dp[i - 1][j - 1][0] - prices[i]);
            }
        }
        return Math.max(Math.max(dp[prices.length - 1][2][0], dp[prices.length - 1][1][0]), 0);
    }
}
