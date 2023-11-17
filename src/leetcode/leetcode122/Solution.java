package leetcode.leetcode122;


class Solution {
    public int maxProfit(int[] prices) {
        int[] dp = new int[prices.length];
        for (int i = 1; i < prices.length; i++)
        {
            dp[i] = Math.max(dp[i - 1],dp[i-1] + prices[i] - prices[i - 1]);
        }
        return dp[prices.length - 1];
    }

    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int i = solution.maxProfit(new int[]{1,2,3,4,5});
        System.out.println(i);
    }
}