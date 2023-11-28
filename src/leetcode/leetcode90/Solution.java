package leetcode.leetcode90;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> path = new LinkedList<>();
        Arrays.sort(nums);
        int[] used = new int[nums.length];
        backTracking(result,path,nums,0,used);
        return result;
    }
    public void backTracking(List<List<Integer>> result,List<Integer> path , int[] nums ,int startIndex,int[] used){
        if (nums.length + 1 - startIndex == 0){
            result.add(new LinkedList<>(path));
            return;
        }
        result.add(new LinkedList<>(path));
        for (int i = startIndex; i < nums.length; i++) {
            if (i > 0 && used[i - 1] == 0 && nums[i] == nums[i - 1]){
                continue;
            }
            path.add(nums[i]);
            used[i] = 1;
            backTracking(result,path,nums,i + 1,used);
            path.remove(path.size() - 1);
            used[i] = 0;
        }
    }

    public static void main(String[] args) {
     Solution solution = new Solution();
        List<List<Integer>> subsets = solution.subsetsWithDup(new int[]{0});
        for (List<Integer> subset : subsets) {
            subset.forEach(System.out::print);
            System.out.println();
        }
    }
}