package leetcode.leetcode216;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int sum = 0;
        List<Integer> path = new LinkedList<>();
        List<List<Integer>> result = new LinkedList<>();
        dataBack(k,n,1,path,result,sum);
        return result;
    }
    public void dataBack(int k, int n,int startIndex,List<Integer> path,List<List<Integer>> result,int sum){
//        int sum = 0;
//        for (Integer integer : path) {
//            sum += integer;
//        }

        if (path.size() == k){
            if (sum == n){
                List<Integer> list = path.stream().collect(Collectors.toList());
                result.add(list);
            }
            return;
        }else{
            if (sum > n || (n-sum) < startIndex){
                return;
            }
        }
        for (int i = startIndex; i <= 9 - (k - path.size()) + 1; i++) {
            path.add(i);
            sum += i;
            dataBack(k,n, i + 1, path, result,sum);
            path.remove(path.size() - 1);
            sum -= i;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> combine = solution.combinationSum3(3, 9);
        for (List<Integer> list : combine) {
            list.stream().forEach(System.out::print);
            System.out.println();
        }
    }
}