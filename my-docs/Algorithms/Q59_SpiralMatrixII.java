import java.util.Arrays;

/**
 * @author holten
 * @date 2021/3/16
 */
class Q59_SpiralMatrixII {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(Arrays.deepToString(generateMatrix(n)));
    }

    public static int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        boolean[][] visited = new boolean[n][n];

        int row = 0;
        int col = 0;

        int cur = 1;
        int direction = 0;
        boolean isChange = false;

        while (true) {
            if (!isChange) {
                result[row][col] = cur++;
                visited[row][col] = true;
            }
            if (direction == 0) {
                if (col == n - 1 || visited[row][col + 1]) {
                    if (isChange) {
                        break;
                    } else {
                        direction = (direction + 1) % 4;
                        isChange = true;
                    }
                } else {
                    col++;
                    isChange = false;
                }
            }
            if (direction == 1) {
                if (row == n - 1 || visited[row + 1][col]) {
                    if (isChange) {
                        break;
                    } else {
                        direction = (direction + 1) % 4;
                        isChange = true;
                    }
                } else {
                    row++;
                    isChange = false;
                }
            }
            if (direction == 2) {
                if (col == 0 || visited[row][col - 1]) {
                    if (isChange) {
                        break;
                    } else {
                        direction = (direction + 1) % 4;
                        isChange = true;
                    }
                } else {
                    col--;
                    isChange = false;
                }
            }
            if (direction == 3) {
                if (row == 0 || visited[row - 1][col]) {
                    if (isChange) {
                        break;
                    } else {
                        direction = (direction + 1) % 4;
                        isChange = true;
                    }
                } else {
                    row--;
                    isChange = false;
                }
            }
        }
        return result;
    }

}