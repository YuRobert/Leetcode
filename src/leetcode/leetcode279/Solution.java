package leetcode.leetcode279;

class Solution {
    public int numSquares(int n) {
        int[] dp= new int[n + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = Integer.MAX_VALUE - 1;
        }
        dp[0] = 0;
        for (int i = 0; i <= Math.sqrt(n); i++) {
            for (int j = i*i; j < dp.length; j++) {
                dp[j] = Math.min(dp[j - i*i] +1, dp[j]);
            }
        }

        return dp[n];
        
    }
    public static void main(String[] args) {
//        int[] coins = new int[]{1, 2, 5};
        Solution solution = new Solution();
        int i = solution.numSquares(12);
        System.out.println(i);
    }

}