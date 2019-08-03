package q1_08;

import org.junit.jupiter.api.Test;

import customassert.CustomAssert;

public class ZeroMatrixTest {

    @Test
    public void calculateZeroMatrix() {
        int[][] matrix = {
                {1, 3, 4, 5, 6, 7, 6, 9, 6, 5},
                {6, 4, 8, 9, 2, 3, 4, 1, 4, 6},
                {9, 9, 4, 5, 6, 3, 3, 4, 1, 2},
                {6, 7, 6, 6, 0, 5, 5, 6, 4, 0}};
        int[][] expected = {
                {1, 3, 4, 5, 0, 7, 6, 9, 6, 0},
                {6, 4, 8, 9, 0, 3, 4, 1, 4, 0},
                {9, 9, 4, 5, 0, 3, 3, 4, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

        ZeroMatrix.calculateZeroMatrixUsingExtraArrays(matrix);
        CustomAssert.assertBidimensionalArray(matrix).isEqualTo(expected);
    }

    @Test
    public void calculateZeroMatrix2() {
        int[][] matrix = {
                {1, 3, 4, 5, 0, 7, 6, 9, 6, 5},
                {6, 4, 8, 9, 2, 3, 4, 1, 4, 6},
                {9, 9, 4, 5, 6, 3, 3, 4, 1, 2},
                {6, 7, 6, 6, 0, 5, 5, 6, 4, 0}};
        int[][] expected = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {6, 4, 8, 9, 0, 3, 4, 1, 4, 0},
                {9, 9, 4, 5, 0, 3, 3, 4, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

        ZeroMatrix.calculateZeroMatrixUsingExtraArrays(matrix);
        CustomAssert.assertBidimensionalArray(matrix).isEqualTo(expected);
    }
}