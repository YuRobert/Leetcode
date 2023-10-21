package leetcode.listnode;

/**
 * @author Robert17
 * @create2023-04-12-17:18
 */
public class ListNode
{
    int val;
    ListNode next = null;

    public ListNode()
    {
    }

    public ListNode(int val, ListNode next)
    {
        this.val = val;
        this.next = next;
    }

    public ListNode(int val)
    {
        this.val = val;
    }
}
