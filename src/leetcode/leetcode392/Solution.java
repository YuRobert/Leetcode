package leetcode392;

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

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean subsequence = solution.isSubsequence("axc", "ahbgdc");
        System.out.println(subsequence);
    }
}