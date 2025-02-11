import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 6.14 - (Exponenciação) Escreva um método integerPower(base, exponent) que retorne o valor de base^expoente.
 *              Por exemplo, integerPower(3, 4) calcula 3^4 (ou 3 * 3 *3 *3). Suponha que exponente seja um inteiro não
 *              zero, positivo, e base, um inteiro. Use uma instrução for ou while para controlar o cálculo. Não utilize
 *              métodos da classe Math. Incorpore esse método a um aplicativo que lê os valores inteiros para base e
 *              exponent e realiza o cálculo com o método integerPower.
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor da base: ");
        int base = scanner.nextInt();

        System.out.print("Informe o valor do expoente: ");
        int expoente = scanner.nextInt();

        System.out.println(integerPower(base, expoente));

    }
    public static int integerPower(int base, int expoente){

        int resultado = base;

        for (int i = 1; i < expoente; i++){
            resultado *= base;
        }

        return resultado;
    }
}