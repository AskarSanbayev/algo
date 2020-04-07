package com.algorithm.askar.linkedlist;

public class DeleteElementAtPosition {
    public ListNode deleteAtMiddleIterative(ListNode head, int position) {
        if (position == 1) {
            return head == null ? head : head.next;
        }
        ListNode curr = head;
        ListNode prevNode = curr;
        int count = 0;
        while (curr != null) {
            count++;
            if (count == position) {
                prevNode.next = curr.next;
                curr.next = null;
            } else {
                prevNode = curr;
                curr = curr.next;
            }
        }
        return head;
    }

    public ListNode deleteAtMiddle(ListNode head, int position) {
        if (head == null) return null;
        else if (position == 1) return head.next;
        head.next = deleteAtMiddle(head.next, position - 1);
        return head;
    }
}
