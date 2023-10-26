package leetcode.leetcode416;

import java.util.concurrent.ForkJoinPool;

public class Solution {
    //用二维dp数组
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
                    if (nums[i] > j + 1 ){
                        dp[i][j] = capacity;
                    }else{
                        dp[i][j] = capacity - nums[i];
                    }
                }
                if (j == 0 && i > 0){
                    if (nums[i] > j + 1){
                        dp[i][j] = dp[i - 1][j];
                    }else{
                        dp[i][j] = capacity - nums[i];
                    }
                }

            }

        }

        for (int i = 1; i < nums.length; i++) {
            for (int j = 1; j < capacity; j++) {
                if (nums[i] < j+1)
                {
                    dp[i][j] = Math.min(dp[i-1][j],dp[i-1][j-nums[i]] - nums[i]);
                }else {
                    dp[i][j] = dp[i - 1][j];
                }

            }
        }

        if (dp[nums.length - 1][capacity - 1] == 0) return true;
        return false;
    }

    //用一维dp数组
    public boolean canPartition2(int[] nums){

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        if (sum % 2 != 0 )
        {
            return false;
        }
        int capacity = sum/2;
        int[] dp = new int[capacity];
        for (int i = 0; i < capacity; i++) {
           if (i+1>=nums[0])
           {
               dp[i] = capacity - nums[0];
           }else {
               dp[i] = capacity;
           }

        }

        for (int i = 1; i < nums.length; i++) {
            for (int j = capacity - 1; j >= 0; j--) {
                if (nums[i] < j+1)
                {
                    dp[j] = Math.min(dp[j],dp[j-nums[i]] - nums[i]);
                }
            }
        }
        if (dp[capacity - 1] == 0)
        {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{3,3,3,4,5};
        boolean b = solution.canPartition2(nums);
        System.out.println(b);
    }
}
