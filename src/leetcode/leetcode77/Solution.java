package leetcode.leetcode77;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dataBack(n,k,1,path,result);
        return result;
    }

    public void dataBack(int n ,int k, int startIndex,List<Integer> path,List<List<Integer>> result){
        if (path.size() == k){
            List<Integer> list = path.stream().collect(Collectors.toList());
            result.add(list);
            return;
        }
        for (int i = startIndex; i <= n-(k-path.size()) + 1; i++) {
            path.add(i);
            dataBack(n,k,i + 1,path, result);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> combine = solution.combine(4, 2);
        for (List<Integer> list : combine) {
            list.stream().forEach(System.out::print);
            System.out.println();
        }
    }
}