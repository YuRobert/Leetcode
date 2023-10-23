package leetcodeweek.week20231022;

/**
 * @author Robert17
 * @create2023-10-22-18:59
 */
public class Problem2
{
    public int minimumSum(int[] nums) {
        int n = nums.length;
        int[] suf = new int[n];
        int[] pre = new int[n];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n ; i++)
        {
            suf[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < n ; i++)
        {
            pre[i] = Integer.MAX_VALUE;
        }
        suf[n - 1] = nums[n -1];
        for (int i = nums.length - 2; i > 0; i--)
        {
            suf[i] = Math.min(suf[i + 1],nums[i]);
        }
        pre[0] = nums[0];
        for (int i = 1; i < n; i++)
        {
            pre[i] = Math.min(pre[i - 1],nums[i]);
        }

        for (int i = 0; i < n; i++)
        {
            if (nums[i] > pre[i] && nums[i] > suf[i]) {
                min = Math.min(min, nums[i] + pre[i] + suf[i]);
            }
        }
        return min == Integer.MAX_VALUE?-1:min;
    }

    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int i = solution.minimumSum(new int[]{8,6,1,5,3});
        System.out.println(i);
    }
}
