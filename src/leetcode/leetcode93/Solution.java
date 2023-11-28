package leetcode.leetcode93;

import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.restoreIpAddresses("101023");
    }
    public List<String> restoreIpAddresses(String s) {
        List<List<String>> result = new LinkedList<>();
        List<String> path = new LinkedList<>();
        backTracking(result,path,0,s);
        List<String> stringList = result.stream().filter(list -> list.size() == 4)
                .map(list -> String.join(".", list))
                .collect(Collectors.toList());

        for (String s1 : stringList) {
            System.out.println(s1);
        }
        return stringList;
    }
    public void backTracking(List<List<String>> result, List<String> path, int startIndex,String s){
        if (path.size() > 4){
            return;
        }
        if (startIndex >= s.length()){
            result.add(new LinkedList<>(path));
            return;
        }
        for (int i = startIndex + 1; i <= s.length(); i++) {
            if (check(s.substring(startIndex,i))){
                path.add(s.substring(startIndex,i));
                backTracking(result,path,i,s);
                path.remove(path.size() - 1);
            }
        }
    }
    public boolean check(String s){
        if (s.length() > 1 && s.charAt(0) == '0'){
            return false;
        }
        if (s.length() > 3){
            return false;
        }
        Integer integer = Integer.valueOf(s);
        if (integer > 255){
            return false;
        }
        return true;
    }
}