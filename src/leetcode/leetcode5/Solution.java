package leetcode5;

public class Solution {
    public String longestPalindrome(String s) {
        for (int i = s.length(); i > 0; i--) {
            for (int j = 0; j <= s.length() - i ; j++) {
                boolean palindrome = this.isPalindrome(s.substring(j,j+i));
                if (palindrome)
                {
                    return s.substring(j ,i+j);
                }
            }
        }
        return "";
    }
    private boolean isPalindrome(String s)
    {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)){
                i++;
                j--;
                continue;
            }else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = solution.longestPalindrome("babad");
        System.out.println(s);
    }
}
