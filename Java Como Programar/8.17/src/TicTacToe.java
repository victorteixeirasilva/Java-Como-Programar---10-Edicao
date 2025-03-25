import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 8.17 (Jogo da velha) Crie uma classe TicTacToe que permitirá escrever um programa para reproduzir o jogo
 * da velha.
 *
 * 1 - Desafio.
 *      A classe contém um array bidimensional privado 3 por 3.
 *
 *      Use um tipo enum para representar o valor em cada célula do array.
 *              As constantes enum devem ser nomeadas X, O e EMPTY (para uma posição que não contém X ou 0).
 *
 *      O construtor deve inicializar os elementos do tabuleiro para EMPTY.
 *
 *      Permita dois jogadores humanos.
 *
 *      Para onde quer que o primeiro jogador se mova, coloque um X no quadrado especificado; coloque um O no local para
 *      o qual o segundo jogador se mover.
 *
 *      Todo movimento deve ocorrer em um quadrado vazio. Depois de cada jogada, determine se o jogo foi ganho e se
 *      aconteceu um empate.
 *
 */
public class TicTacToe {

    private Marcadores[][] tabuleiro = new Marcadores[3][3];
    private Scanner scanner = new Scanner(System.in);

    public TicTacToe() {
        Marcadores[][] tabuleiro = new Marcadores[3][3];
        for (int a = 0; a < 3; a++){
            for (int b = 0; b < 3; b++){
                tabuleiro[a][b] = Marcadores.EMPTY;
            }
        }
        this.tabuleiro = tabuleiro;
    }

    public void jogarDoisJogadores(){
        while (true){

            if (deuVelha()){
                System.out.println("Deu velha!");
                System.out.println(toString());
                return;
            }

            boolean opcao = true;
            while (opcao) {
                try {
                    moverJogador(1);
                    opcao = false;
                } catch (Exception e) {
                    System.out.println("Posição já ocupada, escolha outra!");
                }
            }
            if (venceu(1)){
                System.out.println("Jogador 1 Venceu");
                System.out.println(toString());
                return;
            }
            if (deuVelha()){
                System.out.println("Deu velha!");
                System.out.println(toString());
                return;
            }

            boolean opcao2 = true;
            while (opcao2) {
                try {
                    moverJogador(2);
                    opcao2 = false;
                } catch (Exception e) {
                    System.out.println("Posição já ocupada, escolha outra!");
                }
            }
            if (venceu(2)){
                System.out.println("Jogador 2 Venceu");
                System.out.println(toString());
                return;
            }
            if (deuVelha()){
                System.out.println("Deu velha!");
                System.out.println(toString());
                return;
            }
        }
    }

    private boolean deuVelha() {
        int camposVazios = 0;

        for (int a = 0; a < 3; a++){
            for (int b = 0; b < 3; b++){
                if (this.tabuleiro[a][b].equals(Marcadores.EMPTY)){
                    return false;
                }
            }
        }

        return true;

    }

    private boolean venceu(int i) {
        String letra = letra(i);

        //Horizontal 1
        boolean vitoriaH1 =
                (this.tabuleiro[0][0].getValue().equals(letra))
                &&
                (this.tabuleiro[0][1].getValue().equals(letra))
                &&
                (this.tabuleiro[0][2].getValue().equals(letra));

        //Horizontal 2
        boolean vitoriaH2 = (this.tabuleiro[1][0].getValue().equals(letra))
                            &&
                            (this.tabuleiro[1][1].getValue().equals(letra))
                            &&
                            (this.tabuleiro[1][2].getValue().equals(letra));

        //Horizontal 3
        boolean vitoriaH3 = (this.tabuleiro[2][0].getValue().equals(letra))
                            &&
                            (this.tabuleiro[2][1].getValue().equals(letra))
                            &&
                            (this.tabuleiro[2][2].getValue().equals(letra));

        //Vertical 1
        boolean vitoriaV1 = (this.tabuleiro[0][0].getValue().equals(letra))
                            &&
                            (this.tabuleiro[0][1].getValue().equals(letra))
                            &&
                            (this.tabuleiro[0][2].getValue().equals(letra));

        //Vertical 2
        boolean vitoriaV2 = (this.tabuleiro[1][0].getValue().equals(letra))
                            &&
                            (this.tabuleiro[1][1].getValue().equals(letra))
                            &&
                            (this.tabuleiro[1][2].getValue().equals(letra));

        //Vertical 3
        boolean vitoriaV3 = (this.tabuleiro[2][0].getValue().equals(letra))
                            &&
                            (this.tabuleiro[2][1].getValue().equals(letra))
                            &&
                            (this.tabuleiro[2][2].getValue().equals(letra));

        //Diagonal 1
        boolean diagonal1 = (this.tabuleiro[0][0].getValue().equals(letra))
                            &&
                            (this.tabuleiro[1][1].getValue().equals(letra))
                            &&
                            (this.tabuleiro[2][2].getValue().equals(letra));

        //Diagonal 2
        boolean diagonal2 = (this.tabuleiro[0][2].getValue().equals(letra))
                            &&
                            (this.tabuleiro[1][1].getValue().equals(letra))
                            &&
                            (this.tabuleiro[2][0].getValue().equals(letra));

        return vitoriaH1 || vitoriaH2 || vitoriaH3 || vitoriaV1 || vitoriaV2 || vitoriaV3 || diagonal1 || diagonal2;
    }

    private void moverJogador(int jogador){
        System.out.println("Jogador " + jogador + " - Informe a coluna que deseja colocar o (" + letra(jogador) + ")");
        int coluna = scanner.nextInt();

        System.out.println("Jogador " + jogador + " - Informe a linha que deseja colocar o (" + letra(jogador) + ")");
        int linha = scanner.nextInt();

        if (this.tabuleiro[linha][coluna] == Marcadores.EMPTY){
            if (letra(jogador).equals(Marcadores.X.getValue())){
                this.tabuleiro[linha][coluna] = Marcadores.X;
            } else if (letra(jogador).equals(Marcadores.O.getValue())) {
                this.tabuleiro[linha][coluna] = Marcadores.O;
            }
        } else {
            throw new IllegalArgumentException("Posição não está vazia");
        }

        System.out.println(toString());
    }

    private String letra(int jogador) {
       return switch (jogador){
            case 1 -> "X";
            case 2 -> "O";
           default -> throw new IllegalStateException("Unexpected value: " + jogador);
       };
    }

    public Marcadores[][] getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(Marcadores[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    @Override
    public String toString() {
        String ticTacToe = "";
        for (int a = 0; a < 3; a++){
            System.out.print(a + " - ");
            for (int b = 0; b < 3; b++){
                System.out.print("|" + tabuleiro[a][b] + "|");
            }
            System.out.println();
        }
        System.out.println("    0 - 1 - 2 ");
        return ticTacToe;
    }
}
