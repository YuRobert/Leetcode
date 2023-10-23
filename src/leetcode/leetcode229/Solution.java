package leetcode229;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


class Solution {
    //计数法
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Long> map = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        long limit = nums.length / 3;
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Long> entry : map.entrySet())
        {
            if (entry.getValue() > limit)
            {
                list.add(entry.getKey());
            }
        }
        return list;
    }
    //摩尔投票法
}