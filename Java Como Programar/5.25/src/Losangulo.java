/**
 * @author Victor Teixeria Silva
 * @version 1.0
 *
 * @description
 * *
 * ***
 * *****
 * *******
 * *********
 */
public class Losangulo {
    public static void criarLosangulo(int qtdLinhas) {
        if (qtdLinhas%2==0) {
            System.out.println("Só aceitamos números impares.");
        } else {

            int quantidade1 = 1;
            int linhasDoTriangulo1 = (qtdLinhas-1)/2;
            int espacos1 = linhasDoTriangulo1;

            for (int b = 1; b <= linhasDoTriangulo1; b++){
                for (int c = 1; c <= espacos1; c++){
                    System.out.print(" ");
                }
                espacos1--;
                for (int a = 1; a <= quantidade1; a++){
                    System.out.print("*");
                }
                quantidade1 = quantidade1 + 2;

                System.out.println();
            }

            for (int i = 1; i <= qtdLinhas; i++){
                System.out.print("*");
            }

            int quantidade2 = qtdLinhas-2;
            int espacos2 = 1;
            int linhasDoTriangulo2 = (qtdLinhas-1)/2;

            System.out.println();

            for (int b = 1; b <= linhasDoTriangulo2; b++){
                for (int c = 1; c <= espacos2; c++){
                    System.out.print(" ");
                }
                espacos2++;
                for (int a = 1; a <= quantidade2; a++){
                    System.out.print("*");
                }
                quantidade2 = quantidade2 - 2;

                System.out.println();
            }





        }
    }
}
