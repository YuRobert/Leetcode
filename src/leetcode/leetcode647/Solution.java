package leetcode.leetcode647;

class Solution {
    public int countSubstrings(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        int result = 0;
        for (int i = 0; i < dp.length; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                if (i == j || ((i == j + 1 || i == j + 2) && s.charAt(i) == s.charAt(j))){
                    dp[i][j] = true;
                }
                if (s.charAt(i) == s.charAt(j) && i - j > 2){
                    dp[i][j] = dp[i - 1][j + 1];

                }
                if (dp[i][j]){
                    result ++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int abc = solution.countSubstrings("aaaaa");
        System.out.println(abc);
    }
}