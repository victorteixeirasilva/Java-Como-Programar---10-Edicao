/*
    (Padrão de tabuleiro de damas de asteriscos) Escreva um aplicativo que utiliza apenas as instruções de saída
    System.out.print("* ");
    System.out.print(" ");
    System.out.println();

    Para exibir o padrão de tabuleiro de damas a seguir. Uma chamada de método System.out.println sem argumentos faz com
que o programa gere saída de um único caractere de nova linha. [Dica: as instruções de repetição são requeridas.]

    * * * * * * * *
     * * * * * * * *
    * * * * * * * *
     * * * * * * * *
    * * * * * * * *
     * * * * * * * *
    * * * * * * * *
     * * * * * * * *

 */
/**
 * @author Victor Teixeira Silva
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++){
            for (int a = 1; a <= 8; a++) {
                System.out.print("* ");
            }
            System.out.println();
            for (int b = 1; b <= 8; b++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}