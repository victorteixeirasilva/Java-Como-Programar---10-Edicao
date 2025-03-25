import java.util.Scanner;

public class TicTacToe3D {
    private static final int SIZE = 4;
    private static final char[][][] board = new char[SIZE][SIZE][SIZE];

    public static void main(String[] args) {
        initializeBoard();
        playGame();
    }

    // Inicializa o tabuleiro com espaços vazios
    private static void initializeBoard() {
        for (int x = 0; x < SIZE; x++) {
            for (int y = 0; y < SIZE; y++) {
                for (int z = 0; z < SIZE; z++) {
                    board[x][y][z] = '-';
                }
            }
        }
    }

    // Exibe o tabuleiro
    private static void displayBoard() {
        for (int z = 0; z < SIZE; z++) {
            System.out.println("Camada " + z + ":");
            for (int x = 0; x < SIZE; x++) {
                for (int y = 0; y < SIZE; y++) {
                    System.out.print(board[x][y][z] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    // Executa o jogo principal
    private static void playGame() {
        Scanner scanner = new Scanner(System.in);
        char currentPlayer = 'X';
        boolean gameWon = false;
        int turns = 0;

        while (!gameWon && turns < SIZE * SIZE * SIZE) {
            displayBoard();
            System.out.println("Jogador " + currentPlayer + ", insira sua jogada (x y z):");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();

            if (isValidMove(x, y, z)) {
                board[x][y][z] = currentPlayer;
                gameWon = checkWin(x, y, z, currentPlayer);

                if (gameWon) {
                    displayBoard();
                    System.out.println("Jogador " + currentPlayer + " vence!");
                } else {
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                    turns++;
                }
            } else {
                System.out.println("Jogada inválida. Tente novamente.");
            }
        }

        if (!gameWon) {
            System.out.println("O jogo terminou em empate!");
        }

        scanner.close();
    }

    // Verifica se a jogada é válida
    private static boolean isValidMove(int x, int y, int z) {
        return x >= 0 && x < SIZE && y >= 0 && y < SIZE && z >= 0 && z < SIZE && board[x][y][z] == '-';
    }

    // Verifica se o jogador atual venceu
    private static boolean checkWin(int x, int y, int z, char player) {
        // Verifica linhas, colunas e diagonais em todas as dimensões
        return checkLine(x, y, z, 1, 0, 0, player) || // Linha X
                checkLine(x, y, z, 0, 1, 0, player) || // Linha Y
                checkLine(x, y, z, 0, 0, 1, player) || // Linha Z
                checkLine(x, y, z, 1, 1, 0, player) || // Diagonal XY
                checkLine(x, y, z, 1, 0, 1, player) || // Diagonal XZ
                checkLine(x, y, z, 0, 1, 1, player) || // Diagonal YZ
                checkLine(x, y, z, 1, 1, 1, player) || // Diagonal XYZ
                checkLine(x, y, z, 1, -1, 0, player) || // Anti-diagonal XY
                checkLine(x, y, z, 1, 0, -1, player) || // Anti-diagonal XZ
                checkLine(x, y, z, 0, 1, -1, player);   // Anti-diagonal YZ
    }

    // Verifica uma linha (direção dada por dx, dy, dz)
    private static boolean checkLine(int x, int y, int z, int dx, int dy, int dz, char player) {
        int count = 0;

        for (int i = -3; i <= 3; i++) {
            int nx = x + i * dx;
            int ny = y + i * dy;
            int nz = z + i * dz;

            if (nx >= 0 && nx < SIZE && ny >= 0 && ny < SIZE && nz >= 0 && nz < SIZE &&
                    board[nx][ny][nz] == player) {
                count++;
                if (count == 4) {
                    return true;
                }
            } else {
                count = 0;
            }
        }

        return false;
    }
}