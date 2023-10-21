package leetcode.leetcode15;

import java.util.*;

/**
 * @author Robert17
 * @create2022-10-20-19:48
 */
public class Solution
{
    public List<List<Integer>> threeSum(int[] nums) {

        for (int i=0 ; i < nums.length-1; i++)
        {
            for(int j = i; j < nums.length;j++ )
            {
                if(nums[i]>nums[j])
                {
                    int t = nums[i];
                    nums[i] = nums[j];
                    nums[j] = t;
                }
            }
        }



        ArrayList<List<Integer>> list  = new ArrayList<>();
        for (int i = 0; i < nums.length-2;i ++)
        {
            if(i > 0 && nums[i] == nums[i-1])
            {
                continue;
            }
            int left = i + 1;
            int right = nums.length -1;
            while(left < right)
            {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum < 0)
                {
                    left += 1;
                    while(nums[left-1] == nums[left]&& left<right)
                    {
                        left += 1;
                    }
                }
                else if (sum > 0)
                {
                    right -= 1;
                    while(nums[right+1] == nums[right]&& left<right)
                    {
                        right -= 1;
                    }
                }
                else
                {
                    list.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left += 1;
                    while(nums[left-1] == nums[left] && left<right)
                    {
                        left += 1;
                    }
                    right -= 1;
                    while(nums[right+1] == nums[right] && left<right)
                    {
                        right -= 1;
                    }
                }
            }

        }
        return list;
    }

    public static void main(String[] args)
    {
        int[] a = new int[]{34,55,79,28,46,33,2,48,31,-3,84,71,52,-3,93,15,21,-43,57,-6,86,56,94,74,83,-14,28,-66,46,-49,62,-11,43,65,77,12,47,61,26,1,13,29,55,-82,76,26,15,-29,36,-29,10,-70,69,17,49};
        Solution solution = new Solution();
        List<List<Integer>> list = solution.threeSum(a);

        list.forEach(System.out::println);
    }
}
