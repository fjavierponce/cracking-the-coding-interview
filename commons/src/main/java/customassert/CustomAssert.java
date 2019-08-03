package customassert;

import datastructures.CustomLinkedList;

public class CustomAssert {
    public static BidimensionalMatrixAssert assertBidimensionalArray(int[][] matrix) {
        return new BidimensionalMatrixAssert(matrix);
    }

    public static LinkedListAssert assertLinkedList(CustomLinkedList customLinkedList) {
        return new LinkedListAssert(customLinkedList);
    }
}
