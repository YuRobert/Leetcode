package leetcode.leetcode110;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null){
            return true;
        }
        ArrayList<Integer> integers = new ArrayList<>();

        depth(root, integers);

        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) > 1){
                return false;
            }
        }
        return true;
    }
    private int depth(TreeNode root, List<Integer> list){
        if (root == null){
            return 0;
        }
        int left = depth(root.left,list);
        int right = depth(root.right,list);
        list.add(Math.abs(left -right));
        return Math.max(left,right)+1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean balanced = solution.isBalanced(new TreeNode(1, new TreeNode(2, new TreeNode(3, new TreeNode(4, null, null), new TreeNode(4, null, null)), new TreeNode(3, null, null)), new TreeNode(2, null, null)));
        System.out.println(balanced);
    }
}