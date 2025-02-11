import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 6.10 (Arredondando Números) Para arredondar números em casas decimais específicas, utilize uma instrução
 *              com
 *              y = Math.floor(x * 10 + 0.5) / 10;
 *              que arredonda x para casa decimal (isto é, a primeira posição à direita do ponto de fração decimal), ou
 *              y = Math.floor(x * 100 + 0.5) / 100;
 *              que arredonda x para casa centesimal (isto é, a segunda posição à direita do ponto de fração decimal).
 *              Escreva um aplicativo que defina quatro métodos para arredondar um número x de várias maneiras:
 *
 *              A) roundToInteger(number)
 *              B) roundToTenths(number)
 *              C) roundToHundredths(number)
 *              D) roundToThousandths(number)
 *
 *              Para cada leitura de valor, seu programa deve exibir o valor original, o número arredondado para inteiro
 *              mais próximo, o número arredondado para o décimo mais próximo, o número  arredondado para o centésimo
 *              mais próximo e o número arredondado para o milésimo mais próximo.
 */
public class Main {
    public static double roundToInteger(double number) {
        return Math.floor(number + 0.5);
    }

    public static double roundToTenths(double number) {
        return Math.floor(number * 10 + 0.5) / 10.0;
    }

    public static double roundToHundredths(double number) {
        return Math.floor(number * 100 + 0.5) / 100.0;
    }

    public static double roundToThousandths(double number) {
        return Math.floor(number * 1000 + 0.5) / 1000.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor numérico: ");
        double number = scanner.nextDouble();

        System.out.println("Valor original: " + number);
        System.out.println("Arredondado para inteiro: " + roundToInteger(number));
        System.out.println("Arredondado para décimos: " + roundToTenths(number));
        System.out.println("Arredondado para centésimos: " + roundToHundredths(number));
        System.out.println("Arredondado para milésimos: " + roundToThousandths(number));

        scanner.close();
    }
}