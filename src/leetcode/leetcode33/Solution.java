package leetcode.leetcode33;

import java.lang.annotation.Target;
import java.util.logging.Level;

class Solution {
    public int search(int[] nums, int target) {
        int min = index(nums);
        int index = -1;
        if (target > nums[nums.length - 1]){
            index = index(nums, target, 0, min - 1);
        }else{
            index = index(nums,target,min,nums.length - 1);
        }
        return index;
    }

    public int index(int nums[]){
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[nums.length - 1]){
                left = left + 1;
            }else {
                right = right - 1;
            }
        }
        return left;
    }
    public int index(int nums[] ,int target,int left,int right){
        while (left <= right){
            int mid = left + (right - left) / 2;
            if (nums[mid] < target){
                left = left + 1;
            }else {
                right = right - 1;
            }
        }
        if (nums[left] == target){
            return left;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int search = solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0);
        System.out.println(search);
    }

}