import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author holten
 * @date 2016-06-29
 * Email: holten.ko@gmail.com
 */

public class Q051_NQueens {

    public static void main(String[] args) {
        Q051_NQueens q051NQueens = new Q051_NQueens();
        int n = 5;
        System.out.println(q051NQueens.solveNQueens(n));
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allSolutions = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int row = 0; row < n; row++) {
            Arrays.fill(board[row], '.');
        }
        backtrack(board, 0, allSolutions);
        return allSolutions;
    }

    public void backtrack(char[][] board, int row, List<List<String>> allSolutions) {
        if (row == board.length) {
            allSolutions.add(getBoardString(board));
            return;
        }
        for (int col = 0; col < board[row].length; col++) {
            if (!isValid(board, row, col)) {
                continue;
            }
            board[row][col] = 'Q';
            backtrack(board, row + 1, allSolutions);
            board[row][col] = '.';
        }
    }

    public boolean isValid(char[][] board, int rowIndex, int colIndex) {
        for (char[] row : board) {
            if (row[colIndex] == 'Q') {
                return false;
            }
        }
        int length = board.length;
        for (int i = 1; i < length; i++) {
            if (isValidIndex(length, rowIndex - i, colIndex - i)
                    && board[rowIndex - i][colIndex - i] == 'Q') {
                return false;
            }
            if (isValidIndex(length, rowIndex - i, colIndex + i)
                    && board[rowIndex - i][colIndex + i] == 'Q') {
                return false;
            }
            if (isValidIndex(length, rowIndex + i, colIndex - i)
                    && board[rowIndex + i][colIndex - i] == 'Q') {
                return false;
            }
            if (isValidIndex(length, rowIndex + i, colIndex + i)
                    && board[rowIndex + i][colIndex + i] == 'Q') {
                return false;
            }
        }


        return true;
    }

    public boolean isValidIndex(int length, int rowIndex, int colIndex) {
        return rowIndex >= 0 && colIndex >= 0 && rowIndex < length && colIndex < length;
    }

    public List<String> getBoardString(char[][] board) {
        List<String> boardString = new ArrayList<>();
        for (char[] row : board) {
            boardString.add(new String(row));
        }
        return boardString;
    }
}