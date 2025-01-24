/*
    (Lados de um triângulo direito) Escreva um aplicativo que lê três inteiros diferentes de zero, determina e imprime
se eles poderiam representar os lados de um triângulo direito.
 */

import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro lado: ");
        double ladoA = scanner.nextDouble();

        System.out.print("Digite o segundo lado: ");
        double ladoB = scanner.nextDouble();

        System.out.print("Digite o terceiro lado: ");
        double ladoC = scanner.nextDouble();

        // Assumimos que c é a hipotenusa (o maior lado)
        double hipotenusa = Math.max(Math.max(ladoA, ladoB), ladoC);
        double cateto1 = Math.min(ladoA, ladoB);
        double cateto2 = (ladoA + ladoB + ladoC) - hipotenusa - cateto1;

        // Aplicando o Teorema de Pitágoras
        if (Math.pow(hipotenusa, 2) == Math.pow(cateto1, 2) + Math.pow(cateto2, 2)) {
            System.out.println("Os lados formam um triângulo retângulo.");
        } else {
            System.out.println("Os lados não formam um triângulo retângulo.");
        }

    }
}