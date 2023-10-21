package leetcode.leetcode2;

import leetcode.leetcode21.ListNode;
import org.junit.Test;

/**
 * @author Robert17
 * @create2022-10-29-21:08
 */
public class Test1
{
    @Test
    public void test1()
    {
        ListNode l1 = new ListNode(9);
//        l1.next = new ListNode(4);
//        l1.next.next = new ListNode(9);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);
        l2.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next.next.next = new ListNode(9);
        Solution solution = new Solution();
        ListNode listNode = solution.addTwoNumbers(l1, l2);

        System.out.println(listNode.toString());

    }
}
