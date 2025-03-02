import java.util.ArrayList;

public class TestTDD {

    //A) um par
    public static boolean testA(){
        DeckOfCards myDeckOfCards = new DeckOfCards();

        ArrayList<Card> hand1 = new ArrayList<>();

        hand1.add(new Card("2", "Espada"));
        hand1.add(new Card("2", "Coração"));
        hand1.add(new Card("6", "Coração"));
        hand1.add(new Card("7", "Espada"));
        hand1.add(new Card("8", "Espada"));

        ArrayList<Card> hand2 = new ArrayList<>();

        hand2.add(new Card("1", "Espada"));
        hand2.add(new Card("2", "Coração"));
        hand2.add(new Card("6", "Coração"));
        hand2.add(new Card("7", "Espada"));
        hand2.add(new Card("9", "Espada"));


        boolean testeOk = myDeckOfCards.temUmPar(hand1);
        boolean testeNoOk = myDeckOfCards.temUmPar(hand2);

        if (testeOk && !testeNoOk){
            return true;
        } else {
            return false;
        }
    }

    //B) dois pares
    public static boolean testB(){
        DeckOfCards myDeckOfCards = new DeckOfCards();

        ArrayList<Card> hand1 = new ArrayList<>();

        hand1.add(new Card("2", "Espada"));
        hand1.add(new Card("2", "Coração"));
        hand1.add(new Card("6", "Coração"));
        hand1.add(new Card("6", "Espada"));
        hand1.add(new Card("8", "Espada"));

        ArrayList<Card> hand2 = new ArrayList<>();

        hand2.add(new Card("1", "Espada"));
        hand2.add(new Card("1", "Coração"));
        hand2.add(new Card("6", "Coração"));
        hand2.add(new Card("7", "Espada"));
        hand2.add(new Card("8", "Espada"));


        boolean testeOk = myDeckOfCards.temDoisPares(hand1);
        boolean testeNoOk = myDeckOfCards.temDoisPares(hand2);

        if (testeOk && !testeNoOk){
            return true;
        } else {
            return false;
        }
    }

    //C) trica (por exemplo, três valetes)
    public static boolean testC(){
        DeckOfCards myDeckOfCards = new DeckOfCards();

        ArrayList<Card> hand1 = new ArrayList<>();

        hand1.add(new Card("2", "Espada"));
        hand1.add(new Card("2", "Coração"));
        hand1.add(new Card("2", "Diamante"));
        hand1.add(new Card("6", "Espada"));
        hand1.add(new Card("7", "Espada"));

        ArrayList<Card> hand2 = new ArrayList<>();

        hand2.add(new Card("1", "Espada"));
        hand2.add(new Card("1", "Coração"));
        hand2.add(new Card("6", "Coração"));
        hand2.add(new Card("7", "Espada"));
        hand2.add(new Card("8", "Espada"));


        boolean testeOk = myDeckOfCards.temTrinca(hand1);
        boolean testeNoOk = myDeckOfCards.temTrinca(hand2);

        if (testeOk && !testeNoOk){
            return true;
        } else {
            return false;
        }
    }

    //D) quadra (por exemplo, quatro ases)
    public static boolean testD(){
        DeckOfCards myDeckOfCards = new DeckOfCards();

        ArrayList<Card> hand1 = new ArrayList<>();

        hand1.add(new Card("2", "Espada"));
        hand1.add(new Card("2", "Coração"));
        hand1.add(new Card("2", "Diamante"));
        hand1.add(new Card("2", "Paus"));
        hand1.add(new Card("7", "Espada"));

        ArrayList<Card> hand2 = new ArrayList<>();

        hand2.add(new Card("1", "Espada"));
        hand2.add(new Card("1", "Coração"));
        hand2.add(new Card("6", "Coração"));
        hand2.add(new Card("7", "Espada"));
        hand2.add(new Card("8", "Espada"));


        boolean testeOk = myDeckOfCards.temQuadra(hand1);
        boolean testeNoOk = myDeckOfCards.temQuadra(hand2);

        if (testeOk && !testeNoOk){
            return true;
        } else {
            return false;
        }
    }

    //E) flush (isto é, cinco cartas do mesmo naipe)
    public static boolean testE(){
        DeckOfCards myDeckOfCards = new DeckOfCards();

        ArrayList<Card> hand1 = new ArrayList<>();

        hand1.add(new Card("1", "Espada"));
        hand1.add(new Card("2", "Espada"));
        hand1.add(new Card("3", "Espada"));
        hand1.add(new Card("4", "Espada"));
        hand1.add(new Card("5", "Espada"));

        ArrayList<Card> hand2 = new ArrayList<>();

        hand2.add(new Card("1", "Espada"));
        hand2.add(new Card("1", "Coração"));
        hand2.add(new Card("6", "Coração"));
        hand2.add(new Card("7", "Espada"));
        hand2.add(new Card("8", "Espada"));


        boolean testeOk = myDeckOfCards.temFlush(hand1);
        boolean testeNoOk = myDeckOfCards.temFlush(hand2);

        if (testeOk && !testeNoOk){
            return true;
        } else {
            return false;
        }
    }

    //F) straight (isto é, cinco cartas de valores consecutivos)
    public static boolean testF(){
        DeckOfCards myDeckOfCards = new DeckOfCards();

        ArrayList<Card> hand1 = new ArrayList<>();

        hand1.add(new Card("1", "Espada"));
        hand1.add(new Card("2", "Coração"));
        hand1.add(new Card("3", "Ouro"));
        hand1.add(new Card("4", "Paus"));
        hand1.add(new Card("5", "Espada"));

        ArrayList<Card> hand2 = new ArrayList<>();

        hand2.add(new Card("1", "Espada"));
        hand2.add(new Card("1", "Coração"));
        hand2.add(new Card("6", "Coração"));
        hand2.add(new Card("7", "Espada"));
        hand2.add(new Card("8", "Espada"));


        boolean testeOk = myDeckOfCards.temStraight(hand1);
        boolean testeNoOk = myDeckOfCards.temStraight(hand2);

        if (testeOk && !testeNoOk){
            return true;
        } else {
            return false;
        }
    }

    //G) full house (isto é, duas cartas de um valor e três cartas de outro valor)
    public static boolean testG(){
        DeckOfCards myDeckOfCards = new DeckOfCards();

        ArrayList<Card> hand1 = new ArrayList<>();

        hand1.add(new Card("1", "Espada"));
        hand1.add(new Card("1", "Coração"));
        hand1.add(new Card("2", "Ouro"));
        hand1.add(new Card("2", "Paus"));
        hand1.add(new Card("2", "Espada"));

        ArrayList<Card> hand2 = new ArrayList<>();

        hand2.add(new Card("1", "Espada"));
        hand2.add(new Card("1", "Coração"));
        hand2.add(new Card("6", "Coração"));
        hand2.add(new Card("7", "Espada"));
        hand2.add(new Card("8", "Espada"));


        boolean testeOk = myDeckOfCards.temFullHouse(hand1);
        boolean testeNoOk = myDeckOfCards.temFullHouse(hand2);

        if (testeOk && !testeNoOk){
            return true;
        } else {
            return false;
        }
    }

}
