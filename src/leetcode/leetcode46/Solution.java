package leetcode.leetcode46;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> path = new LinkedList<>();
        int[] used = new int[nums.length];
        Arrays.sort(nums);
        backTracking(result,path,used,nums);
        return result;
    }
    public void backTracking ( List<List<Integer>> result, List<Integer> path,int[] used,int[] nums){
        if (path.size() >= nums.length){
            result.add(new LinkedList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i] == 1){
                continue;
            }
            if (i > 0 && nums[i] ==nums[i - 1] && used[i - 1] == 0){
                continue;
            }
            used[i] = 1;
            path.add(nums[i]);
            backTracking(result,path,used,nums);
            path.remove(path.size() - 1);
            used[i] = 0;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> permute = solution.permute(new int[]{1, 1, 2});
        for (List<Integer> integers : permute) {
            integers.forEach(System.out::print);
            System.out.println();
        }
    }
}