package leetcode.romanToInteger;

import org.junit.Test;

/**
 * @author Robert17
 * @create2022-10-05-15:08
 */
public class Test1
{
    @Test
    public void test1()
    {
        Solution solution = new Solution();
        int iii = solution.romanToInt("MCMXCIV");
        System.out.println(iii);
    }
}
