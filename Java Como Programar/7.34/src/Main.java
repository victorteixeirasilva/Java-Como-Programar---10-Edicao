/**
 * @author Victor Teixeira Silva
 * @version 1.0
 * @description 7.34 - (Projeto: embaralhamento e distribuição de cartas) Modifique o aplicativo das figuras 7.9 a 7.11
 * para usar tipos enum Face e Suit a fim de representar as faces e naipes das cartas. Declare cada um desses
 * tipos enum como um tipo public no seu arquivo de código-font. Cada Card deve ter uma variável de instância
 * Face e Suit. Esses dever ser inicializados pelo construtor Card. Na classe DeckOfCards, crie um array de
 * Faces que é inicializado com os nomes das constantes no tipo enum Face e um array de Suits que é inicializado
 * com os nomes das constantes no tipo enum Suit. [Observação: ao gerar uma constante enum como uma String,
 * o nome da constante é exibido.].
 */
public class Main {
    public static void main(String[] args) {
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle(); // coloca Cards em ordem aleatória

        // imprime todas as 52 cartas na ordem em que elas são distribuídas
        for (int i = 1; i <= 52; i++) {
            // distribui e exibe uma Card
            System.out.printf("%-19s", myDeckOfCards.dealCard());

            if (i % 4 == 0) // gera uma nova linha após cada quarta carta
                System.out.println();
        }
    }
}