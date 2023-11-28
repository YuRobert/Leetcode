package leetcode.leetcode39;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> path = new ArrayList<>();
        int currentSum = 0;
        backTracking(result,path,candidates,target,currentSum,0);
        return result;
    }
    private void backTracking(List<List<Integer>> result,List<Integer> path,int[] candidates,int target,int currentSum,int startIndex){
        if (currentSum > target){
            return;
        }
        if (currentSum == target){
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i < candidates.length; i++) {
            path.add(candidates[i]);
            currentSum += candidates[i];
            backTracking(result,path,candidates,target,currentSum,i);
            path.remove(path.size() - 1);
            currentSum -= candidates[i];
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> lists = solution.combinationSum(new int[]{2, 3, 6, 7}, 7);
        for (List<Integer> list : lists) {
            list.forEach(System.out::print);
            System.out.println();
        }
    }
}