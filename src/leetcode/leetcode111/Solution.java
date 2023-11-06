package leetcode.leetcode111;

import leetcode.TreeNode;

class Solution {
    public int minDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        if (root.left == null && root.right == null){
            return 1;
        }else if (root.left != null && root.right == null){
            int left = minDepth(root.left);
            return 1+left;
        }else if (root.left == null && root.right != null){
            int right = minDepth(root.right);
            return 1+right;
        }else {
            int right = minDepth(root.right);
            int left = minDepth(root.left);
            return 1+Math.min(right,left);
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int minDepth = solution.minDepth(new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4, null, null))));
        System.out.println(minDepth);
    }
}