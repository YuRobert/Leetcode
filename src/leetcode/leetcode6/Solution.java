package leetcode.leetcode6;

import com.sun.deploy.util.StringUtils;

public class Solution {
    public String convert(String s, int numRows) {
        char[][] z = new char[s.length()][numRows];
        String result = "";
        int index = 0;
        int x = 0;
        int y = 0;
        if (numRows == 1){
            return s;
        }
        while (index < s.length()){
            while (y < numRows - 1 && index < s.length()){
                z[x][y] = s.charAt(index);
                y++;
                index++;
            }
            while (y > 0 && index < s.length()){
                z[x][y] = s.charAt(index);
                x++;
                y--;
                index++;
            }

        }
        for (int j = 0; j < z[0].length; j++){
            for (int i = 0; i < z.length; i++) {
                if (z[i][j] != '\0'){
                    result = result + z[i][j];
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
         String s = "Apalindromeisaword,phrase,number,orothersequenceofunitsthatcanbereadthesamewayineitherdirection,withgeneralallowancesforadjustmentstopunctuationandworddividers.";
        int numRows = 3;
        Solution solution = new Solution();
        String convert = solution.convert(s, numRows);
        System.out.println(convert);
    }
}
