import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 6.21 - (Separando dígitos) Escreva métodos que realizam cada uma das seguintes tarefas:
 *              A) Calcule a parte inteiro do quociente quando o inteiro a é dividido pelo inteiro b.
 *              B) Calcule o resto inteiro quando o inteiro a é dividido por inteiro b.
 *              C) Utilize métodos desenvolvidos nas partes (a) e (b) para escrever um método displayDigits que recebe
 *              um inteiro entre 1 e 99999 e  o exibe como uma sequência de dígitos, separando cada par de dígitos por
 *              dois espaços. Por exemplo, o inteiro 4562 deve aparecer como: 4 5 6 2
 *              Incorpore os métodos em um aplicativo que insere um número inteiro e chama displayDigits passando para
 *              o método número inteiro inserido. Exiba os resultados.
 */
public class Main {
    public static int calculateQuotient(int a, int b) {
        return a / b;
    }
    public static int calculateRemainder(int a, int b) {
        return a % b;
    }
    public static void displayDigits(int number) {
        if (number < 1 || number > 99999) {
            System.out.println("Número fora do intervalo permitido.");
            return;
        }

        int divisor = 10000; // Começamos com o divisor para o dígito mais à esquerda

        while (divisor > 0) {
            int digit = calculateQuotient(number, divisor);
            System.out.print(digit + "  ");
            number = calculateRemainder(number, divisor);
            divisor /= 10;
        }

        System.out.println(); // Nova linha no final
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um inteiro entre 1 e 99999: ");
        int number = scanner.nextInt();

        displayDigits(number);

        scanner.close();
    }
}