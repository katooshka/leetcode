package solutions;

public class ValidSudoku {
    private static final int BOARD_LENGTH = 9;
    private static final char CHAR = '.';

    public boolean isValidSudoku(char[][] board) {
        return checkRows(board) && checkColumns(board) && checkSubBoards(board);
    }

    private boolean checkRows(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (!isValid(board, i, i, 0, BOARD_LENGTH - 1)) {
                return false;
            }
        }
        return true;
    }

    private boolean checkColumns(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (!isValid(board, 0, BOARD_LENGTH - 1, i, i)) {
                return false;
            }
        }
        return true;
    }

    private boolean checkSubBoards(char[][] board) {
        for (int i = 0; i < BOARD_LENGTH; i += 3) {
            for (int j = 0; j < BOARD_LENGTH; j += 3) {
                if (!isValid(board, i, i + 2, j, j + 2)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid(char[][] board, int minI, int maxI, int minJ, int maxJ) {
        int nums = 0;
        for (int i = minI; i <= maxI; i++) {
            for (int j = minJ; j <= maxJ; j++) {
                if (board[i][j] != CHAR) {
                    int d = board[i][j] - '0' - 1;
                    if (isBitEnabled(nums, d)) {
                        return false;
                    }
                    nums = enableBit(nums, d);
                }
            }
        }
        return true;
    }

    private int enableBit(int x, int i) {
        return x | (1 << i);
    }

    private boolean isBitEnabled(int x, int i) {
        return (x & (1 << i)) != 0;
    }

    public static void main(String[] args) {
        char[][] board1 = {
                "....5..1.".toCharArray(),
                ".4.3.....".toCharArray(),
                ".....3..1".toCharArray(),
                "8......2.".toCharArray(),
                "..2.7....".toCharArray(),
                ".15......".toCharArray(),
                ".....2...".toCharArray(),
                ".2.9.....".toCharArray(),
                "..4......".toCharArray()
        };

        char[][] board2 = {
                ".87654321".toCharArray(),
                "2........".toCharArray(),
                "3........".toCharArray(),
                "4........".toCharArray(),
                "5........".toCharArray(),
                "6........".toCharArray(),
                "7........".toCharArray(),
                "8........".toCharArray(),
                "9........".toCharArray()
        };
        System.out.println("false: " + new ValidSudoku().isValidSudoku(board1));
        System.out.println("true: " + new ValidSudoku().isValidSudoku(board2));
    }
}
