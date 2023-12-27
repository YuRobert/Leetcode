package leetcode.leetcode76;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String minWindow(String s, String t) {

        String result = "";
        for (int i = 0; i < s.length(); i++) {
            String target = getTarget(i, s, t);
            if (target.equals("")){
                continue;
            }
            if (result.equals("")){
                result = target;
            }else {
                result = result.length() < target.length()?result:target;
            }
        }
        return result;
    }
    private String getTarget(int start,String s,String t){
        List<Character> tList = new ArrayList<>();
        for (char c : t.toCharArray()) {
            tList.add(c); // 装箱操作
        }
        for (int j = start ; j < s.length(); j++) {
            if (tList.contains(s.charAt(j))){
                tList.remove((Character)s.charAt(j));
            }
            if (tList.isEmpty()){
                return s.substring(start,j + 1);
            }
        }
        return "";
    }
//：s = "ADOBECODEBANC", t = "ABC"
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = solution.minWindow("ADOBECODEBANC", "ABC");
        System.out.println(s);
    }
}