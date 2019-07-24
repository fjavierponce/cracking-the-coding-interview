package q1_07;

public class RotateMatrix {

    // Given an iamge represented by an NxM matrix, where each pixel in the image is 4 bytes,
    // write a method to rotate the image by 90 degrees
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int layer = 0; layer < n/2 ; layer++) {
            int first = layer;
            int last = n - layer - 1;
            int offset;
            // Iterate the layer to rotate
            for (int i = first; i < last ; i++) {
                offset = i - first;

                //save top
                int top = matrix[first][i];

                //left -> top
                matrix[first][i] = matrix[last - offset][first];

                //bottom -> left
                matrix[last - offset][first] = matrix[last][last - offset];

                //right -> bottom
                matrix[last][last - offset] = matrix[i][last];

                //top -> right
                matrix[i][last] = top;
            }
        }
    }
}
