package leetcode.leetcode128;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

class Solution {
    //先排序再计算
    public int longestConsecutive1(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            Integer x = iterator.next();
            int len = 1;
            if (map.containsKey(x - 1)){
                len += map.get(x - 1);
            }
            if (map.containsKey(x + 1)){
                len += map.get(x + 1);
            }
            map.put(x,len);
            result = Math.max(result,len);
        }
        return result;
    }
    //一开始的想法
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int len = 1;
            if (map.containsKey(nums[i])){
                continue;
            }
            if (map.containsKey(nums[i] - 1)){
                len += map.get(nums[i] - 1);
            }
            if (map.containsKey(nums[i] + 1)){
                len += map.get(nums[i] + 1);
            }
            map.put(nums[i],len);
            map.put(nums[i] - map.getOrDefault(nums[i] - 1,0),len);
            map.put(nums[i] + map.getOrDefault(nums[i] + 1,0),len);
            result = Math.max(result,len);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1});
//        int i = solution.longestConsecutive(new int[]{1,0,-1});
        System.out.println(i);
    }
}