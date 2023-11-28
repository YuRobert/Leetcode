package leetcode.leetcode704;

class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = (end - start) / 2 + start;
            if (nums[mid] == target){
                return mid;
            }
            else if (target > nums[(start + end)/2]){
                start = mid + 1;
            }
            else if (target < nums[(start + end)/2]){
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int search = solution.search(new int[]{-1,0,3,5,9,12}, 9);
        System.out.println(search);
    }
}