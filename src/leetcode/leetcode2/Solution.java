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
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(l1.val);
        ListNode cur = l1;
        while (cur.next != null)
        {
            list1.add(cur.next.val);
            cur = cur.next;
        }
        List<Integer> list2 = new ArrayList<Integer>();

        ListNode cur2 = l2;
        list2.add(l2.val);
        while (cur2.next != null)
        {
            list2.add(cur2.next.val);
            cur2 = cur2.next;
        }
        long sum1 = 0;
        long sum2 = 0;
        for (int i = list1.size() - 1; i >= 0; i--)
        {
            sum1 += list1.get(i)*Math.pow(10,i);
        }
        for (int i = list2.size() - 1; i >= 0; i--)
        {
            sum2 += list2.get(i)*Math.pow(10,i);
        }
        long sum = sum1 + sum2;
        String str = Long.toString(sum);
        ListNode result = new ListNode();
        ListNode result1 = result;
        for (int i = str.length() - 1; i >=0 ; i--)
        {
            result1.val = str.charAt(i) -'0';

            if(i != 0)
            {
                result1.next = new ListNode();
                result1 = result1.next;
            }
        }
        return result;
    }
}
