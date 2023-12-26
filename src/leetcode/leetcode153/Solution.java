package leetcode.leetcode153;

class Solution {
    public int findMin(int[] nums) {
        int left = -1;
        int right = nums.length - 1;
        while (left  + 1 < right){
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[nums.length - 1]){
                right = mid;
            }else{
                left = mid;
            }
        }
        return nums[right];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int min = solution.findMin(new int[]{3, 4, 5, 1, 2});
        System.out.println(min);
    }
}