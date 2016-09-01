package solutions;

import leetcode.datastructures.ListNode;

public class MergeTwoLists {
    private ListNode resultHead = null;
    private ListNode resultTail = null;

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                add(l1);
                l1 = l1.next;
                resultTail.next = null;
            } else {
                add(l2);
                l2 = l2.next;
                resultTail.next = null;
            }
        }

        if (l1 != null) {
            add(l1);
        } else if (l2 != null) {
            add(l2);
        }

        return resultHead;
    }

    private void add(ListNode node) {
        if (resultHead != null) {
            resultTail.next = node;
            resultTail = resultTail.next;
        } else {
            resultHead = node;
            resultTail = node;
        }
    }

}
