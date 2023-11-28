package leetcode.leetcode491;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> path = new LinkedList<>();
        int[] used = new int[nums.length];
//        Arrays.sort(nums);

        backTracking(result,path,0,nums);

        return result;
    }
    public void backTracking( List<List<Integer>> result, List<Integer> path,int startIndex,int[] nums){
        if (path.size() >= 2){
            result.add(new LinkedList<>(path));
        }
        HashSet<Integer> integers = new HashSet<>();
        for (int i = startIndex; i < nums.length; i++) {
            if ((path.size()  > 0 && nums[i] < path.get(path.size() - 1)) || integers.contains(nums[i])){
                continue;
            }
            path.add(nums[i]);
            integers.add(nums[i]);
            backTracking(result,path,i + 1,nums);
            path.remove(path.size() - 1);

        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> result = solution.findSubsequences(new int[]{4, 4, 3, 2});
        for (List<Integer> integers : result) {
            integers.forEach(System.out::print);
            System.out.println();
        }
    }
}