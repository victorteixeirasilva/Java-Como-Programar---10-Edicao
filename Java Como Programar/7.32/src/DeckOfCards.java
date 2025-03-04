import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 */
public class DeckOfCards {

    private Card[] deck; // array de objetos Card
    private int currentCard; // índice da próxima Card a ser distribuída (0-51)
    private static final int NUMBER_OF_CARDS = 52; // número constante de Cards
    // gerador de número aleatório
    private static final SecureRandom randomNumbers = new SecureRandom();

    // construtor preenche baralho de cartas
    public DeckOfCards() {

        String[] faces = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13" };
        String[] suits = { "Coração", "Ouro", "Paus", "Espada" };
        deck = new Card[NUMBER_OF_CARDS]; // cria array de objetos Card
        currentCard = 0; // a primeira Card distribuída será o deck[0]

        // preenche baralho com objetos Card
        for (int count = 0; count < deck.length; count++)
            deck[count] = new Card(faces[count % 13], suits[count / 13]);
     }

    // embaralha as cartas com um algoritmo de uma passagem
    public void shuffle() {
        // a próxima chamada para o método dealCard deve começar no deck[0] novamente
        currentCard = 0;

        // para cada Card, seleciona outra Card aleatória (0-51) e as compara
        for (int first = 0; first < deck.length; first++){
            // seleciona um número aleatório entre 0 e 51
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

            // compara Card atual com Card aleatoriamente selecionada
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    // distribui uma Card
    public ArrayList<Card> distribuirCartas(int quantidade) {
        // Verifica se há cartas suficientes no baralho
        if (quantidade > deck.length - currentCard) {
            throw new IllegalArgumentException("Não há cartas suficientes no baralho para distribuir.");
        }

        // Cria a mão e adiciona as cartas sequencialmente
        ArrayList<Card> hand = new ArrayList<>();
        for (int i = 0; i < quantidade; i++) {
            hand.add(deck[currentCard++]);
        }
        return hand;
    }

    public static boolean temUmPar(ArrayList<Card> hand){
        for (int i = 0; i < hand.size(); i++){
            Card card = hand.get(i);
            for (int b = 0; b < hand.size(); b++){
                Card card2 = hand.get(b);
                if (i != b){
                    if (card.getFace().equals(card2.getFace())){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean temDoisPares(ArrayList<Card> hand){
        int quantidadeDePares = 0;
        int idexCard1Par1 = -1;
        int idexCard2Par1 = -1;
        int idexCard1Par2 = -1;

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
                                    quantidadeDePares++;
                                }

                            }
                        }
                    }
                }
            }
        }
        return quantidadeDePares == 2;
    }

    public static boolean temTrinca(ArrayList<Card> hand){

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
                               return true;
                           }

                       }


                    }


                }

            }

        }

        return false;

    }

    public static boolean temQuadra(ArrayList<Card> hand){

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


                                if (
                                        b != i &&
                                        b != x &&
                                        b != a
                                ){
                                    if (
                                            card.getFace().equals(card1.getFace()) &&
                                            card.getFace().equals(card2.getFace()) &&
                                            card.getFace().equals(card3.getFace())
                                    ){

                                        return true;
                                    }

                                }

                            }

                        }


                    }


                }

            }

        }

        return false;

    }

    public static boolean temFlush(ArrayList<Card> hand) {
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

                                if (
                                        b != i &&
                                        b != x &&
                                        b != a
                                ){
                                  for (int c = 0; c < hand.size(); c++){
                                      Card card4 = hand.get(c);

                                      if (
                                              c != i &&
                                              c != x &&
                                              c != a &&
                                              c != b
                                      ){

                                          if (
                                                  card.getSuit().equals(card1.getSuit()) &&
                                                  card.getSuit().equals(card2.getSuit()) &&
                                                  card.getSuit().equals(card3.getSuit()) &&
                                                  card.getSuit().equals(card4.getSuit())
                                          ){
                                              return true;
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

        return false;
    }

    public static boolean temStraight(ArrayList<Card> hand) {
        hand.sort(Comparator.comparing(Card::getFace));

        for (int a = 0; a < hand.size(); a++){
            int valorCard1 = Integer.parseInt(hand.get(a).getFace());

            for (int b = 0; b < hand.size(); b++){
                if (b != a){
                    int valorCard2 = Integer.parseInt(hand.get(b).getFace());

                    if (valorCard2 == valorCard1-1){
                        for (int c = 0; c < hand.size(); c++){
                            if (
                                    c != a &&
                                    c != b
                            ){
                                int valorCard3 = Integer.parseInt(hand.get(c).getFace());

                                if (valorCard3 == valorCard2-1){
                                    for (int d = 0; d < hand.size(); d++){
                                        if (
                                                d != a &&
                                                d != b &&
                                                d != c
                                        ) {
                                            int valorCard4 = Integer.parseInt(hand.get(d).getFace());

                                            if (valorCard4 == valorCard3-1){
                                                for (int e = 0; e < hand.size(); e++){
                                                    if (
                                                            e != a &&
                                                            e != b &&
                                                            e != c &&
                                                            e != d
                                                    ){
                                                        int valorCard5 = Integer.parseInt(hand.get(e).getFace());

                                                        if (valorCard5 == valorCard4-1){
                                                            return true;
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
            }

        }

        return false;
    }

    public static boolean temFullHouse(ArrayList<Card> hand) {
        return temUmPar(hand) && temTrinca(hand);
    }
}
