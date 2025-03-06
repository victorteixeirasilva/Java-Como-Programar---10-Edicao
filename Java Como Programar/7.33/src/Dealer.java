import java.util.ArrayList;


public class Dealer {

    private final int QUANTIDADE_CARTAS_POR_MAO = 5;
    private DeckOfCards myDeckOfCards;
    private static ArrayList<Card> hand;
    private static ArrayList<Card> cartasParaSubstituir = new ArrayList<>();
    private Poker poker = new Poker(hand);

    public Dealer(DeckOfCards myDeckOfCards) {
        this.myDeckOfCards = myDeckOfCards;
    }

    public Dealer() {
    }

    public DeckOfCards getMyDeckOfCards() {
        return myDeckOfCards;
    }

    public void setMyDeckOfCards(DeckOfCards myDeckOfCards) {
        this.myDeckOfCards = myDeckOfCards;
    }

    public void distributeHand(){
        System.out.println("Distribuindo mão inicial...");

        myDeckOfCards.shuffle();

        hand = myDeckOfCards.distribuirCartas(QUANTIDADE_CARTAS_POR_MAO);

    }


    public void evaluateHand(ArrayList<Card> hand) {
        System.out.println("Avaliando qualidade da mão...");

        switch (poker.mao(hand)) {
            case "Full House", "Straight", "Flush":
                break;
            case "Quadra":
                Card cardParaSubstituir = quadra(hand);
                cartasParaSubstituir.add(cardParaSubstituir);
                replaceUnnecessaryCards(cartasParaSubstituir, hand);
                break;
            case "Trinca":

                trinca(hand);

                replaceUnnecessaryCards(cartasParaSubstituir, hand);
                break;
            case "Dois Pares":

                doisPares(hand);

                replaceUnnecessaryCards(cartasParaSubstituir, hand);
                break;
            case "Par":

                temUmPar(hand);

                replaceUnnecessaryCards(cartasParaSubstituir, hand);
                break;

        }

    }

    private void replaceUnnecessaryCards(ArrayList<Card> cartasParaSubstituir, ArrayList<Card> hand) {
        System.out.println("Substituindo cartas desnecessárias...");

        int contadorDeCartasRemovidas = 0;
        for (Card cartaParaSubstituir : cartasParaSubstituir){

            for (int i = 0; i < hand.size(); i++){
                if (hand.get(i)==cartaParaSubstituir){
                    hand.remove(i);
                    contadorDeCartasRemovidas++;
                }
            }
        }

        ArrayList<Card> novasCartas = myDeckOfCards.distribuirCartas(contadorDeCartasRemovidas);

        hand.addAll(novasCartas);

    }

    public void showHand(ArrayList<Card> hand) {
        System.out.println("Exibindo a mão final...");

        for (Card card:hand){
            System.out.println();
            switch (card.getFace()) {
                case "11":
                    System.out.print(hand.indexOf(card) + " - Face: J");
                    break;
                case "12":
                    System.out.print(hand.indexOf(card) + " - Face: Q");
                    break;
                case "13":
                    System.out.print(hand.indexOf(card) + " - Face: K");
                    break;
                default:
                    System.out.print(hand.indexOf(card) + " - Face: " + card.getFace());
            }
            System.out.print(" Suit: " + card.getSuit());
            System.out.println();

        }
            System.out.println(poker.mao(hand));
    }

    public static void temUmPar(ArrayList<Card> hand){
        for (int a = 0; a < hand.size(); a++){
            Card card = hand.get(a);
            for (int b = 0; b < hand.size(); b++){
                Card card2 = hand.get(b);
                if (a != b){
                    if (card.getFace().equals(card2.getFace())){
                        for (int c = 0; c < hand.size(); c++) {
                            Card card3 = hand.get(c);

                            if (card3 != card && card3 != card2) {
                                for (int d = 0; d < hand.size(); d++){
                                    Card card4 = hand.get(d);

                                    if (card4 != card3 && card4 != card2 && card4 != card) {
                                        for (int e = 0; e < hand.size(); e++){
                                            Card card5 = hand.get(e);

                                            if (
                                                    card5 != card4 &&
                                                    card5 != card3 &&
                                                    card5 != card2 &&
                                                    card5 != card
                                            ) {
                                                cartasParaSubstituir.add(card3);
                                                cartasParaSubstituir.add(card4);
                                                cartasParaSubstituir.add(card5);
                                            }
                                        }

                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void doisPares(ArrayList<Card> hand){
        int quantidadeDePares = 0;
        int idexCard1Par1 = -1;
        int idexCard2Par1 = -1;
        int idexCard1Par2 = -1;
        int idexCard2Par2 = -1;

        for (int i = 0; i < hand.size(); i++){
            Card card = hand.get(i);
            for (int b = 0; b < hand.size(); b++){
                Card card2 = hand.get(b);
                if (i != b){
                    if (card.getFace().equals(card2.getFace())){
                        if (idexCard1Par1 == -1){
                            idexCard1Par1 = i;
                            idexCard2Par1 = b;
                            quantidadeDePares++;
                        } else {
                            if (idexCard1Par1 != b && idexCard2Par1 != i){
                                if (idexCard1Par2 == -1){
                                    idexCard1Par2 = i;
                                    idexCard2Par2 = b;
                                    quantidadeDePares++;

                                    for (int c = 0; c < hand.size(); c++){
                                        if (c != idexCard1Par1 && c != idexCard2Par1 && c != idexCard1Par2 && c != idexCard2Par2) {
                                            cartasParaSubstituir.add(hand.get(c));
                                        }
                                    }

                                }

                            }
                        }
                    }
                }
            }
        }
    }

    public static void trinca(ArrayList<Card> hand){

        for (int i = 0; i < hand.size(); i++){
            Card card = hand.get(i);

            for (int x = 0; x < hand.size(); x++){
                Card card1 = hand.get(x);

                if (i != x){
                    for (int a = 0; a < hand.size(); a++){
                        Card card2 = hand.get(a);
                        if (
                                i != a &&
                                        a != x
                        ){
                            if (
                                    card.getFace().equals(card1.getFace()) &&
                                            card.getFace().equals(card2.getFace())
                            ){
                               for (int b = 0; b < hand.size(); b++){
                                   Card card3 = hand.get(b);

                                   if (card3 != card2 && card3 != card1 && card3 != card){

                                       for (int c = 0; b < hand.size(); b++){
                                           Card card4 = hand.get(c);

                                           if (card4 != card3 && card4 != card2 && card4 != card1 && card4 != card) {
                                               cartasParaSubstituir.add(card4);
                                               cartasParaSubstituir.add(card3);
                                           }
                                       }
                                   }
                               }
                            }

                        }


                    }


                }

            }

        }

    }

    public static Card quadra(ArrayList<Card> hand){

        for (int i = 0; i < hand.size(); i++){
            Card card = hand.get(i);

            for (int x = 0; x < hand.size(); x++){
                Card card1 = hand.get(x);

                if (i != x){
                    for (int a = 0; a < hand.size(); a++){
                        Card card2 = hand.get(a);
                        if (
                                i != a &&
                                        a != x
                        ){
                            for (int b = 0; b < hand.size(); b++){
                                Card card3 = hand.get(b);

                                for (int c = 0; c < hand.size(); b++) {
                                    Card card4 = hand.get(c);

                                    if (
                                            b != i &&
                                            b != x &&
                                            b != a
                                    ){
                                        if (
                                                card.getFace().equals(card1.getFace()) &&
                                                card.getFace().equals(card2.getFace()) &&
                                                card.getFace().equals(card3.getFace()) &&
                                                !card.getFace().equals(card4.getFace())
                                        ){

                                            return card4;
                                        }

                                    }
                                }


                            }

                        }


                    }


                }

            }

        }

        return null;
    }


}
