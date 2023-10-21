package leetcode.leetcode18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        
        for(int i = 0; i < nums.length -1; i++)
        {
            for(int j = i + 1; j <nums.length ; j++)
            {
                if(nums[i]>nums[j])
                {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        for(int i = 0; i < nums.length-3; i++)
        {
            long x = nums[i];
            if((x + nums[i+1] + nums[i+2] + nums[3]) > target)
            {
                continue;
            }
            if((x + nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3])< target)
            {
                continue;
            }
            if(i > 0 && nums[i] == nums[i-1])
            {
                continue;
            }
            for(int j = i+1;j < nums.length -2; j++)
            {
                if(j > i+1 && nums[j] == nums[j-1])
                {
                   continue;
                }
                int y = nums[j];
                int left = j + 1;
                int right = nums.length - 1;
                while(left < right)
                {
                    if(x + y + nums[left] + nums[right] < target && left < right)
                    {
                        left++;
                        while(nums[left - 1] == nums[left])
                        {
                            left++;
                        }
                    }
                    else if (x + y + nums[left] + nums[right] > target && left < right)
                    {
                        right--;
                        while(nums[right + 1] == nums[right])
                        {
                            right--;
                        }
                    }
                    else
                    {
                        list.add(Arrays.asList((int)x,y,nums[left],nums[right]));
                        left++;
                        while(nums[left - 1] == nums[left] && left<right)
                        {
                            left++;
                        }
                        right--;
                        while(nums[right + 1] == nums[right]&& left<right)
                        {
                            right--;
                        }
                    }
                    
                }
            }
        }

        return list;

    }

    public static void main(String[] args)
    {
        Solution solution = new Solution();

        int[] a = new int[]{0,0,0,1000000000,1000000000,1000000000,1000000000};
        List<List<Integer>> list = solution.fourSum(a, 1000000000);
        list.forEach(System.out::println);
    }
}


