import java.security.SecureRandom;
import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 2.0
 *
 * @description 6.35 -> 6.36 - (Instrução auxiliada por computador: Reduzindo a fadiga do aluno) Um problema em ambientes
 *              CAI é a fadiga do aluno. Isso pode ser reduzido variando-se as respostas do computador para prender a
 *              atenção do aluno. Modifique o programa da Questão 6.35 para que vários comentários sejam exibidos para
 *              cada resposta como mostrado a seguir:
 *                  Possibilidades para uma resposta correta:
 *                      Muito bom!
 *                      Excelente!
 *                      Bom trabalho!
 *                      Mantenha um bom trabalho!
 *                  Possibilidades para uma resposta incorreta:
 *                      Não. Por favor, tente de novo.
 *                      Errado. Tente mais uma vez.
 *                      Não desista!
 *                      Não. Continue tentando.
 *              Utilize a geração de números aleatórios para escolher um número de 1 a 4 que será utilizado para
 *              selecionar uma de quatro respostas adequadas a cada resposta correta ou incorreta. Utilize uma instrução
 *              switch para emitir as respostas.
 *
 *
 */
public class Main {

    private static SecureRandom random = new SecureRandom();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        pergunta();
    }

    public static void pergunta(){
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
                pergunta();
            }
            mensagem(false);
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