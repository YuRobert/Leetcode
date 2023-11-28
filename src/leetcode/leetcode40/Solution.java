package leetcode.leetcode40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> result = new LinkedList<>();
        List<Integer> path = new ArrayList<>();
        int[] used = new int[candidates.length];
        int currentSum = 0;
        Arrays.sort(candidates);
        backTracking(result,path,candidates,target,currentSum,0,used);
        return result;
    }
    private void backTracking(List<List<Integer>> result,List<Integer> path,int[] candidates,int target,int currentSum,int startIndex,int[] used){
        if (currentSum > target){
            return;
        }
        if (currentSum == target){
            if (!result.contains(path)){
                result.add(new ArrayList<>(path));
            }
            return;
        }
        for (int i = startIndex; i < candidates.length; i++) {
            if (i > 1 && candidates[i] == candidates[i - 1] && used[i - 1] == 0 && startIndex != 0){
                continue;
            }
            used[i] = 1;
            path.add(candidates[i]);
            currentSum += candidates[i];
            backTracking(result,path,candidates,target,currentSum,i+1,used);
            path.remove(path.size() - 1);
            currentSum -= candidates[i];
            used[i] = 0;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        List<List<Integer>> lists = solution.combinationSum2(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, 30);
        List<List<Integer>> lists = solution.combinationSum2(new int[]{2,5,2,1,2},5);
        for (List<Integer> list : lists) {
            list.forEach(System.out::print);
            System.out.println();
        }
    }
}