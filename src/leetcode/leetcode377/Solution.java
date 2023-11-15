package leetcode.leetcode377;



class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i >= nums[j]){
                    dp[i] = dp[i - nums[j]] + dp[i];
                }
            }
        }
        return dp[target];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1,2,3};
        int i = solution.combinationSum4(nums,4);
        System.out.println(i);
    }
}