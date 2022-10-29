import DataStructure.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author holten
 * @date 2021/3/8
 */
class Q1260_Shift2DGrid {
    public static void main(String[] args) {
        int[][] grid = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int k = 1;
        System.out.println(shiftGrid(grid, k));
    }

    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < grid[i].length; j++) {
                row.add(0);
            }
            result.add(row);
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int newCol = (j + k) % grid[i].length;
                int newRow = (i + (j + k) / grid[i].length) % grid.length;
                result.get(newRow).set(newCol, grid[i][j]);
            }
        }
        return result;
    }
}