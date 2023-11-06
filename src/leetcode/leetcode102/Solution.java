package leetcode.leetcode102;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        if(root == null){
            return lists;
        }
        treeNodeQueue.add(root);
        while (!treeNodeQueue.isEmpty()){
            ArrayList<Integer> integers = new ArrayList<>();
            int size = treeNodeQueue.size();
            while (size != 0){
                if (treeNodeQueue.peek() == null) {
                    size--;
                    continue;
                }

                integers.add(treeNodeQueue.peek().val);
                if (treeNodeQueue.peek().left != null){
                    treeNodeQueue.add(treeNodeQueue.peek().left);
                }
                if (treeNodeQueue.peek().right != null){
                    treeNodeQueue.add(treeNodeQueue.peek().right);
                }
                treeNodeQueue.poll();
                size--;
            }
            lists.add(integers);
        }
        return lists;
    }

    //3,9,20,null,null,15,7
    public static void main(String[] args) {
        Solution solution = new Solution();
       // leetcode.TreeNode treeNode = new leetcode.TreeNode(3, new leetcode.TreeNode(9,null,null), new leetcode.TreeNode(20, new leetcode.TreeNode(15, null, null), new leetcode.TreeNode(7, null, null)));
        TreeNode treeNode = null;
        List<List<Integer>> lists = solution.levelOrder(treeNode);
        lists.forEach(list -> {
//            list.forEach(System.out::println);
            System.out.println(list);
        });
    }
}