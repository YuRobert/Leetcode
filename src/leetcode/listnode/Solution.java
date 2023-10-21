package leetcode.listnode;


/**
 * @author Robert17
 * @create2023-04-12-17:16
 */
public class Solution
{
    /**
     *
     * @param head ListNode类 the head
     * @return bool布尔型
     */
    public boolean isPail (ListNode head) {
        // write code here
        if(head==null||head.next==null)return true;
        ListNode head_1=new ListNode(head.val,head.next);
        ListNode ans=null;
        while(head!=null)
        {
            ListNode temp=head.next;
            head.next=ans;
            ans=head;
            head=temp;
        }
        System.out.println();

        while(head_1!=null)
        {
            if(head_1.val!=ans.val)return false;
            head_1=head_1.next;
            ans=ans.next;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Solution solution = new Solution();
        ListNode listNode = new ListNode();
        listNode.val = 1;
//        listNode.next = new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,new ListNode(4,new ListNode(3,new ListNode(2,new ListNode(1,new ListNode(1,null)))))))));
        listNode.next = new ListNode(2,new ListNode(3,new ListNode(2,new ListNode(1,null))));
        boolean pail = solution.isPail(listNode);
        System.out.println(pail);
    }
}
