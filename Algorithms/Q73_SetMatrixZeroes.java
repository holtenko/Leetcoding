import java.util.Arrays;

/**
 * @author holten
 * @date 2021/3/21
 */
class Q73_SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = {{1, 0, 3}};
        setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    public static void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        if (rows <= 0) {
            return;
        }
        int cols = matrix[0].length;
        if (cols <= 0) {
            return;
        }
        int matrix00 = matrix[0][0];
        boolean row0 = false;
        boolean col0 = false;
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) {
                col0 = true;
                break;
            }
        }
        for (int i = 1; i < cols; i++) {
            if (matrix[0][i] == 0) {
                row0 = true;
                break;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < rows; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int i = 1; i < cols; i++) {
            if (matrix[0][i] == 0) {
                for (int j = 0; j < rows; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
        if (matrix00 == 0 || row0) {
            for (int i = 0; i < cols; i++) {
                matrix[0][i] = 0;
            }
        }
        if (matrix00 == 0 || col0) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}