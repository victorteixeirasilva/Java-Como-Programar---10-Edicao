import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 6.26 - (Invertendo dígitos) Escreva um método que recebe um valor inteiro e retorna o número com seus
 *              dígitos invertidos. Por exemplo, dado o número 7.631, o método deve retornar 1.367. Incorpore o método a
 *              um aplicativo que lê um valor a partir da entrada fornecida pelo usuário e exibe o resultado.
 */
public class Main {
    public static int reverseDigits(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int lastDigit = number % 10; // Obtém o último dígito
            reversedNumber = reversedNumber * 10 + lastDigit; // Adiciona o último dígito ao número invertido
            number /= 10; // Remove o último dígito do número original
        }
        return reversedNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int number = scanner.nextInt();

        int reversedNumber = reverseDigits(number);

        System.out.println("O número invertido é: " + reversedNumber);

        scanner.close();
    }
}