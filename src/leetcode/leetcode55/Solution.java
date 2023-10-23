package leetcode55;

public class Solution {

    public boolean canJump(int[] nums) {
        int cover = 0;
        if (nums.length == 1)
        {
            return true;
        }
        for (int i = 0; i <= cover; i++) {
            cover = Math.max(cover,i + nums[i]);
            if (cover >= nums.length - 1)
            {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,0,0};
        Solution solution = new Solution();
        boolean b = solution.canJump(nums);
        System.out.println(b);
    }
}
