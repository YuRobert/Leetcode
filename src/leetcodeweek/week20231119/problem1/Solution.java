package leetcodeweek.week20231119.problem1;

import com.sun.org.apache.xpath.internal.WhitespaceStrippingElementMatcher;

class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        if (s1.charAt(0) != s2.charAt(0) || s3.charAt(0) != s2.charAt(0) || s1.charAt(0) != s3.charAt(0)){
            return -1;
        }
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int result = 0;
        while (p1 < s1.length() && p2 < s2.length() && p3 < s3.length()){
            if (s1.charAt(p1) == s2.charAt(p2) && s3.charAt(p3) == s2.charAt(p2) && s1.charAt(p1) == s3.charAt(p3)){
                p1++;
                p2++;
                p3++;
                result++;
            }else{
                break;
            }
        }
        return s1.length() + s2.length() + s3.length() - 3*result;
    }

    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int minimumOperations = solution.findMinimumOperations("abc", "abb", "ab");
        System.out.println(minimumOperations);
    }
}