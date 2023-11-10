package leetcode.leecode654;

import leetcode.TreeNode;

import java.util.Arrays;

class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length < 1){
            return null;
        }

        int max = 0;
        int index = 0;
        for ( int i = 0; i < nums.length; i++) {
            if (nums[i] > max){
                max = nums[i];
                index = i;
            }
        }
        TreeNode treeNode = new TreeNode(max, null, null);
        int[] leftNums = new int[index];
        for (int i = 0; i < leftNums.length; i++) {
            leftNums[i] = nums[i];
        }
        int[] rightNums = new int[nums.length - index - 1];
        for (int i = 0; i < rightNums.length; i++) {
            rightNums[i] = nums[index + i + 1];
        }
        treeNode.right = constructMaximumBinaryTree(rightNums);
        treeNode.left = constructMaximumBinaryTree(leftNums);
        return treeNode;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode treeNode = solution.constructMaximumBinaryTree(new int[]{3, 2, 1, 6, 0, 5});
    }
}