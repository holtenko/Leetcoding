import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author holten
 * @date 2021/3/8
 */
class Q54_SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println(spiralOrder(matrix));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix.length <= 0 || matrix[0].length <= 0) {
            return result;
        }
        int rowNum = matrix.length;
        int colNum = matrix[0].length;
        boolean[][] visited = new boolean[rowNum][colNum];
        int row = 0;
        int col = 0;
        int direction = 0;
        boolean isChange = false;
        while (true) {
            if (!isChange) {
                result.add(matrix[row][col]);
                visited[row][col] = true;
            }
            direction = direction % 4;

            if (direction == 0) {
                if (col == colNum - 1 || visited[row][col + 1]) {
                    if (isChange) {
                        break;
                    }
                    direction++;
                    isChange = true;
                } else {
                    col++;
                    isChange = false;
                }
            } else if (direction == 1) {
                if (row == rowNum - 1 || visited[row + 1][col]) {
                    if (isChange) {
                        break;
                    }
                    direction++;
                    isChange = true;
                } else {
                    row++;
                    isChange = false;

                }
            } else if (direction == 2) {
                if (col == 0 || visited[row][col - 1]) {
                    if (isChange) {
                        break;
                    }
                    direction++;
                    isChange = true;
                } else {
                    col--;
                    isChange = false;
                }
            } else {
                if (row == 0 || visited[row - 1][col]) {
                    if (isChange) {
                        break;
                    }
                    direction++;
                    isChange = true;
                } else {
                    row--;
                    isChange = false;

                }
            }
        }
        return result;
    }
}