package leetcode.leetcode1143;

import java.util.Arrays;

class Solution {
//    public int longestCommonSubsequence(String text1, String text2) {
//        char[] t1 = text1.toCharArray();
//        char[] t2 = text2.toCharArray();
//        int result = 0;
//        int[][] dp = new int[t1.length + 1][t2.length + 1];
//        for (int i = 0; i < t1.length; i++) {
//            for (int j = 0; j < dp[0].length - 1; j++) {
//                if (t1[i] == t2[j]){
//                    int max = 0;
//                    for (int k = 0; k < i; k++) {
//                        for (int l = 0; l < j; l++) {
//                            max = Math.max(dp[k+1][l + 1],max);
//                        }
//                    }
//                    dp[i + 1][j + 1] = max + 1;
//                    result = Math.max(result,dp[i + 1][j + 1]);
//                }
//                System.out.print(dp[i + 1][j + 1]);
//            }
//            System.out.println();
//
//        }
//        return result;
//    }

    public int longestCommonSubsequence(String text1, String text2) {
        char[] t1 = text1.toCharArray();
        char[] t2 = text2.toCharArray();
        int result = 0;
        int[][] dp = new int[t1.length + 1][t2.length + 1];
        for (int i = 0; i < t1.length; i++) {
            for (int j = 0; j < dp[0].length - 1; j++) {
                if (t1[i] == t2[j]) {
                    dp[i + 1][j + 1] = dp[i][j] + 1;
                }else{
                    dp[i + 1][j + 1] = Math.max(dp[i][j + 1],dp[i + 1][j]);
                }
            }
        }
        return dp[t1.length][t2.length];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.longestCommonSubsequence("abcde", "ace");
        System.out.println(i);
    }
}