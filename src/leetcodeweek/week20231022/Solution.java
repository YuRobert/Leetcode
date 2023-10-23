package leetcodeweek.week20231022;

class Solution {
    public int minimumSum(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int minc = Integer.MAX_VALUE;
        for (int j = 1; j < n - 1; j++) {
            int c = nums[j];
            if (c > minc)
            {
                continue;
            }
            int leftMin = Integer.MAX_VALUE;
            int rightMin = Integer.MAX_VALUE;
            // 寻找c左边的最小值
            for (int i = 0; i < j; i++) {
                if (nums[i] < c) {
                    leftMin = Math.min(leftMin, nums[i]);
                }
            }
            // 寻找c右边的最小值
            for (int k = j + 1; k < n; k++) {
                if (nums[k] < c) {
                    rightMin = Math.min(rightMin, nums[k]);
                }
            }
            // 如果 leftMin 和 rightMax 都被更新了，说明找到了合适的a、b、c
            if (leftMin != Integer.MAX_VALUE && rightMin != Integer.MAX_VALUE) {
                min = Math.min(min, leftMin + c + rightMin);
                minc = c;
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }


    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int [] nums = new int[]{5,4,8,7,10,2};
        int i = solution.minimumSum(nums);
        System.out.println(i);
    }
}