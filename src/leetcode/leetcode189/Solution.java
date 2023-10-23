package leetcode189;

import java.util.Arrays;

class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;


        if (k < nums.length/2.0)
        {
            for (int i = 0; i < k; i++) {
                int temp = nums[nums.length - 1];
                for (int j = nums.length - 1; j > 0; j--) {
                    nums[j] = nums[j - 1];
                }
                nums[0] = temp;
            }
        }
        else
        {
            for (int i = 0; i < nums.length - k; i++) {
                int temp = nums[0];
                for (int j = 0; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[nums.length - 1] = temp;
            }
        }


    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1,2,3};
        solution.rotate(nums,2);
        Arrays.stream(nums).forEach(System.out:: print);
    }
}