package leetcode.leetcode257;

import leetcode.TreeNode;

import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> lists = new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>();
        getTreePaths(root,integers,lists);
        return lists;
    }
    public void getTreePaths(TreeNode root,List<Integer> list,ArrayList<String> lists){
        if (root == null){
            return;
        }
        list.add(root.val);
        if (root.left == null && root.right == null){
            String collect = list.stream().map(String::valueOf).collect(Collectors.joining("->"));
            lists.add(collect);
            return;
        }
        getTreePaths(root.left, list,lists);
        if (root.left != null){
            list.remove(list.size() - 1);
        }
        getTreePaths(root.right, list,lists);
        if (root.right != null){
            list.remove(list.size() - 1);
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        List<String> strings = solution.binaryTreePaths(new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4, null, null))));
        ArrayList<String> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        solution.getTreePaths(new TreeNode(2, null, new TreeNode(3, new TreeNode(5, null, null), new TreeNode(4, null, null))),list,lists);
        lists.forEach(System.out::println);
    }
}