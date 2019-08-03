package q2_02;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.apache.commons.lang3.time.StopWatch;
import org.junit.jupiter.api.Test;
import org.pmw.tinylog.Logger;

import datastructures.CustomLinkedList;
import datastructures.LinkedListNode;

class ReturnKthToLastTest {

    @Test
    void runWithSize() {
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        CustomLinkedList customLinkedList = CustomLinkedList.fromArray(arr);
        LinkedListNode node = ReturnKthToLast.runUsingSize(customLinkedList, 4);
        assertThat(17).isEqualTo(node.getData());

        LinkedListNode node2 = ReturnKthToLast.runUsingSize(customLinkedList, 10);
        assertThat(11).isEqualTo(node2.getData());

        LinkedListNode node3 = ReturnKthToLast.runUsingSize(customLinkedList, 30);
        assertThat(node3).isNull();
    }


    @Test
    void runRecursive() {
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        CustomLinkedList customLinkedList = CustomLinkedList.fromArray(arr);
        LinkedListNode node = ReturnKthToLast.runRecursive(customLinkedList, 4);
        assertThat(17).isEqualTo(node.getData());

        LinkedListNode node2 = ReturnKthToLast.runRecursive(customLinkedList, 10);
        assertThat(11).isEqualTo(node2.getData());

        LinkedListNode node3 = ReturnKthToLast.runRecursive(customLinkedList, 30);
        assertThat(node3).isNull();
    }



}