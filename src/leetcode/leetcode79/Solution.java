package leetcode.leetcode79;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean exist(char[][] board, String word) {
        char[] wordArray = word.toCharArray();
        int[][] pass = new int[board.length][board[0].length];
        ArrayList<Character> result = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == wordArray[0]){
                    dataBacking(board,wordArray,result,i,j,pass);
                }
                if (result.size() == wordArray.length){
                    return true;
                }
            }
        }

        return false;
    }
    private List<Character> dataBacking(char[][] board, char[] wordArray, List<Character> result, int x, int y,int[][] pass){
        if (x >= board.length || y >= board[0].length || x < 0 || y < 0){
            return result;
        }
        if (result.size() == wordArray.length){
            return result;
        }
        if (board[x][y] != wordArray[result.size()]){
            return result;
        }
        if (pass[x][y] == 1){
            return result;
        }
        List<Character> list;
        result.add(board[x][y]);
        pass[x][y] = 1;
        list = dataBacking(board, wordArray, result, x + 1, y,pass);
        if (list.size() == wordArray.length){
            return list;
        }
        list = dataBacking(board, wordArray, result, x - 1 , y ,pass);
        if (list.size() == wordArray.length){
            return list;
        }
        list = dataBacking(board, wordArray, result, x , y + 1,pass);
        if (list.size() == wordArray.length){
            return list;
        }
        list = dataBacking(board, wordArray, result, x , y - 1,pass);
        if (list.size() == wordArray.length){
            return list;
        }
        result.remove((Character) board[x][y]);
        pass[x][y] = 0;
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        boolean abcced = solution.exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "SEE");
        boolean abcced = solution.exist(new char[][]{{'a', 'b'}, {'c', 'd'}}, "acdb");
        System.out.println(abcced);
    }
}