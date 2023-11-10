package leetcode.leetcode188;

import javax.lang.model.element.VariableElement;

class Solution {
    public int maxProfit(int k, int[] prices) {
        int[][]  dp = new int[prices.length][2*k];
        for (int i = 0; i < dp[0].length; i++) {
            if (i % 2 == 0){
                dp[0][i] = -prices[0];
            }else {
                dp[0][i] = 0;
            }
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (j == 0){
                    dp[i][j] = Math.max(dp[i - 1][j],-prices[i]);
                    continue;
                }
                if (j % 2 == 1){
                    dp[i][j] = Math.max(dp[i - 1][j],dp[i][j-1]+prices[i]);
                }else {
                    dp[i][j] = Math.max(dp[i - 1][j],dp[i][j-1]-prices[i]);
                }

            }
        }
        return dp[prices.length - 1][2*k - 1];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.maxProfit(2, new int[]{3,2,6,5,0,3});
        System.out.println(i);
    }
}