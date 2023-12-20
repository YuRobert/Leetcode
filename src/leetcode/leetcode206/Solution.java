package leetcode.leetcode206;

import dataAndStructure.ListNode;

import java.util.Stack;

class Solution {
//    public ListNode reverseList(ListNode head) {
//        Stack<ListNode> stack = new Stack<>();
//        ListNode cur = head;
//        while (cur != null){
//            stack.push(cur);
//            cur = cur.next;
//        }
//        ListNode newHead = stack.pop();
//        ListNode cur2 = newHead;
//        while (!stack.isEmpty()){
//            cur2.next = stack.pop();
//            cur2 = cur2.next;
//        }
//        cur2.next = null;
//        return newHead;
//    }
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, null)));

        ListNode listNode1 = solution.reverseList(listNode);


    }
}