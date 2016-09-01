package solutions;

import leetcode.datastructures.ListNode;

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode slowPointer = head;
        ListNode fastPointer = head.next;
        while (fastPointer != slowPointer) {
            if (fastPointer.next == null || fastPointer.next.next == null) {
                return false;
            }
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return true;
    }
}
