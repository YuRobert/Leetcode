package leetcode125;

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while (left < right)
        {
            while (!(Character.isLetter(s.charAt(left)) || Character.isDigit(s.charAt(left)))&& left < right)
            {
                left++;
            }
            while (!(Character.isLetter(s.charAt(right)) || Character.isDigit(s.charAt(right)))&& left < right)
            {
                right--;
            }
            if (s.charAt(left) == s.charAt(right))
            {
                left++;
                right--;
                continue;
            }
            else
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean palindrome = solution.isPalindrome("race a car");
        System.out.println(palindrome);
    }
}