package leetcode.leetcode51;

import java.awt.font.NumericShaper;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<String>> lists = solution.solveNQueens(4);
        for (List<String> list : lists) {

            list.forEach(System.out::println);
            System.out.println();
        }
    }


    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new LinkedList<>();
        List<String> path = new LinkedList<>();
        int[][] used = new int[n][n];
        backTracking(result,path,used,0);
        for (List<String> list : result) {
            list.replaceAll(s -> s.replace('1', 'Q').replace('0', '.'));
        }
        return result;
    }
    public void backTracking(List<List<String>> result,List<String> path,int[][] used,int row){
        if (row >= used.length){
            result.add(new LinkedList<>(path));
            return;
        }

        for (int i = 0; i < used.length; i++) {
            if (!check(used,row, i)){
                continue;
            }
            used[row][i] = 1;
            path.add(Arrays.stream(used[row]).mapToObj(String::valueOf).collect(Collectors.joining()));
            backTracking(result,path,used,row + 1);
            used[row][i] = 0;
            path.remove(path.size() - 1);
        }
    }
    private boolean check(int[][] used,int row,int col){
        for (int i = 0; i < row; i++) {
            if (used[i][col] == 1){
                return false;
            }
        }
        // 检查 45度角是否有皇后
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (used[i][j] == 1) {
                return false;
            }
        }
        // 检查 135度角是否有皇后
        for (int i = row - 1, j = col + 1; i >= 0 && j < used.length; i--, j++) {
            if (used[i][j] == 1) {
                return false;
            }
        }
        return true;
    }
}