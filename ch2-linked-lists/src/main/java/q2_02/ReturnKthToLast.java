package q2_02;

import datastructures.CustomLinkedList;
import datastructures.LinkedListNode;

public class ReturnKthToLast {

    public static LinkedListNode runUsingSize(CustomLinkedList linkedList, int kth) {
        // |----------xth---------|----kth----| = length
        int xth = linkedList.getSize() - kth + 1;
        if (xth < 1) return null;

        LinkedListNode head = linkedList.getHead();
        int count = 1;
        while (head != null && count < xth) {
            head = head.next();
            count++;
        }
        return head;
    }

    static class Index {
        public int value = 0;
    }


    public static LinkedListNode runRecursive(CustomLinkedList list, int i) {
        Index index = new Index();
        return runRecursive(list.getHead(), i, index);
    }

    private static LinkedListNode runRecursive(LinkedListNode head, int i, Index index) {
        if (head == null)
            return null;
        LinkedListNode node = runRecursive(head.next(), i, index);
        index.value = index.value + 1;
        if (index.value == i)
            return head;
        return node;
    }
}
