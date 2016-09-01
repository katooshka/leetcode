package solutions;

import leetcode.datastructures.ListNode;

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        if (head.next == null) return true;

        int length = findListLength(head);
        ListNode[] sublistRange = returnNewStartAndEndOfSubList(head, 0, length / 2);
        boolean isPalindrome;
        if (length % 2 == 0) {
            isPalindrome = compareLists(sublistRange[0], sublistRange[1]);
        } else {
            isPalindrome = compareLists(sublistRange[0], sublistRange[1].next);
        }
        return isPalindrome;
    }

    private int findListLength(ListNode head) {
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        return count;
    }

    private ListNode[] returnNewStartAndEndOfSubList(ListNode node, int count, int halfLength) {
        ListNode currentNode = node;
        ListNode newNext = null;
        ListNode currentNext;
        while (count != halfLength) {
            currentNext = currentNode.next;
            currentNode.next = newNext;
            newNext = currentNode;
            currentNode = currentNext;
            count++;
        }
        return new ListNode[]{newNext, currentNode};
    }

    private boolean compareLists(ListNode first, ListNode second) {
        while (first != null) {
            if (first.val != second.val) {
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new PalindromeLinkedList().isPalindrome(new ListNode(1, new ListNode(0, new ListNode(0, null)))));
    }
}
