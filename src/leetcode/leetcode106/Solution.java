package leetcode.leetcode106;

import leetcode.TreeNode;

class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (postorder.length == 0){
            return null;
        }
        TreeNode treeNode = new TreeNode(postorder[postorder.length - 1], null, null);
        int index = 0;
        for (index = 0;index < inorder.length; index++) {
            if (inorder[index] == postorder[postorder.length - 1]){
                break;
            }
        }
        int[] newLeftInorder = new int[index];
        int[] newRightInorder = new int[inorder.length - index -1];
        for (int i = 0; i < newLeftInorder.length; i++) {
            newLeftInorder[i] = inorder[i];
        }
        for (int i = 0; i < newRightInorder.length; i++) {
            newRightInorder[i] = inorder[index + 1 + i];
        }
        int[] newLeftPostOrder = new int[newLeftInorder.length];
        for (int i = 0; i < newLeftPostOrder.length; i++) {
            newLeftPostOrder[i] = postorder[i];
        }
        int[] newRightPostOrder = new int[postorder.length -1 - newLeftInorder.length];
        for (int i = 0; i < newRightPostOrder.length; i++) {
            newRightPostOrder[i] = postorder[newLeftPostOrder.length + i];
        }
        treeNode.left = buildTree(newLeftInorder,newLeftPostOrder);
        treeNode.right = buildTree(newRightInorder,newRightPostOrder);
        return treeNode;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode treeNode = solution.buildTree(new int[]{3,2,1}, new int[]{3,2,1});
        System.out.println(treeNode);
    }
}