package leetcode.leetcode26;

import org.junit.Test;

/**
 * @author Robert17
 * @create2022-10-28-15:15
 */
public class Test26
{
    @Test
    public void test1()
    {
        Solution solution = new Solution();
        int[] s = new int[]{1,1,2};
        int k = solution.removeDuplicates(s);
        System.out.println(k);
        System.out.println("***************************");
        for (int i : s)
        {
            System.out.println(i);
        }
    }
}
