package leetcode.leetcode2;

import leetcode.leetcode21.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Robert17
 * @create2022-10-29-20:52
 */
public class Solution
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        int carry = 0;
        while (l1 != null || l2 != null){
            int x = l1== null?0 : l1.val;
            int y = l2== null?0 : l2.val;
            int sum = carry + x + y;
            if (sum >= 10){
                carry = 1;
                cur.next = new ListNode(sum - 10);
            }else{
                carry = 0;
                cur.next = new ListNode(sum);
            }
            cur = cur.next;
            if (l1 != null){
                l1 = l1.next;
            }
            if (l2 != null){
                l2 = l2.next;
            }

        }
        if (carry == 1){
            cur.next = new ListNode(1);
        }
        return pre.next;


    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode node = new ListNode();
        node.val = 2;
        node.next = new ListNode(4);
        node.next.next = new ListNode(3);
        ListNode node2 = new ListNode();
        node2.val = 5;
        node2.next = new ListNode(6);
        node2.next.next = new ListNode(4);
        ListNode result = solution.addTwoNumbers(node, node2);
        System.out.println();

    }
}
