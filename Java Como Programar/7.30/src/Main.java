

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 7.30 - (Embaralhamento e distribuição) Modifique o aplicativo da Figura 7.11 para distribuir uma mão de
 * cinco cartas de pôrquer. Então, modifique a classe DeckOfCards da Figura 7.10 para incluir métodos que determinam se
 * uma mão contém
 *
 * A) um par
 *
 * B) dois pares
 *
 * C) trica (por exemplo, três valetes)
 *
 * D) quadra (por exemplo, quatro ases)
 *
 * E) flush (isto é, cinco cartas do mesmo naipe)
 *
 * F) straight (isto é, cinco cartas de valores consecutivos)
 *
 * G) full house (isto é, duas cartas de um valor e três cartas de outro valor)
 *
 * [Dica: adicione os métodos getFace e getSuit à classe Card da Figura 7.9.]
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





    }




}