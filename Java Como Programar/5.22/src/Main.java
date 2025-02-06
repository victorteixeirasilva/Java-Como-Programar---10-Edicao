/*
    5.22 - (Programa de impressão de triângulo modificado) Modifique a Questão 5.15 para combinar seu código dos quatro
    triângulos de asteriscos separados, de modo que todos os quatro padrões sejam impressos lado a lado. [Dica: faça
    uso inteligente de loops for aninhados.]
 */

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        int size = 10; // Tamanho do triângulo

        for (int i = 1; i <= size; i++) {
            // Triângulo 1 (superior esquerdo)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("  "); // Espaço entre os triângulos

            // Triângulo 2 (superior direito)
            for (int j = size; j >= i; j--) {
                System.out.print("*");
            }
            System.out.print("  "); // Espaço entre os triângulos

            // Triângulo 3 (inferior esquerdo)
            for (int j = size; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("  "); // Espaço entre os triângulos

            // Triângulo 4 (inferior direito)
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = size; j >= i; j--) {
                System.out.print("*");
            }

            System.out.println(); // Nova linha
        }
    }
}