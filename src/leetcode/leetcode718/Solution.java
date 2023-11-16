package leetcode.leetcode718;

class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int[][] dp = new int[nums1.length + 1][nums2.length + 1];
        int max = 0;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (nums1[i - 1] == nums2[j - 1]){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                max = Math.max(max,dp[i][j]);
            }
        }
        return max;
    }




    //暴力搜索法超时
//    public int findLength(int[] nums1, int[] nums2) {
//        int[][] dp = new int[nums1.length][nums2.length];
//        for (int i = 0; i < nums1.length; i++) {
//            for (int j = 0; j < nums2.length; j++) {
//                int m = i;
//                int n = j;
//                while (m < nums1.length && n < nums2
//                .length && nums1[m] == nums2[n]){
//                    m ++;
//                    n ++;
//                    dp[i][j]++;
//                }
//            }
//        }
//        int max = 0;
//        for (int i = 0; i < nums1.length; i++) {
//            for (int j = 0; j < nums2.length; j++) {
//                max = Math.max(dp[i][j],max);
//            }
//
//        }
//        return max;
//    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int length = solution.findLength(new int[]{0,0,0,0,0}, new int[]{0,0,0,0,0});
        System.out.println(length);
    }
}