import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 6.16 - (Múltiplos) Escreva um método isMultiple que determina um par de inteiros se o segundo inteiro for
 *              um múltiplo do primeiro. O método deve aceitar dois argumentos inteiros e retornar true se o segundo for
 *              um múltiplo do primeiro e false caso contrário. [Dica: utilize o operador de módulo.] Incorpore esse
 *              método a um aplicativo que insere uma série de pares de inteiros (um par por vez) e determina se o segundo
 *              valor em cada par é um múltiplo do primeiro.
 */
public class Main {
    public static boolean isMultiple(int primeiro, int segundo) {
        return segundo % primeiro == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o primeiro inteiro (ou -1 para sair): ");
            int primeiro = scanner.nextInt();

            if (primeiro == -1) {
                break; // Sai do loop se o usuário digitar -1
            }

            System.out.print("Digite o segundo inteiro: ");
            int segundo = scanner.nextInt();

            if (isMultiple(primeiro, segundo)) {
                System.out.println(segundo + " é múltiplo de " + primeiro);
            } else {
                System.out.println(segundo + " não é múltiplo de " + primeiro);
            }
        }

        scanner.close();
    }
}