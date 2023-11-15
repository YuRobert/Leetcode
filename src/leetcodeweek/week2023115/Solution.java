package leetcodeweek.week2023115;

class Solution {
    public int findChampion(int[][] grid) {
        int champion = -1;
        for (int i = 0; i < grid[0].length; i++)
        {
            for (int j = 0; j < grid.length; j++)
            {
                if (grid[j][i] == 1){
                    break;
                }
                if (j == grid.length - 2 && grid[j][i] == 0){
                    champion = i;
                }
            }
        }
        return champion;
    }
}