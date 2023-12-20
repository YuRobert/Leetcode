package leetcode.leetcode203;

import dataAndStructure.ListNode;


class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode h = new ListNode(0,head);
        ListNode cur = h;
        while (cur.next != null){
            if (cur.next.val == val){
                cur.next = cur.next.next;
                continue;
            }
            cur = cur.next;
        }
        return h.next;
    }


    //1,2,6,3,4,5,6
    public static void main(String[] args) {
        Solution solution = new Solution();
//        ListNode listNode = new ListNode(new ListNode(new ListNode(new ListNode(new ListNode(new ListNode(new ListNode(null, 6), 5), 4), 3), 6), 2), 1);
        ListNode listNode = new ListNode(7,new ListNode(7,new ListNode(7,new ListNode(7,new ListNode(7,new ListNode(7,new ListNode(null)))))));
        ListNode listNode1 = solution.removeElements(listNode, 7);
        ListNode cur = listNode1;
        while (cur != null){
            System.out.println(cur.val);
            cur = cur.next;
        }
    }
}