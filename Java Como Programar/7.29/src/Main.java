/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description
 * ### 7.29 - (Série de Fibonacci) A série de Fibonacci
 *
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, …
 *
 * ### inicia-se com os termos 0 e 1 e tem a propriedade de cada termo sucessivo é a soma dos dois termos precedentes.
 *
 * A) Escreva um método fibonacci(n) que calcule o enésimo número de Fibonacci. Incorpore esse método a um aplicativo que permita ao usuário inserir o valor de n.
 *
 * B) Determine o maior número de Fibonacci que pode ser exibido em seu sistema.
 *
 * C) Modifique o aplicativo que você escreveu na parte (a) para utilizar double em vez de int para calcular e retornar números de Fibonacci e utilizar esse aplicativo modificado para repetir a parte (b).
 */
public class Main {
    public static void main(String[] args) {
        double a = 0, b = 1;
        System.out.println("Sequência de Fibonacci (usando double):");
        System.out.println(a);
        System.out.println(b);

        while (true) {
            double next = a + b;
            if (Double.isInfinite(next)) { // Checar limite de double
                System.out.println("O maior número de Fibonacci que pode ser representado em double é: " + b);
                break;
            }
            System.out.println(next);
            a = b;
            b = next;
        }
    }
}