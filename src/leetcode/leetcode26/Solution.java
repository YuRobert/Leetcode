package leetcode.leetcode26;

/**
 * @author Robert
 * @create2022-10-28-15:14
 */
public class Solution
{
    public int removeDuplicates(int[] nums)
    {
        int count = 0;
        int cur = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[cur] != nums[i])
            {
                cur++;
                nums[cur] = nums[i];
                i++;
            }
        }
        return cur+1;
    }
}
