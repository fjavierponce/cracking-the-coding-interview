package q1_07;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import customassert.CustomAssert;

public class RotateMatrixTest {

    @Test
    public void rotate() {
        int[][] matrix = {
                {1,3},
                {2,1}};
        int[][] expected = {
                {2,1},
                {1,3}};
        RotateMatrix.rotate(matrix);
        CustomAssert.assertBidimensionalArray(matrix).isEqualTo(expected);
    }

    @Test
    public void rotate2() {
        int[][] matrix = {
                {6,5,4,7,8},
                {5,7,8,9,9},
                {1,4,3,3,1},
                {7,8,3,4,3},
                {8,9,8,0,3}
        };
        int[][] expected = {
                {8,7,1,5,6},
                {9,8,4,7,5},
                {8,3,3,8,4},
                {0,4,3,9,7},
                {3,3,1,9,8}
        };

        RotateMatrix.rotate(matrix);
        CustomAssert.assertBidimensionalArray(matrix).isEqualTo(expected);
    }
}