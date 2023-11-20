package leetcodeweek.week20231119.problem4;

import java.util.Arrays;

class Solution {
    public int[] leftmostBuildingQueries(int[] heights, int[][] queries) {
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++)
        {
            int index = -1;
            if (queries[i][0] == queries[i][1]){
                index = queries[i][0];
                result[i] = index;
                continue;
            }
            if (heights[Math.max(queries[i][0],queries[i][1])] > heights[Math.min(queries[i][0],queries[i][1])]){
                index = Math.max(queries[i][0],queries[i][1]);
                result[i] = index;
                continue;
            }
            for (int j = Math.max(queries[i][0],queries[i][1]); j < heights.length; j++)
            {
                if (heights[j] > heights[queries[i][0]] && heights[j] > heights[queries[i][1]] ){
                    index = j;
                    break;
                }
            }
            result[i] = index;
        }
        return result;
    }

    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int[] h = new int[]{5,3,8,2,6,1,4,6};
        int[][] q = new int[][]{{0,7},{3,5},{5,2},{3,0},{1,6}};
        int[] ints = solution.leftmostBuildingQueries(h, q);
        Arrays.stream(ints).forEach(System.out::println);
    }
}