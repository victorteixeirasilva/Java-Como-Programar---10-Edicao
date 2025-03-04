import java.util.ArrayList;

public class Poker {

    private ArrayList<Card> hand1;
    private ArrayList<Card> hand2;

    public Poker(ArrayList<Card> hand1, ArrayList<Card> hand2) {
        this.hand1 = hand1;
        this.hand2 = hand2;
    }

    public Poker(ArrayList<Card>  hand){
        this.hand1 = hand;
    }

    public void jogar(){
        int hand1 = maoPoder(mao(this.hand1));
        int hand2 = maoPoder(mao(this.hand2));

        System.out.println(maoMaisForte(hand1,hand2));


    }

    public String maoMaisForte(int maoJogador1, int maoJogador2) {
        if (maoJogador1 > maoJogador2) {
            return "Jogador 1 Venceu!";
        } else if (maoJogador2 > maoJogador1) {
            return "Jogador 2 Venceu!";
        } else {
            return "Empate";
        }
    }


    public int maoPoder(String mao){
        return switch (mao) {
            case "Full House" -> 8;
            case "Straight" -> 7;
            case "Flush" -> 6;
            case "Quadra" -> 5;
            case "Trinca" -> 4;
            case "Dois Pares" -> 3;
            case "Par" -> 2;
            default -> 1;
        };
    }

    public String mao(ArrayList<Card> hand){
        if (DeckOfCards.temFullHouse(hand)) {
            return "Full House";
        } else if (DeckOfCards.temStraight(hand)) {
            return "Straight";
        } else if (DeckOfCards.temFlush(hand)) {
            return "Flush";
        } else if (DeckOfCards.temQuadra(hand)) {
            return "Quadra";
        } else if (DeckOfCards.temTrinca(hand)) {
            return "Trinca";
        } else if (DeckOfCards.temDoisPares(hand)) {
            return "Dois Pares";
        } else if (DeckOfCards.temUmPar(hand)) {
            return "Par";
        } else {
            return "Fraca";
        }
    }
}
