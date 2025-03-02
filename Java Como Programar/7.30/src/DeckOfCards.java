import java.security.SecureRandom;
import java.util.ArrayList;

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

        String[] faces = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
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

    public boolean temUmPar(ArrayList<Card> hand){
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

    public boolean temDoisPares(ArrayList<Card> hand){
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
                                }

                            }
                        }
                    }
                }
            }
        }
        return quantidadeDePares == 2;
    }

}
