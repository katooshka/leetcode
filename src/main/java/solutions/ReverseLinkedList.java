package solutions;

import leetcode.datastructures.ListNode;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode current = head;
        ListNode previous = null;
        while (current.next != null) {
            ListNode currentNext = current.next;
            current.next = previous;
            previous = current;
            current = currentNext;
        }
        current.next = previous;
        return current;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, null));
        System.out.println(head);
        System.out.println(new ReverseLinkedList().reverseList(head));
    }
}
