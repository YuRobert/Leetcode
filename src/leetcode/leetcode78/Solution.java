package leetcode.leetcode78;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> path = new LinkedList<>();
        backTracking(result,path,nums,0);
        return result;
    }

    public void backTracking(List<List<Integer>> result,List<Integer> path , int[] nums ,int startIndex){
        if (nums.length + 1 - startIndex == 0){
            result.add(path);
            return;
        }
        result.add(new LinkedList<>(path));
        for (int i = startIndex; i < nums.length; i++) {
            path.add(nums[i]);
            backTracking(result,path,nums,i + 1);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> subsets = solution.subsets(new int[]{1, 2, 3});
        for (List<Integer> subset : subsets) {
            subset.forEach(System.out::print);
            System.out.println();
        }
    }
}