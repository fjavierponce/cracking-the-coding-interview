package customassert;

import static org.assertj.core.api.Assertions.assertThat;

import datastructures.CustomLinkedList;
import datastructures.LinkedListNode;

public class LinkedListAssert {
    private CustomLinkedList customLinkedList;

    public LinkedListAssert(CustomLinkedList customLinkedList) {
        this.customLinkedList = customLinkedList;
    }

    public void containsIntValue(int value) {
        LinkedListNode node = customLinkedList.getHead();
        while ( node != null && (Integer) node.getData() != value) {
            node = node.next();
        }
        assertThat(node).isNotNull();
        assertThat(node.getData()).isEqualTo(5);
    }

    public void notContainsIntValue(int value) {
        LinkedListNode node = customLinkedList.getHead();
        while ( node != null && (Integer) node.getData() != value) {
            node = node.next();
        }
        assertThat(node).isNull();
    }
}
