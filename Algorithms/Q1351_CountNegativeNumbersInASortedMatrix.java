import java.util.Arrays;

/**
 * @author holten
 * @date 2021/3/24
 */
class Q1351_CountNegativeNumbersInASortedMatrix {
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegatives(grid));
    }

    public static int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            int[] rowNum = grid[i];
            for (int j = rowNum.length - 1; j >= 0; j--) {
                if (rowNum[j] < 0) {
                    count++;
                } else {
                    break;
                }
            }
        }
        return count;
    }
}