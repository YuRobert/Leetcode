package leetcode.leetcode56;

import javax.lang.model.element.VariableElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> list = Arrays.stream(intervals).collect(Collectors.toList());
        Boolean flag = true;
        while (flag){
            flag = false;
            for (int i = 0; i < list.size(); i++) {
                for (int j = i+1; j < list.size(); j++) {
                    if (list.get(i)[1] >= list.get(j)[0] && list.get(j)[1] >= list.get(i)[0]){
                        int[] low = list.get(i);
                        int[] up = list.get(j);

                        list.add(new int[]{Math.min(low[0],up[0]),Math.max(low[1],up[1])});
                        list.remove(low);
                        list.remove(up);
                        flag = true;
                    }else if (list.get(i)[0] <= list.get(j)[1] && list.get(j)[0] <= list.get(i)[1]){
                            int[] up = list.get(i);
                            int[] low = list.get(j);

                            list.add(new int[]{Math.min(low[0],up[0]),Math.max(low[1],up[1])});
                            list.remove(low);
                            list.remove(up);
                            flag = true;
                    }
                }
            }
        }
        int[][] ints = list.toArray(new int[0][]);
        return ints;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[][] ints = {{1, 3}, {2, 6}, {5, 10},{12,16},{9,12}};
        int[][] ints = {{0, 0}, {0, 0}};
        int[][] merge = solution.merge(ints);
        for (int i = 0; i < merge.length; i++) {
            for (int i1 = 0; i1 < merge[0].length; i1++) {
                System.out.print(merge[i][i1]);
            }
            System.out.println();
        }
    }
//    private List<int[]> databack(List<int[]> list){
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = 0; j < list.size(); j++) {
//                if (list.get(i)[1] >= list.get(j)[0]){
//                    list.add(new int[]{list.get(i)[0],list.get(j)[1]});
//                    list.remove(list.get(i));
//                    list.remove(list.get(j));
//                }
//            }
//        }
//    }
}