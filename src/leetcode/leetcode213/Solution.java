package leetcode.leetcode213;

class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length - 1];
        int[] nums1 = new int[nums.length - 1];
        int[] nums2 = new int[nums.length - 1];
        if (nums.length == 1)
        {
            return nums[0];
        }
        if (nums.length == 2)
        {
            return Math.max(nums[0],nums[1]);
        }

        for (int i = 0; i < nums.length - 1; i++) {
            nums1[i] = nums[i];
        }
        for (int i = 1; i < nums.length; i++) {
            nums2[i-1] = nums[i];
        }
        int a = rob1(nums1);
        int b = rob1(nums2);
        return Math.max(a,b);


    }
    public int rob1(int[] nums){
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
        int[] ints = {1, 2, 3, 1};
        int rob = solution.rob(ints);
        System.out.println(rob);
    }
}