/*

    (Palíndromos) Um palíndromo é uma sequência de caracteres que é lida da esqueda para a direita ou da direita para a
esquerda. Por exemplo cada um dos seguintes inteiros de cinco dígitos é um palíndromo: 12321, 55555, 45554 e 11611.
Escreva um aplicativo que lê em um inteiro de cinco dígitos se ele é ou não um palíndromo. Se o número não for de cinco
dígitos, exiba uma mensagem de erro e permita que o usuário insira um novo valor.

 */

import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.println("Informe uma squencia de 5 caracteres e vamos informar se é ou não um Palíndromo:");
    String carcteres = scanner.nextLine();
    if (carcteres.length() != 5){
        System.out.println("Sequencia Invalida! (menor ou maior que 5 caracteres!)");
    }
    StringBuilder sb = new StringBuilder(carcteres);
    sb.reverse();

    if (sb.toString().equals(carcteres)){
        System.out.println("Sequencia é um Palíndromo!");
    } else {
        System.out.println("Sequencia não é um Palíndromo!");
    }


    }
}