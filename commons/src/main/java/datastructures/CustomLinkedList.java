package datastructures;

import org.pmw.tinylog.Logger;

public class CustomLinkedList<T> {
    private LinkedListNode head;
    private int size;

    void appendToTail(T data) {
        LinkedListNode newLinkedListNode = new LinkedListNode(data);
        if (head == null) {
            head = new LinkedListNode(data);
        } else {
            LinkedListNode n = head;
            while (n.next() != null) {
                n = n.next();
            }
            n.setNext(new LinkedListNode(data));
        }
        size++;
    }

    void removeNextNodeFrom(LinkedListNode previousNode) {
        if (previousNode == null || previousNode.next() == null) return;
        previousNode.setNext(previousNode.next().next());
        size--;
    }

    public static <T> CustomLinkedList fromArray(T[] a) {
        CustomLinkedList<T> customLinkedList = new CustomLinkedList<T>();
        for (T element: a) {
            customLinkedList.appendToTail(element);
        }
        return customLinkedList;
    }

    public LinkedListNode getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        StringBuffer stringBuffer = new StringBuffer();
        if (isEmpty()) {
            Logger.info("<<EMPTY>>");
            return;
        }

        LinkedListNode n = head;
        while (n != null) {
            stringBuffer.append(n.getData());
            if (n.next() != null) stringBuffer.append(", ");
            n = n.next();
        }
        Logger.info("[" + stringBuffer.toString() + "]");
    }
}
