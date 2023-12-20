package leetcode.leetcode142;

import dataAndStructure.ListNode;

import java.util.ArrayList;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode cur = head;
        int index = 0;
        while (cur != null){
            if (list.contains(cur)){
                return cur;
            }else{
                list.add(cur);
            }
            cur = cur.next;
        }
        return null;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode1 = new ListNode(100, null);
        ListNode listNode = new ListNode(1, new ListNode(2, listNode1));
        listNode1.next = listNode;
        ListNode listNode2 = solution.detectCycle(listNode);
        System.out.println(listNode2);
    }
}