package leetcode.leetcode343;

/**
 * @author Robert17
 * @create2023-10-23-20:50
 */
public class Solution
{


    public int integerBreak1(int n) {
        int[] dp = new int[n + 1];
//        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
//        dp[3]
        for (int i = 3; i < n+1; i++) {
            for (int j = 1; j < i ; j++) {
                dp[i] = Math.max(Math.max(j*(i-j),j*dp[i - j]),Math.max(dp[i],dp[j]*dp[i -j]));
            }
        }

        return dp[n];
    }

    public int integerBreak2(int n) {
        int[] dp = new int[n + 1];
//        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        for (int i = 4; i < n+1; i++) {
            for (int j = 1; j < i/2 + 1 ; j++) {
                dp[i] = Math.max(dp[i],dp[j]*dp[i -j]);
            }
        }

        return dp[n];
    }

    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int i = solution.integerBreak2(8);
        System.out.println(i);
    }

}
