package leetcode.leetcode494;

public class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = nums[i] + sum;
        }
        if ((sum + target)%2 != 0 || sum + target < 0){
            return 0;
        }
        int capacity = (sum + target)/2;
        int[] dp = new int[capacity + 1];
        dp[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = capacity; j >=nums[i]; j--) {
                if (j >=nums[i]){
                    dp[j] = dp[j - nums[i]] + dp[j];
                }

            }
        }
        return dp[capacity];
    }

    //官方答案
    public int findTargetSumWays1(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int diff = sum - target;
        if (diff < 0 || diff % 2 != 0) {
            return 0;
        }
        int neg = diff / 2;
        int[] dp = new int[neg + 1];
        dp[0] = 1;
        for (int num : nums) {
            for (int j = neg; j >= num; j--) {
                dp[j] += dp[j - num];
            }
        }
        return dp[neg];
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1000};
        int targetSumWays = solution.findTargetSumWays(nums,-1000);
        System.out.println(targetSumWays);
    }
}
