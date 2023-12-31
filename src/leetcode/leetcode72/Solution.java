package leetcode.leetcode72;

class Solution {
    //第一次不会
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length() + 1][word2.length() + 1];

        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = i;
        }
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = i;
        }

        for (int i = 0; i < word1.length(); i++) {
            for (int j = 0; j < word2.length(); j++) {
                if (word1.charAt(i) == word2.charAt(j)){
                    dp[i + 1][j + 1] = dp[i][j];
                }else{
                    dp[i+1][j+1] = Math.min(Math.min(dp[i + 1][j],dp[i][j + 1]),dp[i][j])+1;
                }
            }
        }
        return dp[word1.length()][word2.length()];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.minDistance("", "a");
        System.out.println(i);
    }
}