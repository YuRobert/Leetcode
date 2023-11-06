package leetcode.leetcode101;

import com.sun.org.apache.xpath.internal.WhitespaceStrippingElementMatcher;
import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<List<Integer>> lists = new ArrayList<>();
        while (!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> integers = new ArrayList<>();
            while (size != 0){
                if (queue.peek() == null) {
                    size--;
                    continue;
                }
                integers.add(queue.peek().val);
                if (queue.peek().left != null){
                    queue.add(queue.peek().left);
                }
                if (queue.peek().right != null){
                    queue.add(queue.peek().right);
                }
                queue.poll();
                size--;
            }
            lists.add(integers);
        }
        for (int i = 1; i < lists.size(); i++) {
            if (!isDuiCheng(lists.get(i))){
                return false;
            }
        }
        return true;
    }

    public boolean isDuiCheng(List<Integer> list){
        if (list.size() % 2 != 0 ){
            return false;
        }
        int left = 0;
        int right = list.size() - 1;
        while (left<right){
            if (!list.get(left).equals(list.get(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean symmetric = solution.isSymmetric(new TreeNode(3, new TreeNode(9, null, null), new TreeNode(9, null, null)));
        System.out.println(symmetric);
    }
}