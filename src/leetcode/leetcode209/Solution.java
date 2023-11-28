package leetcode.leetcode209;

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int sum = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target){
                int len = i - j + 1;
                result = Math.min(len,result);
                sum -= nums[j];
                j++;
            }
        }
        if (result == Integer.MAX_VALUE){
            return 0;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int len = solution.minSubArrayLen(7, new int[]{2,3,1,2,4,3});
        System.out.println(len);
    }
}