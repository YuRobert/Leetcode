package leetcode.leetcode242;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))){
                Integer count = map.get(s.charAt(i));
                count ++;
                map.put(s.charAt(i),count);
            }else{
                map.put(s.charAt(i),1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (!map.containsKey(t.charAt(i))){
                return false;
            }else {
                Integer count = map.get(t.charAt(i));
                count--;
                map.put(t.charAt(i),count);
            }
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if (entry.getValue()!= 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean anagram = solution.isAnagram("anagram", "nagaram");
    }
}