package leetcode.leetcode322;

class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = Integer.MAX_VALUE - 1;
        }
        dp[0] = 0;
//        dp[1] = 1;
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j < dp.length; j++) {
                dp[j] = Math.min(dp[j - coins[i]] + 1,dp[j]);
            }
        }
        if (dp[amount] == Integer.MAX_VALUE - 1){
            return -1;
        }
        return dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = new int[]{1, 2, 5};
        Solution solution = new Solution();
        int i = solution.coinChange(coins, 11);
        System.out.println(i);
    }
}