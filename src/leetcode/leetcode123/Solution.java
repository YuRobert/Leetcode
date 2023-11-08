package leetcode.leetcode123;

class Solution {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][4];
        dp[0][0] = -prices[0];
        dp[0][2] = -prices[0];
        for (int i = 1; i < dp.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0],dp[i][0] - prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1],dp[i -1][0] + prices[i]);
            dp[i][2] = Math.max(dp[i - 1][2],dp[i][1] - prices[i]);
            dp[i][3] = Math.max(dp[i - 1][3],dp[i -1][2] + prices[i]);
        }
        return dp[prices.length - 1][3];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] prices= new int[] {1,2,3,4,5};
        int i = solution.maxProfit(prices);
        System.out.println(i);
    }
}