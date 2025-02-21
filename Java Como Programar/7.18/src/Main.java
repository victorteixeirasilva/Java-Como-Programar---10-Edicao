import java.security.SecureRandom;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 7.18 - (Jogo de dados Craps)  Escreva um aplicativo que executa 1.000.000 de partidas de jogo de dados
 *              craps (Figura 6.8) e responda às seguintes perguntas:
 *              A) Quantos jogos são ganhos na primeira rolagem, segunda rolagem, …, vigésima rolagem e depois vigésima
 *              rolagem?
 *              B) Quantos jogos são perdidos na primeira rolagem, segunda rolage, …, vigésima rolagem e depois da
 *              vigésima rolagem?
 *              C) Quais são as chances de ganhar no jogo de dado? [Observação: Você deve descobrir que o craps é um dos
 *              jogos mais comuns de cassino. O que você supõe que isso significa?]
 *              D) Qual é a duração média de um jogo de dados craps?
 *              E) As chances de ganhar aumentam com a duração do jogo?
 */
public class Main {
    // cria um gerador seguro de números aleatórios para uso no método rollDice
    private static final SecureRandom randomNumbers = new SecureRandom();

    // tipo enum com constantes que representam o estado do jogo
    private enum Status { CONTINUE, WON, LOST };

    // constantes que representam lançamentos comuns dos dados
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    private static int[] vitorias = new int[21];

    // joga uma partida de craps
    public static void main(String[] args) {



        for (int x = 1; x <= 1000000; x++){
            int myPoint = 0; // pontos se não ganhar ou perder na 1ª rolagem
            Status gameStatus; // pode conter CONTINUE, WON ou LOST

            int sumOfDice = rollDice(); // primeira rolagem dos dados

            // determina o estado do jogo e a pontuação com base no primeiro lançamento
            switch (sumOfDice) {
                case SEVEN: // ganha com 7 no primeiro lançamento
                case YO_LEVEN: // ganha com 11 no primeiro lançamento
                    gameStatus = Status.WON;
                    vitorias[0]++;
                    break;
                case SNAKE_EYES: // perde com 2 no primeiro lançamento
                case TREY: // perde com 3 no primeiro lançamento
                case BOX_CARS: // perde com 12 no primeiro lançamento
                    gameStatus = Status.LOST;
                    break;
                default: // não ganhou nem perdeu, portanto registra a pontuação
                    gameStatus = Status.CONTINUE; // jogo não terminou
                    myPoint = sumOfDice; // informa a pontuação
                    System.out.printf("Point is %d%n", myPoint);
                    break;
            }

            int count = 2;
            // enquanto o jogo não estiver completo
            while (gameStatus == Status.CONTINUE) // nem WON nem LOST
            {
                sumOfDice = rollDice(); // lança os dados novamente

                // determina o estado do jogo
                if (sumOfDice == myPoint) {
                    // vitória por pontuação
                    gameStatus = Status.WON;
                    addVitorias(count);
                } else {
                    if (sumOfDice == SEVEN) // perde obtendo 7 antes de atingir a pontuação
                    {
                        gameStatus = Status.LOST;
                    }
                }
                count++;
            }

            // exibe uma mensagem ganhou ou perdeu
            if (gameStatus == Status.WON)
                System.out.println("Player wins");
            else
                System.out.println("Player loses");
        }

        System.out.println();
        System.out.println("***         Resultado       ***");

        System.out.println("Rolagem     |       Vitórias");

        for (int i = 1; i <= 20; i++){
            System.out.println("  " + i + "       |      " + vitorias[i-1] + "  ");
        }

    }

    public static void addVitorias(int count){
        switch (count) {
            case 2:
                vitorias[1]++;
                break;
            case 3:
                vitorias[2]++;
                break;
            case 4:
                vitorias[3]++;
                break;
            case 5:
                vitorias[4]++;
                break;
            case 6:
                vitorias[5]++;
                break;
            case 7:
                vitorias[6]++;
                break;
            case 8:
                vitorias[7]++;
                break;
            case 9:
                vitorias[8]++;
                break;
            case 10:
                vitorias[9]++;
                break;
            case 11:
                vitorias[10]++;
                break;
            case 12:
                vitorias[11]++;
                break;
            case 13:
                vitorias[12]++;
                break;
            case 14:
                vitorias[13]++;
                break;
            case 15:
                vitorias[14]++;
                break;
            case 16:
                vitorias[15]++;
                break;
            case 17:
                vitorias[16]++;
                break;
            case 18:
                vitorias[17]++;
                break;
            case 19:
                vitorias[18]++;
                break;
            case 20:
                vitorias[19]++;
                break;
            default:
                vitorias[20]++;
        }
    }

    // lança os dados, calcula a soma e exibe os resultados
    public static int rollDice() {
        // seleciona valores aleatórios do dado
        int die1 = 1 + randomNumbers.nextInt(6); // primeiro lançamento do dado
        int die2 = 1 + randomNumbers.nextInt(6); // segundo lançamento do dado

        int sum = die1 + die2; // soma dos valores dos dados

        // exibe os resultados desse lançamento
        System.out.printf("Player rolled %d + %d = %d%n",
                die1, die2, sum);

        return sum;
    }

}