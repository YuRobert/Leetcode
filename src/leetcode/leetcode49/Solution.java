package leetcode.leetcode49;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<List<Character>, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            contains(map,strs[i]);
        }
        List<List<String>> list = map.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toList());
        return list;
    }
    private void contains(Map<List<Character>, List<String>> map,String string){
        char[] chars = string.toCharArray();
        Arrays.sort(chars);
        List<Character> characterList = new ArrayList<>();
        for (char c : chars) {
            characterList.add(c); // 装箱操作
        }

        if (!map.containsKey(characterList)){
            ArrayList<String> list = new ArrayList<>();
            list.add(string);
            map.put(characterList,list);
        }else {
            List<String> list = map.get(characterList);
            list.add(string);
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<String>> lists = solution.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        for (List<String> list : lists) {
            list.forEach(System.out::print);
            System.out.println();
        }
    }
}