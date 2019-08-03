package datastructures;

public class LinkedListNode<T> {
    private LinkedListNode next;

    private T data;

    public LinkedListNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public LinkedListNode next() {
        return next;
    }

    public void setNext(LinkedListNode linkedListNode) {
        this.next = linkedListNode;
    }
}