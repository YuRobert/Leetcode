package leetcode.leetcode746;

/**
 * @author Robert17
 * @create2023-10-22-19:25
 */
public class Solution
{
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length ;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i <= n; i++)
        {
            dp[i] = Math.min(dp[i -1] + cost[i -1],dp[i - 2] + cost[i -2]);
        }
        return dp[n];
    }

    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int minCostClimbingStairs = solution.minCostClimbingStairs(new int[]{10, 15, 20});
        System.out.println(minCostClimbingStairs);
    }
}
