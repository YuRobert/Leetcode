package leetcode.leetcode392;

class Solution {
    public boolean isSubsequence(String s, String t) {

        int left = 0;
        int right = 0;
        while (left < s.length())
        {
            if (right >= t.length())
            {
                return false;
            }
            while ( left < s.length() && right < t.length() && s.charAt(left) != t.charAt(right))
            {
                right ++;
            }
            while (left< s.length() && right < t.length() && s.charAt(left) == t.charAt(right))
            {
                right ++;
                left ++;
            }

        }
        return true;
    }
    //用动态规划做
    public boolean isSubsequence2(String s, String t) {
        int[][] dp = new int[s.length() + 1][t.length() + 1];
        for (int i = 0; i < dp.length - 1; i++) {
            for (int j = 0; j < dp[0].length - 1; j++) {
                if (s.charAt(i) == t.charAt(j)){
                    dp[i + 1][j + 1] = dp[i][j] + 1;
                }else{
                    dp[i + 1][j + 1] = Math.max(dp[i + 1][j],dp[i][j + 1]);
                }
            }
        }
        return  (dp[s.length()][t.length()] == s.length());

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean subsequence = solution.isSubsequence("abc", "ahbgdc");
        System.out.println(subsequence);
    }
}