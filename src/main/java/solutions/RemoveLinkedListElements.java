package solutions;

import leetcode.datastructures.ListNode;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        remove(head.next, head, val);
        if (head.val == val) {
            head = head.next;
        }
        return head;
    }

    private void remove(ListNode node, ListNode previous, int val) {
        while (node != null) {
            if (node.val == val) {
                previous.next = node.next;
                node = previous.next;
            } else {
                previous = node;
                node = node.next;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new RemoveLinkedListElements().removeElements(new ListNode(1, new ListNode(2, new ListNode(1, null))), 1));
    }
}
