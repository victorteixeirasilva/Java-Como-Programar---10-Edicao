import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 8.17 (Jogo da velha) Crie uma classe TicTacToe que permitirá escrever um programa para reproduzir o jogo
 * da velha. A classe contém um array bidimensional privado 3 por 3. Use um tipo enum para representar o valor em cada
 * célula do array. As constantes enum devem ser nomeadas X, O e EMPTY (para uma posição que não contém X ou 0).
 * O construtor deve inicializar os elementos do tabuleiro para EMPTY. Permita dois jogadores humanos. Para onde quer
 * que o primeiro jogador se mova, coloque um X no quadrado especificado; coloque um O no local para o qual o segundo
 * jogador se mover. Todo movimento deve ocorrer em um quadrado vazio. Depois de cada jogada, determine se o jogo foi
 * ganho e se aconteceu um empate. Se você se sentir motivado, modifique seu programa de modo que o computador faça o
 * movimento para um dos jogadores. Além disso, permita que o jogador especifique se quer ser o primeiro ou o segundo.
 * Se você se sentir excepcionalmente motivado, desenvolva um programa que jogue o Tic-Tac-Toe tridimensional em uma
 * grade 4 por 4 por 4. [Observação: isso é um projeto extremamente desafiador!]
 *
 * 1 - Desafio.
 *      A classe contém um array bidimensional privado 3 por 3.
 *
 *      Use um tipo enum para representar o valor em cada célula do array.
 *              As constantes enum devem ser nomeadas X, O e EMPTY (para uma posição que não contém X ou 0).
 *
 *      O construtor deve inicializar os elementos do tabuleiro para EMPTY.
 *
 *      Permita dois jogadores humanos.
 *
 *      Para onde quer que o primeiro jogador se mova, coloque um X no quadrado especificado; coloque um O no local para
 *      o qual o segundo jogador se mover.
 *
 *      Todo movimento deve ocorrer em um quadrado vazio. Depois de cada jogada, determine se o jogo foi ganho e se
 *      aconteceu um empate.
 *
 * 2 - Desafio.
 *
 *      Se você se sentir motivado, modifique seu programa de modo que o computador faça o movimento para um dos jogadores.
 *
 *      Além disso, permita que o jogador especifique se quer ser o primeiro ou o segundo.
 *
 * 3 - Desafio.
 *
 *      Se você se sentir excepcionalmente motivado, desenvolva um programa que jogue o Tic-Tac-Toe tridimensional em uma
 *      grade 4 por 4 por 4. [Observação: isso é um projeto extremamente desafiador!]
 *
 */
public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        var ticTacToe = new TicTacToe();

        System.out.println("Escolha uma opção:\n" +
                "1 - Jogador 1 VS Jogador 2\n" +
                "2 - Jogador 1 VS Computador\n");
        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                System.out.println(ticTacToe);
                ticTacToe.jogarDoisJogadores();
                break;
            case 2:
                System.out.println(ticTacToe);
                ticTacToe.jogarContraBot();
                break;
            default:
                System.exit(1);
        }

    }
}