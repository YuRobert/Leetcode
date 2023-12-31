package leetcode.leetcode63;

import jdk.nashorn.internal.runtime.regexp.joni.ast.Node;

/**
 * @author Robert17
 * @create2023-10-23-20:15
 */
public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        if (obstacleGrid[0][0] == 1)
        {
            return 0;
        }

        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (i ==0 && j==0)
                {
                    dp[0][0] = 1;
                    continue;
                }
                if (obstacleGrid[i][j] == 1)
                {
                    dp[i][j] = 0;
                }
                else if (i == 0 && j > 0)
                {
                    dp[i][j] = dp[i][j - 1];
                }
                else if (j == 0 && i > 0)
                {
                    dp[i][j] = dp[i - 1][j];
                }
                else
                {
                    dp[i][j] = dp[i-1][j] + dp[i][j - 1];
                }
            }
        }

        return dp[m-1][n-1];
    }

    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int[][] obstacleGrid= new int[][]{{0,1},{0,0}};
        int i = solution.uniquePathsWithObstacles(obstacleGrid);
        System.out.println(i);
    }
}
