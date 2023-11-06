package leetcode.leetcode94;

import java.util.ArrayList;
import java.util.List;
import leetcode.TreeNode;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        getAll(root,list);
        return list;
    }
    public  List<Integer> getAll(TreeNode root, List<Integer> list){
        if (root == null){
            return list;
        }

        getAll(root.left,list);
        list.add(root.val);
        getAll(root.right,list);
        return list;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode treeNode = new TreeNode(4, new TreeNode(2, new TreeNode(1, null, null), new TreeNode(3, null, null)),  new TreeNode(7, new TreeNode(6, null, null), new TreeNode(9, null, null)));
        List<Integer> integers = solution.inorderTraversal(treeNode);
        integers.forEach(System.out::println);
    }
}