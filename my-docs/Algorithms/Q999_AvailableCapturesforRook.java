import java.util.Arrays;

/**
 * @author holten
 * @date 2021/2/28
 */
class Q999_AvailableCapturesforRook {
    public static void main(String[] args) {
        char[][] board = {
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'.', '.', 'p', 'R', 'B', '.', '.', 'p'},
                {'.', '.', '.', 'B', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'}};
        System.out.println(numRookCaptures(board));
    }

    public static int numRookCaptures(char[][] board) {
        int num = 0;
        boolean rook = false;
        boolean pawn = false;
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                char chess = board[row][col];
                if (chess == 'R') {
                    rook = true;
                    if (pawn) {
                        num++;
                    }
                }
                if (chess == 'B') {
                    rook = false;
                    pawn = false;
                }
                if (chess == 'p') {
                    pawn = true;
                    if (rook) {
                        num++;
                        break;
                    }
                }
            }
            rook = false;
            pawn = false;
        }

        for (int col = 0; col < 8; col++) {
            for (int row = 0; row < 8; row++) {
                char chess = board[row][col];
                if (chess == 'R') {
                    rook = true;
                    if (pawn) {
                        num++;
                    }
                }
                if (chess == 'B') {
                    rook = false;
                    pawn = false;
                }
                if (chess == 'p') {
                    pawn = true;
                    if (rook) {
                        num++;
                        break;
                    }
                }
            }
            rook = false;
            pawn = false;
        }
        return num;
    }
}