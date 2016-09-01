package solutions;

import leetcode.datastructures.ListNode;

public class DeleteLinkedListNode {

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        ListNode second = new ListNode(1, null);
        ListNode first = new ListNode(0, second);
        deleteNode(first);
        System.out.println(first);
        System.out.println(second);
    }
}
