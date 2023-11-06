package leetcode.leetcode144;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        getAll(root,list);
        return list;
    }
    public  List<Integer> getAll(TreeNode root,List<Integer> list){
        if (root == null){
            return list;
        }
        list.add(root.val);
        getAll(root.left,list);
        getAll(root.right,list);
        return list;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode treeNode = new TreeNode(1, null, new TreeNode(2, new TreeNode(3, null, null), null));
        List<Integer> integers = solution.preorderTraversal(treeNode);
        integers.forEach(System.out::println);
    }
}