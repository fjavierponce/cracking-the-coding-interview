package q2_03;

import datastructures.LinkedListNode;

public class DeleteMiddleNode {

    public static void execute(LinkedListNode node) {
        Integer nextValue = (Integer) node.next().getData();
        node.setData(nextValue);
        node.setNext(node.next().next());
    }
}
