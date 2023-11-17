package leetcode.leetcode45;

class Solution {
    //[2,3,1,1,4]
    // 0 1  1 2 2
    //用贪心算法做的
    public int jump(int[] nums) {
        if (nums.length <= 1){
            return 0;
        }
        int minStep = 1;
        int i = 0;
        int next = 0;
        int maxReachDistance = 0;
        while (i + nums[i] < nums.length - 1){
            for (int j = i ; j <= nums[i] + i; j++) {
                if (nums[j] + j > maxReachDistance ){
                    maxReachDistance = nums[j] + j;
                    next = j;
                }
            }
            i = next;
            minStep++;
        }
        return minStep;
    }

    //用动态规划做
    public int jump2(int[] nums) {
        //不会，只会贪心
        return 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int jump = solution.jump(new int[]{2,3,1,1,4});
        System.out.println(jump);
    }
}