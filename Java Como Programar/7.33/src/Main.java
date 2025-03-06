import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 7.33 - (Projeto: embaralhamento e distribuição de cartas) Modifique o aplicativo desenvolvido na Questão
 *              7.32 para que ele possa tratar a mão do carteado automaticamente, mas o jogador tenha permissão de
 *              decidir que cartas ele quer substituir. O aplicativo deve então avaliar ambas as mãos e determinar quem
 *              ganha. Agora utilize esse novo aplicativo para disputar 20 jogos contra o computador. Quem ganha mais
 *              jogos: Com base nos resultados desses jogos, refine seu aplicativo de pôquer. (Esse também é um problema
 *              difícil.) Dispute mais 20 Jogos. Se aplicativo modificado joga melhor?
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
        System.out.println("*** 7.33 ***");
        System.out.println();

        DeckOfCards myDeckOfCards = new DeckOfCards();
        Dealer dealer = new Dealer(myDeckOfCards);
        Scanner scanner = new Scanner(System.in);

        myDeckOfCards.shuffle();

        var maoBot = myDeckOfCards.distribuirCartas(5);
        var maoJogador = myDeckOfCards.distribuirCartas(5);

        dealer.evaluateHand(maoBot);

        System.out.println();
        System.out.println("*** Essa é a sua mão ***");
        dealer.showHand(maoJogador);

        System.out.println("Deseja substituir alguma carta? ( 1 - para sim )");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.println("Quantas cartas deseja substituir?");
            int quantidadeDeCartasParaSubstituir = scanner.nextInt();

            if (quantidadeDeCartasParaSubstituir < 5) {
                for (int i = 1; i <= quantidadeDeCartasParaSubstituir; i++){
                    System.out.println("Informe o número da carta que deseja substituir:");
                    int carta = scanner.nextInt();

                    maoJogador.remove(carta);

                    System.out.println("Informe o número da próxima carta");
                    dealer.showHand(maoJogador);
                }

                ArrayList<Card> novasCartas = myDeckOfCards.distribuirCartas(quantidadeDeCartasParaSubstituir);
                maoJogador.addAll(novasCartas);
            } else {
                maoJogador = myDeckOfCards.distribuirCartas(5);
            }

        }


        System.out.println();
        System.out.println("*** Mão do Jogador ***");
        dealer.showHand(maoJogador);


        System.out.println();
        System.out.println("*** Mão do computador ***");
        dealer.showHand(maoBot);

        Poker poker = new Poker(maoJogador, maoBot);
        poker.jogar();



    }




}