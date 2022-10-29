
/**
 * @author holten
 * @email holten.ko@gmail.com
 * @date 2021-03-04
 */
class Q807_MaxIncreasetoKeepCitySkyline {
    public static void main(String[] args) {
        int[][] grid = {{1, 2, 1}, {2, 1, 3}};
        System.out.println(maxIncreaseKeepingSkyline(grid));
    }

    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] rowMax = new int[grid.length];
        int[] colMax = new int[grid[0].length];
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                rowMax[row] = findMax(grid[row][col], rowMax[row]);
                colMax[col] = findMax(grid[row][col], colMax[col]);
            }
        }
        int maxIncrease = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                maxIncrease += findMin(rowMax[row], colMax[col]) - grid[row][col];
            }
        }
        return maxIncrease;
    }

    private static int findMax(int a, int b) {
        return a >= b ? a : b;
    }

    private static int findMin(int a, int b) {
        return a <= b ? a : b;
    }
}