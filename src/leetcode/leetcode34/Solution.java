package leetcode.leetcode34;

import java.time.chrono.MinguoChronology;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = lower(nums, target);
        if (start == nums.length || nums[start] != target){
            return new int[]{-1,-1};
        }
        int end = lower(nums,target + 1) - 1;
        return new int[]{start,end};

    }

    private int lower(int [] nums ,int target){
        int left = -1;
        int right = nums.length;

        while (left + 1 < right){
            int mid = left + (right - left) / 2;
            if (nums[mid] < target){
                left = mid ;
            }else{
                right = mid;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = solution.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}