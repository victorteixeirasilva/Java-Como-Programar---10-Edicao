import java.security.SecureRandom;
import java.util.ArrayList;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 7.17 - (Jogo de dados) - Escreva um aplicativo para simular o lançamento de dois dados. O aplicativo
 *              deve utilizar um objeto da classe Random, uma vez para lançar o primeiro dado e novamente para lançar o
 *              segundo dado. A soma dos dois valores deve então ser calculada. Cada dado pode mostrar um valor inteiro
 *              de 1 a 6, portanto a soma dos valores irá variar de 2 a 12, com 7 sendo a soma mais frequente e 2 e 12,
 *              as somas menos frequentes. A Figura 7.28 mostra as 36 possíveis combinações de dois dados. Seu aplicativo
 *              deve lançar o dado 36.000.000 vezes. Utilize um array unidimensional para contar o número de vezes que
 *              cada possível soma aparece, Exiba os resultados em formato tabular.
 *
 *          |   | 1 | 2 | 3 | 4 | 5 | 6 |
 *          | 1 | 2 | 3 | 4 | 5 | 6 | 7 |
 *          | 2 | 3 | 4 | 5 | 6 | 7 | 8 |
 *          | 3 | 4 | 5 | 6 | 7 | 8 | 9 |
 *          | 4 | 5 | 6 | 7 | 8 | 9 | 10 |
 *          | 5 | 6 | 7 | 8 | 9 | 10 | 11 |
 *          | 6 | 7 | 8 | 9 | 10 | 11 | 12 |
 */
public class Main {

    private static int qtd2 = 0;
    private static int qtd3 = 0;
    private static int qtd4 = 0;
    private static int qtd5 = 0;
    private static int qtd6 = 0;
    private static int qtd7 = 0;
    private static int qtd8 = 0;
    private static int qtd9 = 0;
    private static int qtd10 = 0;
    private static int qtd11 = 0;
    private static int qtd12 = 0;

    private static final int LIMITE_RODADS = 36000000;

    public static void main(String[] args) {

        for (int i = 0; i <= LIMITE_RODADS; i++){
            int dadoUm = lancarDado();
            int dadoDois = lancarDado();

            int soma = dadoUm + dadoDois;

            adicionarAQtd(soma);
        }

        ArrayList<Integer> qtd = new ArrayList<>();
        qtd.add(qtd2);
        qtd.add(qtd3);
        qtd.add(qtd4);
        qtd.add(qtd5);
        qtd.add(qtd6);
        qtd.add(qtd7);
        qtd.add(qtd8);
        qtd.add(qtd9);
        qtd.add(qtd10);
        qtd.add(qtd11);
        qtd.add(qtd12);

        System.out.println("Soma  |  Quantidade de Vezes"); // títulos de coluna

        int count = 2;
        for (int qtdN : qtd){
            System.out.println(count + "       |       " + qtdN);
            count++;
        }

    }
    public static int lancarDado(){
        SecureRandom random = new SecureRandom();
        return random.nextInt(1, 7);
    }
    public static void adicionarAQtd(int soma){
        switch (soma){
            case 2:
                qtd2++;
                break;
            case 3:
                qtd3++;
                break;
            case 4:
                qtd4++;
                break;
            case 5:
                qtd5++;
                break;
            case 6:
                qtd6++;
                break;
            case 7:
                qtd7++;
                break;
            case 8:
                qtd8++;
                break;
            case 9:
                qtd9++;
                break;
            case 10:
                qtd10++;
                break;
            case 11:
                qtd11++;
                break;
            case 12:
                qtd12++;
                break;
        }
    }
}