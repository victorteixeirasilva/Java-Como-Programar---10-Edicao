/*
    (Localize o maior número) O processo de localizar o maior valor é muito utilizado em aplicativos de computador. Por
exemplo, um programa que determina o vencedor de uma competição de vendas inseriria o número de unidades vendidas por
cada vendedor. O vendedor que vende mais unidades ganha a competição. Escreva um programa em pseudocódigo e, então um
aplicativo Java que aceita a entrada de uma série de 10 inteiros e determina e imprime o maior dos inteiros. Seu programa
deve utilizar pelo menos as três variáveis a seguir:
        a) counter: um contador para contar até 10 (isto é, monitorar quantos números foram inseridos e determinar quando
todos os 10 números foram processados).
        b) number: o inteiro mais recentemente inserido pelo usuário.
        c) largest: 0 maior número encontrado até agora

Anotações:

    Sistema inicia as vaiaveis de contador, ultimo número e número mais alto

    Repita 10 vezes
        sistema recebe o número
        sistema verifica se esse novo número é maior que o número mais alto
            se for ele toma o lugar do número mais alto
        se não ele toma o lugar do último número
    Fim Repita

    Sistema informa o número mais alto entre os 10



 */

import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int number = 0;
        int largest = 0;

        while (counter <= 10) {
            System.out.println("Informe um número:");
            number = scanner.nextInt();

            if (number > largest) {
                largest = number;
            }

            counter++;
        }

        System.out.println("O maior número é: "+largest);


    }
}