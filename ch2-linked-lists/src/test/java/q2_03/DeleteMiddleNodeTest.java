package q2_03;

import org.junit.jupiter.api.Test;
import org.pmw.tinylog.Logger;

import customassert.CustomAssert;
import datastructures.CustomLinkedList;
import datastructures.LinkedListNode;

public class DeleteMiddleNodeTest {

    @Test
    public void deleteMiddleNodeTest() {
        Integer[] arr = {1, 3, 5, 7, 9, 12};
        CustomLinkedList customLinkedList = CustomLinkedList.fromArray(arr);
        LinkedListNode nodeToRemove = customLinkedList.getHead();
        while (nodeToRemove != null && (Integer)nodeToRemove.getData() != 5) {
            nodeToRemove = nodeToRemove.next();
        }
        Logger.info("Node to remove: " + nodeToRemove.getData());
        customLinkedList.print();
        DeleteMiddleNode.execute(nodeToRemove);
        customLinkedList.print();
        CustomAssert.assertLinkedList(customLinkedList).notContainsIntValue(5);


        Integer[] arr2 = {1, 3, 5, 7, 9, 12, 15, 17, 19, 20, 32, 45, 54, 78};
        CustomLinkedList customLinkedList2 = CustomLinkedList.fromArray(arr2);
        LinkedListNode nodeToRemove2 = customLinkedList2.getHead();
        while (nodeToRemove2 != null && (Integer)nodeToRemove2.getData() != 54) {
            nodeToRemove2 = nodeToRemove2.next();
        }
        Logger.info("Node to remove: " + nodeToRemove2.getData());
        customLinkedList2.print();
        DeleteMiddleNode.execute(nodeToRemove2);
        customLinkedList2.print();
        CustomAssert.assertLinkedList(customLinkedList2).notContainsIntValue(54);
    }
}
