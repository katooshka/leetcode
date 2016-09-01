package solutions;

import leetcode.datastructures.ListNode;

public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        if (head.next == null) return null;

        ListNode dummy = new ListNode(0, head);
        ListNode firstPointer = dummy;
        ListNode secondPointer = dummy;
        for (int i = 1; i <= n + 1; i++) {
            firstPointer = firstPointer.next;
        }
        while (firstPointer != null) {
            firstPointer = firstPointer.next;
            secondPointer = secondPointer.next;
        }
        secondPointer.next = secondPointer.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        System.out.println(new RemoveNthNodeFromEndOfList().removeNthFromEnd(
                new ListNode(1, new ListNode(2, new ListNode(3, null))), 1));
    }
}
