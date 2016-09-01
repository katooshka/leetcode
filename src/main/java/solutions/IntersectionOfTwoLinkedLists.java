package solutions;

import leetcode.datastructures.ListNode;

public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = getListLength(headA);
        int lengthB = getListLength(headB);
        int minLength = Math.min(lengthA, lengthB);

        ListNode startA = skipNodes(headA, lengthA - minLength);
        ListNode startB = skipNodes(headB, lengthB - minLength);

        while (startA != null) {
            if (startA == startB) {
                return startA;
            }
            startA = startA.next;
            startB = startB.next;
        }
        return null;
    }

    private int getListLength(ListNode head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }

    private ListNode skipNodes(ListNode start, int numberOfNodesToSkip) {
        for (int i = 0; i < numberOfNodesToSkip; i++) {
            start = start.next;
        }
        return start;
    }
}
