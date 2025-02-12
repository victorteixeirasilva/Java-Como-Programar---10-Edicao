import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 6.27 - (Máximo divisor comum) O máximo divisor comum (MDC) de dois inteiros é o maior inteiro que é
 *              divisível por cada um dos dois números. Escreva um método mdc que retorna o máximo divisor comum de dois
 *              inteiros. [Dica: você poderia querer utilizar o algoritmo de Euclides. Você pode encontrar informações
 *              sobre isso em en.wikipedia.org/wiki/Eucliadean_algorithm.com] Incorpore o método a um aplicativo que lê
 *              dois valores de usuário e exibe o resultado.
 */
public class Main {

    public static int mdc(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro inteiro: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo inteiro: ");
        int b = scanner.nextInt();

        int resultado = mdc(a, b);

        System.out.println("O MDC de " + a + " e " + b + " é: " + resultado);

        scanner.close();
    }
}