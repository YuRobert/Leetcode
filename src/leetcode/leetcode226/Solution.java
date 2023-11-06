package leetcode.leetcode226;



import leetcode.leetcode102.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null){
            return root;
        }
        if (root.left == null && root.right == null){
            return root;
        }
        if (root.left != null){
            invertTree(root.left);
        }
        if (root.right != null){
            invertTree(root.right);
        }
        TreeNode temp = new TreeNode();
        temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode treeNode = new TreeNode(4, new TreeNode(2, new TreeNode(1, null, null), new TreeNode(3, null, null)),  new TreeNode(7, new TreeNode(6, null, null), new TreeNode(9, null, null)));;
        TreeNode treeNode1 = solution.invertTree(treeNode);
        leetcode.leetcode102.Solution solution1 = new leetcode.leetcode102.Solution();
        List<List<Integer>> lists = solution1.levelOrder(treeNode1);
        lists.forEach(list -> {
            System.out.println(list);
        });

    }





}