package q2_01;

import java.util.HashSet;

import datastructures.CustomLinkedList;
import datastructures.LinkedListNode;

public class RemoveDups {

    public static void removeDuplications(CustomLinkedList input) {
        if (input.isEmpty()) return;
        LinkedListNode<Integer> node = input.getHead();
        LinkedListNode previousNode = null;
        HashSet hashSet = new HashSet();

        while (node != null) {
            if(hashSet.contains(node.getData())) {
                previousNode.setNext(node.next());
            } else {
                hashSet.add(node.getData());
                previousNode = node;
            }
            node = node.next();
        }
    }
}
