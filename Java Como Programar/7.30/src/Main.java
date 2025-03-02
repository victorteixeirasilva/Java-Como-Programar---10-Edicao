import java.util.ArrayList;
import static java.lang.Integer.parseInt;

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
        System.out.println("TEST");
        System.out.println(testA());
        System.out.println(testB());





    }

    public static boolean testA(){
        DeckOfCards myDeckOfCards = new DeckOfCards();

        ArrayList<Card> hand1 = new ArrayList<>();

        hand1.add(new Card("2", "Espada"));
        hand1.add(new Card("2", "Coração"));
        hand1.add(new Card("6", "Coração"));
        hand1.add(new Card("7", "Espada"));

        ArrayList<Card> hand2 = new ArrayList<>();

        hand2.add(new Card("1", "Espada"));
        hand2.add(new Card("2", "Coração"));
        hand2.add(new Card("6", "Coração"));
        hand2.add(new Card("7", "Espada"));


        boolean testeOk = myDeckOfCards.temUmPar(hand1);
        boolean testeNoOk = myDeckOfCards.temUmPar(hand2);

        if (testeOk && !testeNoOk){
            return true;
        } else {
            return false;
        }
    }

    public static boolean testB(){
        DeckOfCards myDeckOfCards = new DeckOfCards();

        ArrayList<Card> hand1 = new ArrayList<>();

        hand1.add(new Card("2", "Espada"));
        hand1.add(new Card("2", "Coração"));
        hand1.add(new Card("6", "Coração"));
        hand1.add(new Card("6", "Espada"));

        ArrayList<Card> hand2 = new ArrayList<>();

        hand2.add(new Card("1", "Espada"));
        hand2.add(new Card("1", "Coração"));
        hand2.add(new Card("6", "Coração"));
        hand2.add(new Card("7", "Espada"));


        boolean testeOk = myDeckOfCards.temDoisPares(hand1);
        boolean testeNoOk = myDeckOfCards.temDoisPares(hand2);

        if (testeOk && !testeNoOk){
            return true;
        } else {
            return false;
        }
    }
}