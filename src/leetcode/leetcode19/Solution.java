package leetcode.leetcode19;

import dataAndStructure.ListNode;

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode cur = head;
        while (cur != null){
            count++;
            cur = cur.next;
        }
        cur = head;
        if (count - n - 1 == -1){
            head = head.next;
        }
        for (int i = 0; i < count; i++) {
            if (i == count - n - 1){
                ListNode del = cur;
                cur.next = cur.next.next;
                break;
            }
            cur = cur.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null))));
        ListNode listNode = new ListNode(1, null);
        ListNode listNode1 = solution.removeNthFromEnd(listNode, 1);
        System.out.println(listNode1);
    }
}