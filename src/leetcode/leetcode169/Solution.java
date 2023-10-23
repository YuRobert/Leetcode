package leetcode169;

import java.util.Stack;

class Solution {
    public int majorityElement(int[] nums) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (stack.isEmpty() || stack.get(0).equals(nums[i]))
            {
                stack.add(nums[i]);
            }
            else
            {
                stack.pop();
            }
        }
        return stack.get(0);
    }
}