package leetcode.leetcode222;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int countNodes(TreeNode root) {
        ArrayList<TreeNode> treeNodes = new ArrayList<>();
        List<TreeNode> count = count(root, treeNodes);
        return count.size();
    }
    private List<TreeNode> count(TreeNode root,List<TreeNode> list){
        if (root == null){
            return list;
        }
        count(root.left,list);
        count(root.right,list);
        list.add(root);
        return list;
    }

    public int countNodes2(TreeNode root) {
        if (root == null){
            return 0;
        }
        int left = countNodes2(root.left);
        int right = countNodes2(root.right);
        return left + right + 1;
    }
    
}