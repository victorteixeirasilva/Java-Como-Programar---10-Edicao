/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 5.26 - Uma crítica à instrução break e à instrução continue é que cada uma é desestruturada. Na verdade,
 * essas instruções sempre podem ser substituídas por instruções estruturadas, embora fazer isso possa ser difícil.
 * Descreva de maneira geral como você removeria qualquer instrução break de um loop em um programa e a substituiria
 * por alguma equivalente estruturada. [Dica: a instrução break sai de um loop do corpo do loop. A outra maneira de
 * sair de um loop é falhando no teste de continuação do loop. Considere a possibilidade de utilizar no teste de
 * continuação do loop um segundo teste que indica “saída prévia por causa de uma condição “break”.]. Utilize a técnica
 * que você desenvolve aqui para remover a instrução break do aplicativo na figura 5.13.
 */
public class Main {
    public static void main(String[] args) {
        int count = 1; // Variável de controle também utilizada depois que o loop termina
        int sentinela = 0;

        while ((count <= 10) && (sentinela == 0)) { // Faz o loop 10 vezes
            if (count == 5) {
                sentinela = -1;
            }
            System.out.println(count);
            count++;
        }
        System.out.printf("%nBroke out of loop at count = %d%n", count);
    }
}