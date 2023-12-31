package leetcode.leetcode583;

class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length() + 1][word2.length() + 1];

        for (int i = 0; i < word1.length(); i++) {
            for (int j = 0; j < word2.length(); j++) {
                if (word1.charAt(i) == word2.charAt(j)){
                    dp[i + 1][j + 1] = dp[i][j] + 1;
                }else{
                    dp[i + 1][j + 1] = Math.max(dp[i + 1][j],dp[i][j + 1]);
                }
            }
        }
        return word1.length() + word2.length() - 2 *dp[word1.length()][word2.length()];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.minDistance("eat", "tea");
        System.out.println(i);
    }
}