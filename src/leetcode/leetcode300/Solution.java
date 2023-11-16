package leetcode.leetcode300;

class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int max = 1;
        for (int i = 0; i < dp.length; i++) {
            dp[i] = 1;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0 ; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[j] + 1,dp[i]);
                }
            }
            max = Math.max(dp[i],max);
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18});
        System.out.println(i);
    }
}