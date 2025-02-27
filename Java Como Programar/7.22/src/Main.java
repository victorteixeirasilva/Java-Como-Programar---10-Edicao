/**
 * @author Victor Teixeira Silva
 * @version 1.0
 */
public class Main {
    private static final int N = 8;
    private static int[][] board = new int[N][N];
    static int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    static int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};

    public static void main(String[] args) {
        int currentRow = 3; // Iniciar do centro
        int currentColumn = 4;
        int moveCount = 1;

        board[currentRow][currentColumn] = moveCount;

        while (moveCount < N * N) {
            boolean moveMade = false;
            for (int moveNumber = 0; moveNumber < 8; moveNumber++) {
                int newRow = currentRow + vertical[moveNumber];
                int newColumn = currentColumn + horizontal[moveNumber];

                if (isValidMove(newRow, newColumn)) {
                    currentRow = newRow;
                    currentColumn = newColumn;
                    board[currentRow][currentColumn] = ++moveCount;
                    moveMade = true;
                    break;
                }
            }
            if (!moveMade) break;
        }

        printBoard();
        System.out.println("Movimentos feitos: " + moveCount);
    }

    private static boolean isValidMove(int row, int column) {
        return row >= 0 && row < N && column >= 0 && column < N && board[row][column] == 0;
    }

    private static void printBoard() {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.printf("%2d ", cell);
            }
            System.out.println();
        }
    }
}