package leetcode.leetcode152;

class Solution {
    public int maxProduct(int[] nums) {
        int[][] dp = new int[nums.length][2];
        dp[0][0] = nums[0];
        dp[0][1] = nums[0];
        int result = nums[0];
        for (int i = 1; i < dp.length; i++)
        {

            dp[i][0] = Math.max(Math.max(dp[i - 1][0]*nums[i],dp[i - 1][1]*nums[i]),nums[i]);

            dp[i][1] = Math.min(Math.min(dp[i - 1][0]*nums[i],dp[i - 1][1]*nums[i]),nums[i]);

            result = Math.max(Math.max(dp[i][1],dp[i][0]),result);
        }
        return result;
    }

    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int i = solution.maxProduct(new int[]{2,3,-2,4});
        System.out.println(i);
    }
}