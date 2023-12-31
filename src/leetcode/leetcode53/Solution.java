package leetcode.leetcode53;

class Solution {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = nums[0];
        for (int i = 1; i < dp.length; i++) {
            dp[i] = Math.max(dp[i - 1]+ nums[i],nums[i]);
            max = Math.max(max,dp[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        System.out.println(i);
    }
}