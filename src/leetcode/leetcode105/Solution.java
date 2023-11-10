package leetcode.leetcode105;

import leetcode.TreeNode;

class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length < 1){
            return null;
        }
        TreeNode treeNode = new TreeNode(preorder[0], null, null);
        int index = 0;
        for (index = 0; index < inorder.length; index++) {
            if (inorder[index] == preorder[0]){
                break;
            }
        }

        int[] leftInorder = new int[index];
        for (int i = 0; i < leftInorder.length; i++) {
            leftInorder[i] = inorder[i];
        }
        int[] rightInorder = new int[inorder.length - 1 - index];
        for (int i = 0; i < rightInorder.length; i++) {
            rightInorder[i] = inorder[i + index + 1];
        }
        int[] leftPreorder = new int[index];
        for (int i = 0; i < leftPreorder.length; i++) {
            leftPreorder[i] = preorder[i + 1];
        }
        int[] rightPreorder = new int[preorder.length - 1 - index];
        for (int i = 0; i < rightPreorder.length; i++) {
            rightPreorder[i] = preorder[leftPreorder.length + 1 + i];
        }
        treeNode.left = buildTree(leftPreorder,leftInorder);
        treeNode.right = buildTree(rightPreorder,rightInorder);
        return treeNode;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode treeNode = solution.buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});
    }
}