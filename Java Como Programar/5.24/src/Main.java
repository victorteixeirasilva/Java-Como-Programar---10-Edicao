/*
   5.24 - (Programa de impressão de losangos) Escreva um aplicativo que imprime a seguinte forma de um losango.
   Você pode utilizar instruções de saída que imprimem um único asterisco (*), um único espaço ou um único caractere
   de nova linha. Maximize sua utilização de repetição (com instruções for aninhadas) e minimize o número de instruções
   de saída.

    *

   ***

  *****

 *******

*********

 *******

  *****

   ***

    *
 */
/**
 * @author Victor Teixeira Silva
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {

        for (int b = 1; b <= 2; b++){
            for (int c = 1; c <= 4; c++){
                System.out.print(" ");
            }
            if (b != 2){
                System.out.print("*");
            }
        }

        System.out.println();

        for (int b = 1; b <= 2; b++){
            for (int c = 1; c <= 3; c++){
                System.out.print(" ");
            }
            if (b != 2){
                for (int a = 1; a <= 3; a++){
                    System.out.print("*");
                }
            }
        }

        System.out.println();

        for (int b = 1; b <= 2; b++){
            for (int c = 1; c <= 2; c++){
                System.out.print(" ");
            }
            if (b != 2){
                for (int a = 1; a <= 5; a++){
                    System.out.print("*");
                }
            }
        }

        System.out.println();

        for (int b = 1; b <= 2; b++){
            System.out.print(" ");
            if (b != 2){
                for (int a = 1; a <= 7; a++){
                    System.out.print("*");
                }
            }
        }

        System.out.println();

        for (int a = 1; a <= 9; a++){
            System.out.print("*");
        }

        System.out.println();

        for (int b = 1; b <= 2; b++){
            System.out.print(" ");
            if (b != 2){
                for (int a = 1; a <= 7; a++){
                    System.out.print("*");
                }
            }
        }

        System.out.println();

        for (int b = 1; b <= 2; b++){
            for (int c = 1; c <= 2; c++){
                System.out.print(" ");
            }
            if (b != 2){
                for (int a = 1; a <= 5; a++){
                    System.out.print("*");
                }
            }
        }

        System.out.println();

        for (int b = 1; b <= 2; b++){
            for (int c = 1; c <= 3; c++){
                System.out.print(" ");
            }
            if (b != 2){
                for (int a = 1; a <= 3; a++){
                    System.out.print("*");
                }
            }
        }

        System.out.println();

        for (int b = 1; b <= 2; b++){
            for (int c = 1; c <= 4; c++){
                System.out.print(" ");
            }
            if (b != 2){
                System.out.print("*");
            }
        }
        
    }
}