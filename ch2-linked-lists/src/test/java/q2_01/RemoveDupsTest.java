package q2_01;

import static org.assertj.core.api.Java6Assertions.assertThat;


import org.junit.jupiter.api.Test;

import datastructures.CustomLinkedList;

public class RemoveDupsTest {

    @Test
    public void removeDupsTest() {
        Integer[] a = {1,2,3,3,4,5,6,3,3,4,9};
        CustomLinkedList input = CustomLinkedList.fromArray(a);
        input.print();
        RemoveDups.removeDuplications(input);
        input.print();
    }
}
