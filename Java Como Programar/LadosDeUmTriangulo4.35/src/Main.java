/*
    (Lados de um triângulo) Escreva um aplicativo que lê três valores diferentes de zero inseridos pelo usuário, determina
e imprime se eles poderiam representar os lados de um triângulo.



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

        if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA) {
            System.out.println("Os valores formam um triângulo. (Lado A: "+ladoA+", Lado B: "+ladoB+", Lado C: "+ladoC+")");
        } else {
            System.out.println("Os valores não formam um triângulo. (Lado A: "+ladoA+", Lado B: "+ladoB+", Lado C: "+ladoC+")");
        }

    }
}