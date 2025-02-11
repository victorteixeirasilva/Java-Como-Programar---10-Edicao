import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 6.17 - (Par ou Ímpar) Escreva um método isEven que utiliza o operador de resto(%) para determinar se um
 *              inteiro é par. O método deve levar um argumento inteiro e retornar true se o número for par, e false,
 *              caso contrário, Incorpore esse método a um aplicativo que insere uma sequência de inteiros (um por vez)
 *              e determina se cada um é par ou ímpar.
 */
public class Main {
    public static boolean isEven(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite um inteiro (ou -1 para sair): ");
            int numero = scanner.nextInt();

            if (numero == -1) {
                break; // Sai do loop se o usuário digitar -1
            }

            if (isEven(numero)) {
                System.out.println(numero + " é par.");
            } else {
                System.out.println(numero + " é ímpar.");
            }
        }

        scanner.close();
    }
}