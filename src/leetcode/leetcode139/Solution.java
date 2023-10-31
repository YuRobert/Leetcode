package leetcode.leetcode139;

import java.util.Arrays;
import java.util.List;

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean [] dp = new boolean[s.length() + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = false;
        }
        dp[0] = true;
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < wordDict.size(); j++) {
                if (i >= wordDict.get(j).length()){
                    dp[i] = (dp[i - wordDict.get(j).length()] && s.startsWith(wordDict.get(j), i - wordDict.get(j).length())) || dp[i];
                }

            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        boolean b = solution.wordBreak("applepenapple", Arrays.asList("apple", "pen"));
        System.out.println(b);
    }
}