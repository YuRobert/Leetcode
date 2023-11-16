package leetcode.leetcode101;


import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public boolean isSymmetric(TreeNode root) {
        return true;
    }




    public static void main(String[] args) {
        Solution solution = new Solution();
//        boolean symmetric = solution.isSymmetric(new TreeNode(1, new TreeNode(2, new TreeNode(3, null, null), new TreeNode(4, null, null)), new TreeNode(2, new TreeNode(4, null, null), new TreeNode(3, null, null))));
        boolean symmetric = solution.isSymmetric(new TreeNode(1, new TreeNode(2, new TreeNode(2, null, null), null), new TreeNode(2, new TreeNode(2, null, null), null)));
        System.out.println(symmetric);
    }
}