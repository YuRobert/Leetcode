package leetcode80;

class Solution {
    public int removeDuplicates(int[] nums) {
        int quick = 2;
        int slow = 2;

        while (quick < nums.length)
        {
            if (nums[quick] != nums[slow-2])
            {
                nums[slow] = nums[quick];
                quick++;
                slow++;
            }
            else
            {
                quick++;
            }
        }
        return slow+1;
    }
}