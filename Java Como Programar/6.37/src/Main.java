import java.security.SecureRandom;
import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 3.0
 *
 * @description 6.36 -> 6.37 - (Instrução auxiliada por computador: Monitorando o desempenho do aluno) Sistemas mais
 *              sofisticados de instruções auxiliadas por computador monitoram o desempenho do aluno durante um período
 *              de tempo. A decisão sobre um novo tópico frequentemente é baseado no sucesso do aluno com tópicos prévios.
 *
 *             Modifique o programa de Exercício 6.36 para contar o número de respostas corretas e incorretas digitadas pelo aluno.
 *
 *             Depois que o aluno digitar 10 respostas, seu programa deve calcular a porcentagem das que estão corretas.
 *
 *             Se a porcentagem for menor que 75%, exiba “Peça ajuda extra ao seu professor.” e, então, reinicialize o
 *             programa para que outro estudante possa tentá-lo.
 *
 *             Se a porcentagem for 75% ou maior exiba “Parabéns, você está pronto para avançar para o próximo nível!”
 *             e, então reinicialize o programa para que outro estudante possa tentá-lo.
 *
 */
public class Main {

    private static SecureRandom random = new SecureRandom();
    private static Scanner scanner = new Scanner(System.in);
    private static int acertos = 0;
    private static int erros = 0;

    public static void main(String[] args) {
        acertosEErros();
    }

    public static void acertosEErros(){
        acertos = 0;
        erros = 0;

        pergunta();

        porcentagem();
        acertosEErros();

    }

    private static void porcentagem() {
        double porcentagem = (double) (100 * acertos) /10;
        System.out.println("Sua porcentagem de acertos foi: " + porcentagem + "%");
        if (porcentagem >= 75.0){
            System.out.println("Parabéns, você está pronto para avançar para o próximo nível!");
        } else {
            System.out.println("Peça ajuda extra ao seu professor.");
        }
    }

    public static void pergunta(){
        if (acertos + erros >= 10){
            return;
        } else {
            int numero1 = random.nextInt(1, 9);
            int numero2 = random.nextInt(1, 9);
            int sentinela = 0;

            while (sentinela != -1) {
                System.out.println("Quanto é " + numero1 + " x " + numero2 + "?");
                int respostaCorreta = numero1*numero2;

                int resposta = scanner.nextInt();

                if (resposta == respostaCorreta){
                    mensagem(true);
                    sentinela = -1;
                    acertos++;
                    pergunta();
                } else {
                    erros++;
                    if (acertos + erros >= 10){
                        return;
                    }
                    mensagem(false);
                }
            }
        }
    }

    private static void mensagem(boolean b) {
        int opcao = random.nextInt(1, 4);
        if (b){
            switch (opcao){
                case 1:
                    System.out.println("Muito bom!");
                    break;
                case 2:
                    System.out.println("Excelente!");
                    break;
                case 3:
                    System.out.println("Bom trabalho!");
                    break;
                case 4:
                    System.out.println("Mantenha um bom trabalho!");
            }
        } else {
            switch (opcao){
                case 1:
                    System.out.println("Não. Por favor, tente de novo.");
                    break;
                case 2:
                    System.out.println("Errado. Tente mais uma vez.");
                    break;
                case 3:
                    System.out.println("Não desista!");
                    break;
                case 4:
                    System.out.println("Não. Continue tentando.");
            }
        }
    }

}