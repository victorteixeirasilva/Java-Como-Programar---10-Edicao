import java.util.ArrayList;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 7.32 - (Projeto: embaralhamento e distribuição de cartas ) Modifique o aplicativo desenvolvido
 *              na Questão 7.31 para que ele possa simular o carteador. A mão de cinco cartas do carteador é
 *              distribuída “no escuro” para que o jogador não possa vê-la. O programa deve então avaliar a mão
 *              do carteador e, com base na qualidade da mão, o carteador deve distribuir uma, duas ou três
 *              cartas para substituir o número correspondente de cartas desnecessárias na mão original. O
 *              aplicativo deve então reavaliar a mão do carteador. [Atenção: esse é um problema difícil!]
 *
 *              1. Início
 *                  O programa é iniciado.
 *              2. Distribuir mão inicial (5 cartas)
 *                  Gere aleatoriamente uma mão de 5 cartas para o carteador (no escuro).
 *              3. Avaliar qualidade da mão
 *                  Determine a força da mão (por exemplo, um par, dois pares, trinca, etc.).
 *              4. Determinar cartas desnecessárias
 *                  Com base na avaliação, identifique de 1 a 3 cartas que podem ser descartadas (se necessário).
 *              5. Substituir as cartas descartadas
 *                  Substitua as cartas descartadas por novas cartas do baralho.
 *              6. Reavaliar qualidade da mão
 *                  Analise novamente a qualidade da mão após a substituição.
 *              7. Exibir resultado final
 *                  Mostre a mão final do carteador e sua classificação (ex.: dois pares, full house, etc.).
 *              8. Fim
 *
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("BATERIA DE TESTES");
        System.out.println("Teste para determinar se a função (A) esstá correta que determina se a mão tem um par (True para funcionando corretamente e False se estiver falhando) " + TestTDD.testA());
        System.out.println("Teste para determinar se a função (B) esstá correta que determina se a mão tem dois pares (True para funcionando corretamente e False se estiver falhando) " + TestTDD.testB());
        System.out.println("Teste para determinar se a função (C) esstá correta que determina se a mão tem uma trinca (True para funcionando corretamente e False se estiver falhando) " + TestTDD.testC());
        System.out.println("Teste para determinar se a função (D) esstá correta que determina se a mão tem uma quadra (True para funcionando corretamente e False se estiver falhando) " + TestTDD.testD());
        System.out.println("Teste para determinar se a função (E) esstá correta que determina se a mão é um flush (True para funcionando corretamente e False se estiver falhando) " + TestTDD.testE());
        System.out.println("Teste para determinar se a função (F) esstá correta que determina se a mão é um Straight (True para funcionando corretamente e False se estiver falhando) " + TestTDD.testF());
        System.out.println("Teste para determinar se a função (G) esstá correta que determina se a mão é um Full House (True para funcionando corretamente e False se estiver falhando) " + TestTDD.testG());

        System.out.println();
        System.out.println("*** 7.32 ***");
        System.out.println();

        DeckOfCards myDeckOfCards = new DeckOfCards();

        Dealer dealer = new Dealer(myDeckOfCards);

        dealer.distributeHand();

        dealer.evaluateHand();

        dealer.showHand();

    }




}