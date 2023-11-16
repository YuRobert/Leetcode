package leetcode.leetcode221;

class Solution {
    public int maximalSquare(char[][] matrix) {
        int[][] dp = new int[matrix.length ][matrix[0].length];
        int maxSide = 0;
        for (int i = 0; i < dp.length; i++)
        {
            if (matrix[i][0] == '1'){
                dp[i][0] = 1;
            }
            maxSide = Math.max(maxSide, dp[i][0]);
        }
        for (int i = 0; i < dp[0].length; i++)
        {
            if (matrix[0][i] == '1'){
                dp[0][i] = 1;
            }
            maxSide = Math.max(maxSide, dp[0][i]);
        }

        for (int i = 1; i < dp.length; i++)
        {
            for (int j = 1; j < dp[0].length; j++)
            {
                if (matrix[i][j] == '1' && matrix[i - 1][j] == '1' && matrix[i][j - 1] == '1'){
                    dp[i][j] = Math.min(Math.min(dp[i][j - 1] + 1,dp[i - 1][j] + 1),dp[i -1][j -1] + 1);
                }else {
                    if (matrix[i][j] == '1'){
                        dp[i][j] = 1;
                    }else {
                        dp[i][j] = 0;
                    }

                }
                maxSide = Math.max(maxSide, dp[i][j]);
            }
        }
        return maxSide * maxSide;
    }

    public static void main(String[] args)
    {
        
        Solution solution = new Solution();
//        int i = solution.maximalSquare(new char[][]{{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}});
        int i = solution.maximalSquare(new char[][]{{'1','0','1','0'},{'1','0','1','1'},{'1','0','1','1'},{'1','1','1','1'}});
        System.out.println(i);
    }
}