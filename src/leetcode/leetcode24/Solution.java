package leetcode.leetcode24;

import dataAndStructure.ListNode;

class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null && cur.next != null){
            ListNode node1 = cur;
            ListNode node2 = cur.next;
            if (pre != null){
                pre.next = node2;
            }else {
                head = node2;
            }
            node1.next = node2.next;
            node2.next = node1;
            cur = node1.next;
            pre = node1;
        }
        return head;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null))));
        ListNode listNode1 = solution.swapPairs(listNode);
        System.out.println(listNode1);
    }
}