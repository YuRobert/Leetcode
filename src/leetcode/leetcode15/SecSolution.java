package leetcode.leetcode15;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Robert17
 * @create2022-10-20-21:06
 */
public class SecSolution
{
    int flag = 0;
    public List<List<Integer>> threeSum(int[] nums)
    {
        List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Collections.sort(numsList);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if (allIsLarge(nums) || allIsSmall(nums) || nums.length < 3)
        {
            list = null;
            return result;
        }

        for (int i = 0; i < numsList.size(); i++)
        {
            if (numsList.get(i) > 0)
            {
                break;
            }
            int j = numsList.size() - 1;
            while (j > i)
            {
                if(numsList.get(j) < 0)
                {
                    break ;
                }
                int m = 0 - numsList.get(i) - numsList.get(j);
                if (numsList.contains(m) && numsList.indexOf(m) != i && numsList.indexOf(m) != j)
                {
                    list = new ArrayList<>();
                    list.add(numsList.get(i));
                    list.add(numsList.get(j));
                    list.add(m);
                    Collections.sort(list);
                    result.add(list);
                }
                j--;
            }
        }

        LinkedHashSet<List<Integer>> hashSet = new LinkedHashSet<>(result);
        ArrayList<List<Integer>> listWithoutDuplicates = new ArrayList<>(hashSet);
        return listWithoutDuplicates;
    }

    public boolean allIsSmall(int[] nums)
    {
        for (int i = 0; i < nums.length; i++)
        {
            if(nums[i] >= 0)
            {
                return false;
            }
        }
        return true;
    }
    public boolean allIsLarge(int[] nums)
    {
        for (int i = 0; i < nums.length; i++)
        {
            if(nums[i] <= 0)
            {
                return false;
            }
        }
        return true;
    }
}
