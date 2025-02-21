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
    private static int[] derrotas = new int[21];

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
                    derrotas[0]++;
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
                        addDerrotas(count);
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
        System.out.println("***   A - Resultado Vitórias   ***");

        System.out.println("Rolagem     |       Vitórias");

        for (int i = 1; i <= 20; i++){
            System.out.println("  " + i + "       |      " + vitorias[i-1] + "  ");
        }

        System.out.println();
        System.out.println("***   B - Resultado Derrotas   ***");

        System.out.println("Rolagem     |       Derotas");

        for (int i = 1; i <= 20; i++){
            System.out.println("  " + i + "       |      " + derrotas[i-1] + "  ");
        }

        System.out.println();
        System.out.println("C) Quais são as chances de ganhar no jogo de dado?\n" +
                "\n" +
                "O Craps é um dos jogos de azar mais comuns em cassinos, o que significa que, apesar da aparente aleatoriedade, a casa (o cassino) tem uma vantagem estatística. No entanto, o Craps oferece algumas das melhores chances de ganhar em comparação com outros jogos de cassino, especialmente se você entender as apostas mais favoráveis.\n" +
                "\n" +
                "As chances de ganhar no Craps variam dependendo do tipo de aposta que você faz. Algumas apostas têm uma chance maior de ganhar, mas pagam menos, enquanto outras têm uma chance menor, mas pagam mais.\n" +
                "\n" +
                "Apostas na linha de passe/não passe: São as apostas mais básicas e têm uma chance de ganhar de aproximadamente 49%. A vantagem da casa nessas apostas é de cerca de 1,41%.\n" +
                "Apostas de probabilidades: São apostas adicionais que você pode fazer após ter feito uma aposta na linha de passe/não passe. Essas apostas não têm vantagem da casa, o que significa que suas chances de ganhar são iguais às chances da casa. No entanto, você só pode fazer essas apostas se já tiver feito uma aposta na linha de passe/não passe, que tem uma vantagem da casa.\n" +
                "Outras apostas: Existem muitas outras apostas no Craps, mas a maioria delas tem uma vantagem da casa maior do que as apostas na linha de passe/não passe e as apostas de probabilidades.\n" +
                "O que significa o Craps ser um dos jogos mais comuns de cassino?\n" +
                "\n" +
                "A popularidade do Craps significa que ele atrai muitos jogadores, o que, por sua vez, gera mais receita para o cassino. A relativa simplicidade das regras e a emoção do jogo contribuem para sua popularidade.\n" +
                "\n" +
                "D) Qual é a duração média de um jogo de dados Craps?\n" +
                "\n" +
                "A duração média de um jogo de Craps pode variar muito dependendo de vários fatores, como o número de jogadores, a velocidade do jogo e a sorte dos jogadores. No entanto, um jogo típico de Craps pode durar de alguns minutos a várias horas.\n" +
                "\n" +
                "E) As chances de ganhar aumentam com a duração do jogo?\n" +
                "\n" +
                "Não, as chances de ganhar no Craps não aumentam com a duração do jogo. Cada lançamento dos dados é um evento independente, o que significa que os resultados anteriores não afetam os resultados futuros. Se você fizer uma aposta com uma chance de ganhar de 49%, essa chance permanecerá a mesma, independentemente de você ter jogado por alguns minutos ou várias horas.\n" +
                "\n" +
                "Em resumo:\n" +
                "\n" +
                "O Craps oferece algumas das melhores chances de ganhar em comparação com outros jogos de cassino.\n" +
                "As chances de ganhar variam dependendo do tipo de aposta que você faz.\n" +
                "A duração do jogo não afeta suas chances de ganhar.\n" +
                "Lembre-se:\n" +
                "\n" +
                "O Craps é um jogo de azar e a casa sempre tem uma vantagem estatística.\n" +
                "Jogue com responsabilidade e aposte apenas o que você pode perder.\n" +
                "Entenda as regras e as diferentes apostas antes de começar a jogar.");

    }

    public static void addDerrotas(int count){
        switch (count) {
            case 2:
                derrotas[1]++;
                break;
            case 3:
                derrotas[2]++;
                break;
            case 4:
                derrotas[3]++;
                break;
            case 5:
                derrotas[4]++;
                break;
            case 6:
                derrotas[5]++;
                break;
            case 7:
                derrotas[6]++;
                break;
            case 8:
                derrotas[7]++;
                break;
            case 9:
                derrotas[8]++;
                break;
            case 10:
                derrotas[9]++;
                break;
            case 11:
                derrotas[10]++;
                break;
            case 12:
                derrotas[11]++;
                break;
            case 13:
                derrotas[12]++;
                break;
            case 14:
                derrotas[13]++;
                break;
            case 15:
                derrotas[14]++;
                break;
            case 16:
                derrotas[15]++;
                break;
            case 17:
                derrotas[16]++;
                break;
            case 18:
                derrotas[17]++;
                break;
            case 19:
                derrotas[18]++;
                break;
            case 20:
                derrotas[19]++;
                break;
            default:
                derrotas[20]++;
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