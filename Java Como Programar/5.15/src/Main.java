/*
    5.15 - (Programa para impressão de triângulos) Escreva um aplicativo que exibe os seguintes padrões separadamente,
    um embaixo do outro. Utilize loops for para gerar os padrões. todos os asteriscos (*) devem ser impressos por uma
    única instrução sa forma System.out.print(’*’); o que faz com que os asteriscos sejam impressos lado a lado. uma
    instrução na forma System.out.println(); pode ser utilizada para mover-se para a próxima linha. Uma instrução na
    forma System.out.print(’ ‘); pode ser utilizada para exibir um espaço para os últimos dois padrões. Não deve haver
    outras instruções de saída no programa. [Dica: os dois últimos padrões requerem que cada linha inicie com um número
    adequado de espaços em branco.]*

(a)

*

**

***

****

*****

******

*******

********

*********

**********

(b)

**********

*********

********

*******

******

*****

****

***

**

(c)

**********

 *********

  ********

   *******

    ******

     *****

      ****

       ***

        **

(d)

          *

         **

        ***

       ****

      *****

     ******

    *******

   ********

  *********

 **********
 */
/**
 * @author Victor Teixeira Silva
 * @version 1.0
  */
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            for (int c = 1; c <= i; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 10; i++){
            for (int c = 10; c >= i; c--) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 10; i >= 1; i--){
            if (i == 10){
                for (int c = 10; c >= i; c--) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int d = 10; d >= i; d--){
                    System.out.print(" ");
                }
                for (int c = 1; c <= i; c++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }

        for (int i = 10; i >= 1; i--){
            if (i == 10){
                for (int c = 10; c >= i; c--) {
                    System.out.print("          *");
                }
                System.out.println();
            } else {
                for (int d = 1; d <= i; d++){
                    System.out.print(" ");
                }
                for (int c = 10; c >= i; c--) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }



    }
}