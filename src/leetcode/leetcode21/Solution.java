package leetcode.leetcode21;

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list = new ListNode();
        ListNode cur = list;
        ListNode cur1 = list1;
        ListNode cur2 = list2;
        while(cur1.next != null || cur2.next != null)
        {

            if(cur1.next != null && cur2.next != null)
            {
                if(cur1.val >= cur2.val)
                {
                    cur.next = cur2;
                    cur = cur.next;
                    cur2 = cur2.next;
                }
                if(cur1.val < cur2.val)
                {
                    cur.next = cur1;
                    cur = cur.next;
                    cur1 = cur1.next;
                }
            }
            else if(cur1.next == null && cur2.next != null)
            {
                cur.next = cur2;
                cur = cur.next;
                cur2 = cur2.next;
            }
            else if(cur2.next == null && cur1.next != null)
            {
                cur.next = cur1;
                cur = cur.next;
                cur1 = cur1.next;
            }

        }
        return list.next;
    }
}