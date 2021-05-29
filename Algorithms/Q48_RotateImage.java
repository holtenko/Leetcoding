import java.util.Arrays;

/**
 * @author holten
 * @date 2021/3/21
 */
class Q48_RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int row = 0; row < n / 2; row++) {
            for (int col = 0; col < n; col++) {
                swap(matrix, row, col, n - row - 1, col);
            }
        }

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row; col++) {
                swap(matrix, row, col, col, row);
            }
        }
    }

    private static void swap(int[][] matrix, int row1, int col1, int row2, int col2) {
        int temp = matrix[row1][col1];
        matrix[row1][col1] = matrix[row2][col2];
        matrix[row2][col2] = temp;
    }
}