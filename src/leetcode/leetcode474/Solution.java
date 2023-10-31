package leetcode.leetcode474;

class Solution {


    //m个0 n个1
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m+1][n+1];



        for (int i = 0; i < strs.length; i++) {
            int count0 = count('0', strs[i]);
            int count1 = count('1', strs[i]);
            for (int j = m; j >= 0; j--) {
                for (int k = n;  k >= 0 ; k--) {
                    if (j>= count0 && k >=count1){
                        dp[j][k] = Math.max(dp[j][k],dp[j-count0][k - count1] + 1);
                    }
                }
            }
        }
        return dp[m][n];
    }
    public int count(char a , String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == a){
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = new String[]{"10", "0", "1"};

        int maxForm = solution.findMaxForm(strs, 1, 1);
        System.out.println(maxForm);
    }
}