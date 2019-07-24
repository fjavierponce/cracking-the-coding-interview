package common;

public class CommonUtils {

    public static BidimensionalMatrixAssert assertBidimensionalArray(int[][] matrix) {
        return new BidimensionalMatrixAssert(matrix);
    }
}
