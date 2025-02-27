/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 7.27 - (Crivo de Eratóstenes) Um número primo é qualquer número inteiro maior que 1, que é uniformemente
 *              divisível apenas por ele mesmo e por 1. O Crivo de Eratóstenes é um método para encontrar números primos.
 *              Ele opera como segue:
 *
 *              A) Crie um array boolean de tipo primitivo com todos os elementos inicializados como true. Os elementos
 *              do array com índices primos permanecerão true. Todos os outros elementos do array por fim são
 *              configurados como false.
 *
 *              B) Iniciando com o índice de array 2, determine se um dado elemento é true. Se for, faça um loop pelo
 *              restante do array e configure como false cada elemento cujo índice é um múltiplo do índice com valor
 *              true. Então, continue o processo com o próximo elemento com valor true. Para o ínfice de array 2, todos
 *              os elementos além do elemento 2 no array que tiverem índices que são múltiplos de 2 (índices 4, 6, 8 10
 *              etc.) serão configurados como false; para índice de array 3, todos os elementos além do 3 no array que
 *              tiverem índices que são múltiplos de 3 (índices 6, 9, 12, 15 etc.) serão configurados como false, e
 *              assim por diante.
 *
 *              Quando esse processo for concluído, os elementos de array que ainda forem true indicam que o índice é um
 *              número primo. Esses índices podem ser exibidos. Escreva um aplicativo que utiliza um array de 1.000
 *              elementos para determinar e exibir os números primos entre 2 e 999. Ignore elementos de array 0 e 1.
 */
public class Main {
    public static void main(String[] args) {
        int n = 999;
        boolean[] primos = new boolean[n + 1];

        // Inicializa o array com true
        for (int i = 2; i <= n; i++) {
            primos[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            // Se primos[p] é true, então é um número primo
            if (primos[p]) {
                // Configura todos os múltiplos de p como false
                for (int i = p * p; i <= n; i += p) {
                    primos[i] = false;
                }
            }
        }

        // Exibe todos os números primos
        for (int p = 2; p <= n; p++) {
            if (primos[p]) {
                System.out.println(p);
            }
        }


    }
}