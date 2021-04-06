/**
 * @author holten
 * @date 2021/3/27
 */
class Q200_NumberOfIslands {
    public static void main(String[] args) {
//        char[][] grid = {
//                {'1', '1', '1', '1', '0'},
//                {'1', '1', '0', '1', '0'},
//                {'1', '1', '0', '0', '1'},
//                {'0', '0', '0', '1', '0'}
//        };
        char[][] grid = {
                {'1', '0','1', '1', '0','1', '1'}
        };
        System.out.println(numIslands(grid));
    }

    public static int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int island = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    island++;
                    dfs(i, j, grid);
                }
            }
        }
        return island;
    }

    private static void dfs(int row, int col, char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        if (row < 0 || row > m - 1 || col < 0 || col > n - 1 || grid[row][col] == '0') {
            return;
        }
        grid[row][col] = '0';
        dfs(row - 1, col, grid);
        dfs(row + 1, col, grid);
        dfs(row, col - 1, grid);
        dfs(row, col + 1, grid);
    }
}