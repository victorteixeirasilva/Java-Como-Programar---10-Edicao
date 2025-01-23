/*

    (Quadrado de asteriscos) Escreva um aplicativo que solicita ao usuário que insira o tamanho do lado de um quadrado e,
então, exibe um quadrado vazio desse tamanho asteriscos. Seu programa deve trabalhar com quadrados de todos os comprimentos
de lado possíveis entre 1 e 20.



 */

import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tamanho do lado do quadrado entre 1 a 20: ");
        int tamanhoSugerido = scanner.nextInt();
        if (tamanhoSugerido > 20 || tamanhoSugerido < 1){
            System.out.println("Número invalido!");
        }

        int count = 1;
        int countColunas = 1;

        while (countColunas <= tamanhoSugerido) {
            while (count <= tamanhoSugerido ) {
                System.out.print("*  ");
                count++;
            }
            System.out.println();
            count = 1;
            countColunas++;
        }


    }
}