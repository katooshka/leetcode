package solutions;

import leetcode.datastructures.ListNode;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;
        ListNode result = head.next;
        swap(head, head.next, null);
        return result;
    }

    private void swap(ListNode n1, ListNode n2, ListNode previous) {
        while (n1 != null && n2 != null) {
            if (previous != null) {
                previous.next = n2;
            }
            n1.next = n2.next;
            n2.next = n1;

            previous = n1;
            n1 = n1.next;
            n2 = n1 == null ? null : n1.next;
        }
    }
    public static void main(String[] args) {
        ListNode list = new ListNode(1, new ListNode(2, null));
        System.out.println(new SwapNodesInPairs().swapPairs(list));
    }
}
