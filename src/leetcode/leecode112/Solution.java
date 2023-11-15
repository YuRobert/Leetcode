package leetcode.leecode112;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        List<Integer> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        getPath(root,list,result);
        for (int i = 0; i < result.size(); i++)
        {
            if (result.get(i).equals(targetSum)){
                return true;
            }
        }
        return false;
    }

    public List<Integer> getPath(TreeNode root,List<Integer> list,List<Integer> result){
        if (root == null)
        {
            return result;
        }
        list.add(root.val);
        if (root.left == null && root.right == null){
            int sum = 0;
            for (int i = 0; i < list.size(); i++)
            {
                sum = sum + list.get(i);
            }
            result.add(sum);
            return result;
        }
        if (root.left != null){
            getPath(root.left, list,result);
            list.remove(list.size() - 1);
        }

        if (root.right != null){
            getPath(root.right, list,result);
            list.remove(list.size() - 1);
        }


        return result;
    }

    public static void main(String[] args)
    {
        Solution solution = new Solution();
        boolean b = solution.hasPathSum(new TreeNode(5, new TreeNode(2, null, null), new TreeNode(3, null, null)), 10);
        System.out.println(b);
    }
}