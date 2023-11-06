package leetcode.leetcode198;

class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        if (nums.length == 1)
        {
            return nums[0];
        }
        if (nums.length == 2)
        {
            return Math.max(nums[0],nums[1]);
        }
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);

        for (int j = 2; j < dp.length ; j++) {
            dp[j] = Math.max(dp[j-2] + nums[j],dp[j-1]);
        }

        return dp[nums.length - 1];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{2,7,9,3,1};
        int rob = solution.rob(nums);
        System.out.println(rob);
    }
}