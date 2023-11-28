package leetcode.leetcode131;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new LinkedList<>();
        List<String> path = new LinkedList<>();
        backTracking(result,path,0,s);
        for (List<String> strings : result) {
            strings.forEach(System.out::println);
            System.out.println();
        }
        return result;
    }

    public void backTracking(List<List<String>> result,List<String> path,int startIndex,String s){
        if (startIndex >= s.length()){
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex + 1; i <= s.length(); i++) {
            if (isPalindrome(s.substring(startIndex,i))){
                path.add(s.substring(startIndex,i));
                backTracking(result,path,i,s);
                path.remove(path.size() - 1);
            }else{
                continue;
            }
        }

    }
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while (left < right)
        {
            while (!(Character.isLetter(s.charAt(left)) || Character.isDigit(s.charAt(left)))&& left < right)
            {
                left++;
            }
            while (!(Character.isLetter(s.charAt(right)) || Character.isDigit(s.charAt(right)))&& left < right)
            {
                right--;
            }
            if (s.charAt(left) == s.charAt(right))
            {
                left++;
                right--;
                continue;
            }
            else
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        String s = "hello";
//        System.out.println(s.substring(0, 1));
        Solution solution = new Solution();
        solution.partition("a");
    }

}