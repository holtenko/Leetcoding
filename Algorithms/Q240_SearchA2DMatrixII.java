/**
 * @author holten
 * @date 2021/4/24
 */
class Q240_SearchA2DMatrixII {
    public static void main(String[] args) {
        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}};
        int target = 5;
        System.out.println(searchMatrix(matrix, target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int row = rows - 1;
        int col = 0;
        while (row >= 0 && col < cols) {
            int num = matrix[row][col];
            if (target == num) {
                return true;
            } else if (num < target) {
                col++;
            } else {
                row--;
            }
        }
        return false;
    }
}