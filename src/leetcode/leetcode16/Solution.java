package leetcode.leetcode16;

import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = 1000000;
        for (int i = 0; i < nums.length; i++) {

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right){
                result =Math.abs(result - target) > Math.abs(nums[i] + nums[left] + nums[right] - target)?nums[i] + nums[left] + nums[right]:result;
                if (nums[i] + nums[left] + nums[right] > target){
                    right --;
                }
                else if (nums[i] + nums[left] + nums[right] < target){
                    left ++;
                }else{
                    return target;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.threeSumClosest(new int[]{0,0,0,}, 1);
        System.out.println(i);
    }
}