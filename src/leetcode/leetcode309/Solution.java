package leetcode.leetcode309;

/**
 * @author Robert17
 * @create2023-11-11-16:34
 */
public class Solution
{
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][3];
        dp[0][0] = -prices[0];
        dp[0][1] = 0;
        dp[0][2] = 0;
        for (int i = 1; i < dp.length; i++)
        {
            dp[i][0] = Math.max(dp[i - 1][0],dp[i - 1][1] - prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1],dp[i - 1][2]);
            dp[i][2] = dp[i -1][0] + prices[i];
        }
        for (int i = 0; i < dp.length; i++)
        {
            for (int i1 = 0; i1 < dp[0].length; i1++)
            {
                System.out.print(dp[i][i1] + " ");
            }
            System.out.println();
        }
        return Math.max(dp[prices.length - 1][1],dp[prices.length - 1][2]);
    }

    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int i = solution.maxProfit(new int[]{1,2,4});
        System.out.println(i);
    }

}
