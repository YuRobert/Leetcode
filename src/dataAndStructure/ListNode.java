package dataAndStructure;



public class ListNode {

    public ListNode next;

    public Integer val;

    public ListNode( Integer val,ListNode next) {
        this.next = next;
        this.val = val;
    }

    public ListNode(Integer val) {
        this.val = val;
    }

}
