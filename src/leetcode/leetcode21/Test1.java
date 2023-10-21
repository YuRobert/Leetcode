package leetcode.leetcode21;

public class Test1
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(5);
        list2.next = new ListNode(6);
        list2.next.next = new ListNode(4);
        ListNode listNode = solution.mergeTwoLists(list1, list2);
        System.out.println(listNode);
    }
}