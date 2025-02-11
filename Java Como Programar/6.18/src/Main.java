import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 6.18 - (Exibindo um quadrado de asteriscos) Escreva um método squareOfAsterisks que exibe um quadrado
 *              sólido (o mesmo número de linhas e colunas) de asteriscos cujo lado é especificado no parâmetro inteiro
 *              side. Por exemplo, se side for 4, o método deverá exibir
 *              ****
 *              ****
 *              ****
 *              ****
 *              Incorpore esse método a um aplicativo que lê um valor inteiro para side a partir da entrada fornecida
 *              pelo usuário e gera saída dos asteriscos com o método squareOfAsterisks.
 */
public class Main {
    public static void squareOfAsterisks(int side) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print("*");
            }
            System.out.println(); // Muda de linha após cada linha de asteriscos
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um inteiro para o lado do quadrado: ");
        int side = scanner.nextInt();

        squareOfAsterisks(side);

        scanner.close();
    }
}