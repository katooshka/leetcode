package solutions;

import leetcode.datastructures.ListNode;

public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode currentNode = head;
        while (currentNode != null && currentNode.next != null) {
            if (currentNode.val == currentNode.next.val) {
                currentNode.next = deleteLocalDuplicates(currentNode);
            }
            currentNode = currentNode.next;
        }
        return head;
    }

    private ListNode deleteLocalDuplicates(ListNode node) {
        while (node.next != null && node.val == node.next.val) {
            node = node.next;
        }
        return node.next;
    }

    public void main(String[] args) {
        ListNode fourth = new ListNode(2, null);
        ListNode third = new ListNode(2, fourth);
        ListNode second = new ListNode(1, third);
        ListNode first = new ListNode(3, second);
        deleteDuplicates(first);
        System.out.println(first.toString());
    }
}

