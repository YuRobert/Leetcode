package leetcode.leetcode118;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        ArrayList<int[]> rowList = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            int[] row = new int[i + 1];
            row[0] = 1;
            row[i] = 1;
            for (int j = 1; j < i; j++) {
                row[j] = rowList.get(i -1)[j - 1]+rowList.get(i -1)[j];
            }
            rowList.add(row);
        }
        for (int[] ints : rowList) {
            List<Integer> list = Arrays.stream(ints)
                    .boxed()
                    .collect(Collectors.toList());
            lists.add(list);
        }
        return lists;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> generate = solution.generate(5);
    }
}