import java.util.ArrayList;

public class Poker {

    private ArrayList<Card> hand1;
    private ArrayList<Card> hand2;

    public Poker(ArrayList<Card> hand1, ArrayList<Card> hand2) {
        this.hand1 = hand1;
        this.hand2 = hand2;
    }

    public void jogar(){
        int hand1 = mao(this.hand1);
        int hand2 = mao(this.hand2);

        System.out.println(maoMaisForte(hand1,hand2));


    }

    private String maoMaisForte(int maoJogador1, int maoJogador2) {
        if (maoJogador1 > maoJogador2) {
            return "Jogador 1 Venceu!";
        } else if (maoJogador2 > maoJogador1) {
            return "Jogador 2 Venceu!";
        } else {
            return "Empate";
        }
    }


    private int mao(ArrayList<Card> hand){
        if (DeckOfCards.temFullHouse(hand)) {
            return 8;
        } else if (DeckOfCards.temStraight(hand)) {
            return 7;
        } else if (DeckOfCards.temFlush(hand)) {
            return 6;
        } else if (DeckOfCards.temQuadra(hand)) {
            return 5;
        } else if (DeckOfCards.temTrinca(hand)) {
            return 4;
        } else if (DeckOfCards.temDoisPares(hand)) {
            return 3;
        } else if (DeckOfCards.temUmPar(hand)) {
            return 2;
        } else {
            return 1;
        }
    }
}
