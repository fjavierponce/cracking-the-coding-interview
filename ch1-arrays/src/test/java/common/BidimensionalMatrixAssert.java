package common;

import static org.assertj.core.api.Assertions.assertThat;

import org.pmw.tinylog.Logger;

public class BidimensionalMatrixAssert {
    private int[][] matrix;

    BidimensionalMatrixAssert(int[][] matrix) {
        this.matrix = matrix;
    }

    public void isEqualTo(int[][] expected) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[0].length; j++) {
                assertThat(this.matrix[i][j]).isEqualTo(expected[i][j]);
                stringBuilder.append("{" + matrix[i][j] + "}");
            }
            Logger.info(stringBuilder.toString() + "\n");
            stringBuilder.setLength(0);
        }
    }

}
