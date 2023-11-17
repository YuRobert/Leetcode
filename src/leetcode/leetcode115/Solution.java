package leetcode.leetcode115;

class Solution {
    public int numDistinct(String s, String t) {
        int[][] dp =new int[t.length() + 1][s.length() + 1];
        for (int i = 0; i < t.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (t.charAt(i) == s.charAt(j)) {
                    if (i == 0){
                        dp[i + 1][j + 1] = dp[i + 1][j] + 1;
                    }else{
                        dp[i + 1][j + 1] = dp[i + 1][j] + dp[i][j];
                    }

                }else{
                    dp[i + 1][j + 1] = dp[i + 1][j];
                }
            }

        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                System.out.print(dp[i][j]);
            }
            System.out.println();
        }
        return dp[t.length()][s.length()];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        int i = solution.numDistinct("rabbbit", "rabbit");
//        int i = solution.numDistinct("babgbag", "bag");
        int i = solution.numDistinct("aabb", "ab");
        System.out.println(i);
    }
}