package leetcode.leetcode17;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.length() < 1){
            return null;
        }
        HashMap<Character, String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        StringBuilder path = new StringBuilder();
        LinkedList<String> result = new LinkedList<>();
        dataBack(digits,0,result,path,map);
        return result;
    }

    private void dataBack(String digits,int startIndex,List<String> result,StringBuilder path,HashMap<Character, String> map){
        if (path.length() == digits.length()){
            result.add(path.toString());
            return;
        }
        for (int i = 0; i < map.get(digits.charAt(startIndex)).length(); i++) {
            path.append(map.get(digits.charAt(startIndex)).charAt(i));
            dataBack(digits,startIndex+1,result,path,map);
            path.deleteCharAt(path.length() - 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> strings = solution.letterCombinations("");
        strings.forEach(System.out::print);
    }
}