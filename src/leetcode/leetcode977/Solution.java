package leetcode.leetcode977;

class Solution {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (Math.abs(nums[i]) < Math.abs(nums[j])){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) Math.pow(nums[i],2);
        }
        return nums;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = solution.sortedSquares(new int[]{-4, -1, 0, 3, 10});
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}