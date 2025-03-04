import java.util.ArrayList;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 7.31 - (Embaralhamento e distribuição de carta) Utilize os métodos desenvolvidos na Questão 7.30 para
 *              escrever um aplicativo que distribui duas mãos de pôquer de cinco cartas, avalia cada mão e determina
 *              qual é a melhor.
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

        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle();

        ArrayList<Card> hand1 = myDeckOfCards.distribuirCartas(5);
        ArrayList<Card> hand2 = myDeckOfCards.distribuirCartas(5);

        Poker jogo = new Poker(hand1, hand2);

        jogo.jogar();


    }




}