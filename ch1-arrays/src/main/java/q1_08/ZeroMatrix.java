package q1_08;

public class ZeroMatrix {

    public static boolean calculateZeroMatrixUsingExtraArrays(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return false;

        int lengthX = matrix.length;
        int lengthY = matrix[0].length;

        boolean[] zeroRows = new boolean[lengthX];
        boolean[] zeroColumns = new boolean[lengthY];

        for (int x = 0; x < lengthX; x++) {
            for (int y = 0; y < lengthY; y++) {
                if (matrix[x][y] == 0) {
                    zeroRows[x] = true;
                    zeroColumns[y] = true;
                }
            }
        }

        // Set rows to zero
        for (int i = 0; i < lengthX; i++) {
            if (zeroRows[i]) {
                nullifyRow(matrix, i);
            }
        }

        // Set columns to zero
        for (int i = 0; i < lengthY; i++) {
            if (zeroColumns[i]) {
                nullifyColumn(matrix, i);
            }
        }
        return true;
    }

    private static void nullifyColumn(int[][] matrix, int column) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][column] = 0;
        }
    }

    private static void nullifyRow(int[][] matrix, int row) {
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[row][i] = 0;
        }
    }
}