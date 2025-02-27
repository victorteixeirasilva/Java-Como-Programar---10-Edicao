/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 7.21 - (Gráfico de tartaruga) A linguagem Logo tornou famoso o conceito de gráficos de tartaruga.
 *              Imagine uma tartaruga mecânica que caminha no lugar sob o controle de um aplicativo Java. A tartaruga
 *              segura uma caneta em uma de duas posições, para cima ou para baixo. Enquanto a caneta estiver para baixo,
 *              a tartaruga desenha formas à medida que se move, e enquanto estiver para cima, a tartaruga move-se quase
 *              livremente sem escrever nada. Neste problema, você simulará a operação da tartaruga e criará um bloco de
 *              rascunho computadorizado. Utilize um array de 20 por 20 floor que é inicializada como zeros. Leia
 *              comandos a partir de um array que contenha esses comandos. Monitore a posição atual da tartaruga todas
 *              as vezes e se a caneta está atualmente para cima ou para baixo. Suponha que a tartaruga sempre inicie na
 *              posição (0, 0) do chão com sua caneta para cima. O conjunto de comandos de tartaruga que seu aplicativo
 *              deve processar é mostrado na figura 7.29.
 *
 *                      | Comando | Significado |
 *                      | --- | --- |
 *                      | 1 | Caneta para cima |
 *                      | 2 | Caneta para baixo |
 *                      | 3 | Vira para a direita |
 *                      | 4 | Vira para a esquerda |
 *                      | 5, 10 | Avance 10 espaços (Substitua 10 por um número diferente de espaços) |
 *                      | 6 | Exiba o array 20 por 20 |
 *                      | 9 | Fim dos dados (sentinela) |
 *                      Figura 7.29 | Comandos dos gráficos de tartaruga.
 *
 *                      Suponha que a tartaruga esteja em algum lugar próximo ao centro do chão. O “programa” seguinte
 *                      desenharia e exibiria um quadrado de 12 por 12 deixando a caneta na posição levantada:
 *                      2
 *                      5,12
 *                      3
 *                      5,12
 *                      3
 *                      5,12
 *                      3
 *                      5,12
 *                      1
 *                      6
 *                      9
 *                      À medida que a tartaruga se move com a caneta por baixo, configure os elementos apropiados do
 *                      array floor como 1s. Quando o comando 6 (exibir o array) for dado, onde quer que haja um 1 no
 *                      array, exiba um asteriscos ou o caractere que você escolher. Onde quer que haja um 0, exiba um
 *                      espaço em branco. Escreva um aplicativo para implementar as capacidades dos gráficos de
 *                      tartaruga discutidas aqui. Escreva vários programas de gráfico de tartaruga para desenhar formas
 *                      interessantes. Adicione outros comandos para aumentar as capacidades de sua linguagem de gráfico
 *                      de tartaruga.
 */
public class TurtleGraphics {

    private static final int SIZE = 20;
    private static int[][] floor = new int[SIZE][SIZE];
    private static int x = 0;
    private static int y = 0;
    private static boolean penDown = false;
    private static int direction = 0; // 0 = up, 1 = right, 2 = down, 3 = left

    private static void processCommands(int[] commands) {
        for (int i = 0; i < commands.length; i++) {
            switch (commands[i]) {
                case 1: // Pen up
                    penDown = false;
                    break;
                case 2: // Pen down
                    penDown = true;
                    break;
                case 3: // Turn right
                    direction = (direction + 1) % 4;
                    break;
                case 4: // Turn left
                    direction = (direction + 3) % 4;
                    break;
                case 5: // Move forward
                    if (i + 1 < commands.length) {
                        int spaces = commands[++i];
                        moveForward(spaces);
                    }
                    break;
                case 6: // Display the floor array
                    displayFloor();
                    break;
                case 9: // End of data
                    return;
                default:
                    // Ignore invalid commands
                    break;
            }
        }
    }

    private static void moveForward(int spaces) {
        for (int i = 0; i < spaces; i++) {
            switch (direction) {
                case 0: // Up
                    if (x > 0) x--;
                    break;
                case 1: // Right
                    if (y < SIZE - 1) y++;
                    break;
                case 2: // Down
                    if (x < SIZE - 1) x++;
                    break;
                case 3: // Left
                    if (y > 0) y--;
                    break;
            }
            if (penDown) {
                floor[x][y] = 1;
            }
        }
    }

    private static void displayFloor() {
        for (int[] row : floor) {
            for (int cell : row) {
                System.out.print(cell == 1 ? "*" : " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Example commands to draw a 12x12 square
        int[] commands = {2, 5, 12, 3, 5, 12, 3, 5, 12, 3, 5, 12, 1, 6, 9};
        processCommands(commands);
    }
}

