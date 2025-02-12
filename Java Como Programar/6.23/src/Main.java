import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 6.23 - (Localize o mínimo) Escreva um método minimum3 que retorna o menor dos três números de ponto
 *              flutuante. Utilize o método Math.min para implementar minimum3. Incorpore o método a um aplicativo que
 *              lê três valores do usuário, determina o menor valor e exibe o resultado.
 */
public class Main {

    public static double minimum3(double valor1, double valor2, double valor3) {
        return Math.min(valor1, Math.min(valor2, valor3));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        double valor1 = scanner.nextDouble();
        System.out.println();

        System.out.print("Informe o segundo valor: ");
        double valor2 = scanner.nextDouble();
        System.out.println();

        System.out.print("Informe o terceiro valor: ");
        double valor3 = scanner.nextDouble();
        System.out.println();

        System.out.println("O menor valor informado foi: " + minimum3(valor1, valor2, valor3));


    }
}