package leetcode.leetcode35;

/**
 * @author Robert17
 * @create2022-10-29-20:23
 */
public class Solution
{
    public int searchInsert(int[] nums, int target) {
        int head = 0;
        int bot = nums.length -1;
        int val;
        if(nums[head] == target)
        {
            return head;
        }
        if(nums[bot] == target)
        {
            return bot;
        }
        while(head +1 <bot)
        {
            val = nums[(head + bot)/2];
            if(val < target)
            {
                head = (head + bot)/2;
            }
            else if(val > target)
            {
                bot = (head + bot)/2;
            }
            else
            {
                return (head + bot)/2;
            }
        }
        return head +1;
    }
}
