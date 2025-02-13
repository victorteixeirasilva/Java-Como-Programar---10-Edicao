import java.security.SecureRandom;
import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 6.33 - (Modificação do jogo Craps) Modifique o programa de jogo de dados craps da Figura 6.8 para
 *              permitir apostas. Inicialize a variável bankBalance como 1.000 dólares. Peça ao jogador que insira um
 *              wager. Verifique se wager é menor ou igual a bankBalance e, se não for, faça o usuário reinserir wager
 *              até um wager válido ser inserido. Então, execute um jogo de dados.
 *
 *              Se o jogador ganhar, aumente
 *              bankBalance por wager e exiba o novo bankBalance.
 *
 *              Se o jogador perder, diminua bankBalance por wager, exiba o novo bankBalance,
 *
 *              verifique se bankBalance tornou-se zero e, se isso tiver ocorrido, exiba a
 *              mensagem “Sorry. You busted!” [”Desculpe, mas você faliu!”].
 *
 *              À medida que o jogo se desenvolve, exiba
 *              várias mensagens para criar uma “conversa”, como
 *
 *              “Oh, you’re going for broke, huh?” [”Oh, parece que você vai quebrar, hein?”] ou
 *              “Aw c’ mon, take a chance!” [”Ah, vamos lá, dê uma chance para sua sorte”] ou
 *              “You re up big. Now’s the time to cash in your chips!” [Você está montado na grana. Agora é hora de
 *              trocar essas fichas e embolsar o dinheiro!”].
 *
 *              Implemente a “conversa” como um método separado que
 *              escolhe aleatoriamente a string a ser exibida.
 */
public class Main {

    // Inicialize a variável bankBalance como 1.000 dólares.
    private static double bankBalance = 1000;
    private static Scanner scanner = new Scanner(System.in);

    private static void wager(){
        mostrarSaldo();

        if (bankBalance <= 0){
            System.out.println("Sorry. You busted!” [”Desculpe, mas você faliu!”]");
            System.exit(1);
        }

        System.out.println("Informe o valor que desja apostar: ");
        double wager = scanner.nextDouble();

        if (wager > bankBalance) {
            System.out.println("Valor invalido");
            wager();
        }

        if (playCraps()){
            bankBalance = bankBalance + wager;
            mostrarSaldo();
            conversas();
            wager();
        } else {
            bankBalance = bankBalance - wager;
            mostrarSaldo();
            conversas();
            wager();
        }




    }

    // Método que exibe as mensagens
    private static void conversas(){
        int mensagem = randomNumbers.nextInt(3);

        switch (mensagem){
            case 0:
                System.out.println("“Oh, you’re going for broke, huh?” \n[”Oh, parece que você vai quebrar, hein?”]");
                break;
            case 1:
                System.out.println("“Aw c’ mon, take a chance!” \n[”Ah, vamos lá, dê uma chance para sua sorte”]");
                break;
            case 2:
                System.out.println("“You re up big. Now’s the time to cash in your chips!” \n[Você está montado na grana. Agora é hora de trocar essas fichas e embolsar o dinheiro!”]");
                break;
        }
    }

    // método que mostra o saldo do usuário
    private static void mostrarSaldo(){
        System.out.println("Seu saldo é: " + bankBalance);
    }

    // cria um gerador seguro de números aleatórios para o uso no método rollDice
    private static final SecureRandom randomNumbers = new SecureRandom();

    // Tipo enum com constantes que representam o estado do jogo
    private enum Status { CONTINUE, WON, LOST}

    // constantes que representam lançamentos comuns dos dados
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    // Joga uma partida de craps
    private static boolean playCraps(){
        int myPoint = 0; // pontos se não ganhar ou perder na 1 rolagem
        Status gameStatus;

        int sumOfDice = rollDice();

        // Determina o estado do jogo e a pontuação com base no primeiro lançamento
        switch (sumOfDice) {
            case SEVEN: // Ganha com 7 no primeiro lançamento
            case YO_LEVEN:
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES:
            case TREY:      // Perde com 3 no primeiro lançamento
            case BOX_CARS:
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice; // informa a pontuação
                System.out.printf("Point is %d%n", myPoint);
                break;
        }

        // Enquanto o jogo não estiver completo
        while (gameStatus == Status.CONTINUE) { // nem WON nem LOST

            sumOfDice = rollDice();

            // Determina o estado do jogo
            if (sumOfDice == myPoint) { // vitória por pontuação
                gameStatus = Status.WON;
            } else {
                if (sumOfDice == SEVEN) {
                    gameStatus = Status.LOST;
                }
            }

        }

        // Exibe uma mensagem ganhou ou perdeu
        if (gameStatus == Status.WON) {
            System.out.println("Player Wins");
            return true;
        } else {
            System.out.println("Player Loses");
            return false;
        }
    }


    public static void main(String[] args) {
        wager();
    }

    // lança os dados, calcula a soma e exibe os resultados
    public static int rollDice(){
        // seleciona valores aleatórios do dado
        int die1 = 1 + randomNumbers.nextInt(6); // primeiro lançamento do dado
        int die2 = 1 + randomNumbers.nextInt(6); // segundo lançamento do dado

        int sum = die1 + die2; // soma dos valores dos dados

        // exibe os resultados desse lançamento
        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);

        return sum;
    }

}