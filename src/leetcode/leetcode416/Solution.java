package leetcode.leetcode416;

import java.util.concurrent.ForkJoinPool;

public class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        if (sum % 2 != 0 )
        {
            return false;
        }
        int capacity = sum/2;
        int[][] dp = new int[nums.length][capacity];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < capacity; j++) {
                if (i == 0){
                    if (nums[i] > j){
                        dp[i][j] = capacity;
                    }else{
                        dp[i][j] = capacity - nums[i];
                    }
                }

            }

        }

        for (int i = 1; i < nums.length; i++) {
            for (int j = 1; j < capacity; j++) {
                dp[i][j] = Math.min(dp[i-1][j],dp[i-1][j-nums[i]] - nums[i]);
            }
        }

        if (dp[nums.length - 1][capacity - 1] == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1,5,11,5};
        boolean b = solution.canPartition(nums);
        System.out.println(b);
    }
}
