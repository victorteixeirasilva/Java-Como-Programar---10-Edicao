import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 6.9 - (Arredondamento números) Math.floor pode ser utilizado para arredondar valores ao número inteiro
 *              mais próximo - por exemplo,
 *              y = Math.floor(x + 0.5);
 *              arredondará o número x para o inteiro mais próximo e atribuirá o resultado a y. Escreva um aplicativo
 *              que lê valores double e utiliza a instrução anterior para arredondar cada um dos números para o inteiro
 *              mais próximo. Para  cada número processado, exiba ambos os números, o original e o arredondado.
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número tipo double que será arredondado: ");
        double valorASerArredondado = scanner.nextDouble();

        double valorArredondado = Math.floor(valorASerArredondado + 0.5);

        System.out.println("O valor original informado é (" + valorASerArredondado + "), e o valor arredondado é: " + valorArredondado);

    }
}