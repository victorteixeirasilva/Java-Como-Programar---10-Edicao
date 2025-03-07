// Figura 7.9: Card.java
// Classe Card representa uma carta de baralho.

public class Card {
    private final Faces face; // face da carta ("Ace", "Deuce", ...)
    private final Suits suit; // naipe da carta ("Hearts", "Diamonds", ...)

    // construtor de dois argumentos inicializa face e naipe da carta
    public Card(Faces cardFace, Suits cardSuit) {
        this.face = cardFace; // inicializa face da carta
        this.suit = cardSuit; // inicializa naipe da carta
    }

    // retorna representação String de Card
    public String toString() {
        return face + " of " + suit;
    }
} // fim da classe Card