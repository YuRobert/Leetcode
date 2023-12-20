package leetcode.leetcode59;

import java.util.Arrays;

class Solution {
    public int[][] generateMatrix(int n) {

        int x = 0;
        int y = 0;
        int count = 1;
        int[][] ints = new int[n][n];

        for (int i = 0; i < n/2; i++) {
            int l = x;
            int j = y;
            for (; j < n-i-1; j++) {
                ints[l][j] = count++;
            }
            for (; l < n-i-1 ; l++) {
                ints[l][j] = count++;
            }
            for (; j > i; j--) {
                ints[l][j] = count++;
            }

            for (; l > i; l--) {
                ints[l][j] = count++;
            }
            x++;
            y++;
        }
        if (n % 2 == 1){
            ints[x][y] = count;
        }
        return ints;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] ints = solution.generateMatrix(3);
        for (int[] anInt : ints) {
            Arrays.stream(anInt).forEach(System.out::print);
            System.out.println();
        }
    }
}