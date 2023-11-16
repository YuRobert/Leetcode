package leetcode.leetcode674;

class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int[] dp = new int[nums.length];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = 1;
        }
        int max = 1;
        for (int i = 1; i < dp.length; i++) {
            if (nums[i] > nums[i - 1]){
                dp[i] = dp[i - 1] + 1;
            }
            max = Math.max(max,dp[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int lengthOfLCIS = solution.findLengthOfLCIS(new int[]{1, 3, 5, 4, 7});
        System.out.println(lengthOfLCIS);
    }
}