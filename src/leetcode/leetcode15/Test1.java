package leetcode.leetcode15;

import org.junit.Test;

import java.util.List;

/**
 * @author Robert17
 * @create2022-10-20-20:10
 */
public class Test1
{
    @Test
    public void test1()
    {
        SecSolution solution = new SecSolution();
        int[] nums= new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> list = solution.threeSum(nums);
        list.forEach(System.out::println);
//        for (List<Integer> list1: list)
//        {
////            list1.forEach(System.out::println);
//            System.out.println(list);
//        }
    }
}
