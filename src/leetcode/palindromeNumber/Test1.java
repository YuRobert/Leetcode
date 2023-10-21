package leetcode.palindromeNumber;

import org.junit.Test;

/**
 * @author Robert17
 * @create2022-10-05-14:42
 */
public class Test1
{
    @Test
    public void test1()
    {
        Solution solution = new Solution();
        boolean palindrome = solution.isPalindrome2(12321);
        System.out.println(palindrome);
    }
}
