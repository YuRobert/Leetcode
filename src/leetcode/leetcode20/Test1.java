package leetcode.leetcode20;

import org.junit.Test;

/**
 * @author Robert17
 * @create2022-10-26-19:44
 */
public class Test1
{
    @Test
    public void test1()
    {
        Solution solution = new Solution();
        boolean valid = solution.isValid("()[]{}");
        System.out.println(valid);
    }
}
