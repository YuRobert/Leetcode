package leetcode.leetcode707;

import dataAndStructure.ListNode;
import leetcode.leetcode2.Solution;

class MyLinkedList {

    public Integer count = 0;

    public ListNode head;

    public ListNode tail;

    public MyLinkedList() {

    }
    
    public int get(int index) {

        if (index > count - 1){
            return -1;
        }

        ListNode cur = head;
        while (index > 0){
            cur = cur.next;
            index --;
        }
        return cur.val;
    }
    
    public void addAtHead(int val) {
        ListNode listNode = new ListNode(val);
        if (head == null){
            head = listNode;
            tail = listNode;
        }else{
            listNode.next = head;
            head = listNode;
        }
        count++;
    }
    
    public void addAtTail(int val) {
        ListNode listNode = new ListNode(val);
        if (tail == null){
            head = listNode;
            tail = listNode;
        }else{
            tail.next = listNode;
            tail = listNode;
        }
        count++;
    }
    
    public void addAtIndex(int index, int val) {

        if (count < index){
            return;
        }
        if (count == index){
            addAtTail(val);
            return;
        }
        ListNode listNode = new ListNode(val);
        if (index == 0){
            listNode.next = head;
            head = listNode;
            count++;
            return;
        }

        ListNode cur = head;
        while (index - 1 > 0){
            cur = cur.next;
            index --;
        }
        listNode.next = cur.next;
        cur.next = listNode;
        count++;
    }
    
    public void deleteAtIndex(int index) {
        if (count < index + 1 || index < 0 ){
            return;
        }

        if (index == 0){
            head = head.next;
            count--;
            return;
        }

        ListNode cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;

        if (count == index + 1){
            tail = cur;
            cur.next = null;
            count--;
            return;
        }
        cur.next = cur.next.next;

        count--;
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
//        myLinkedList.addAtHead(1);
//        myLinkedList.deleteAtIndex(0);
        myLinkedList.addAtHead(7);
        myLinkedList.addAtHead(2);
        myLinkedList.addAtHead(1);
        myLinkedList.addAtIndex(3,0);
        myLinkedList.deleteAtIndex(2);
        myLinkedList.addAtHead(6);
        myLinkedList.addAtTail(4);
        myLinkedList.get(4);
        myLinkedList.addAtHead(4);
        myLinkedList.addAtIndex(5,0);
    }
}