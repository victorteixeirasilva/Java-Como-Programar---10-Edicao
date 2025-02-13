import java.security.SecureRandom;
import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 4.0
 *
 * @description 6.37 -> 6.38 - (Instrução auxiliada por computador: níveis de dificuldade) As questão 6.35 a 6.37 desenvolveram um programa de instrução assistida por computador a fim de ajudar a ensinar a multiplicação para um aluno do ensino fundamental. Modifique o programa para permitir que o usuário insira um nível de dificuldade 1, o programa deve utilizar apenas números de um único dígito nos problemas; em um nível de dificuldade 2, os números com dois dígitos, e assim por diante.
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

        System.out.println("Informe uma dificuldade de 1 a 9, \nlembrando o valor que você colocar,\n representa a quantidade de digitos dos números: ");
        int dificuldade = scanner.nextInt();
        pergunta(dificuldade);

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

    public static void pergunta(int dificuldade){
        if (acertos + erros >= 10){
            return;
        } else {
            int numero1 = 0;
            int numero2 = 0;
            switch (dificuldade){
                case 1:
                    numero1 = random.nextInt(1, 9);
                    numero2 = random.nextInt(1, 9);
                    break;
                case 2:
                    numero1 = random.nextInt(10, 99);
                    numero2 = random.nextInt(10, 99);
                    break;
                case 3:
                    numero1 = random.nextInt(100, 999);
                    numero2 = random.nextInt(100, 999);
                    break;
                case 4:
                    numero1 = random.nextInt(1000, 9999);
                    numero2 = random.nextInt(1000, 9999);
                    break;
                case 5:
                    numero1 = random.nextInt(10000, 99999);
                    numero2 = random.nextInt(10000, 99999);
                    break;
                case 6:
                    numero1 = random.nextInt(100000, 999999);
                    numero2 = random.nextInt(100000, 999999);
                    break;
                case 7:
                    numero1 = random.nextInt(1000000, 9999999);
                    numero2 = random.nextInt(1000000, 9999999);
                    break;
                case 8:
                    numero1 = random.nextInt(10000000, 99999999);
                    numero2 = random.nextInt(10000000, 99999999);
                    break;
                case 9:
                    numero1 = random.nextInt(100000000, 999999999);
                    numero2 = random.nextInt(100000000, 999999999);
                    break;
                default:
                    System.out.println("Dificuldade invalida!");
                    acertosEErros();
            }

            int sentinela = 0;

            while (sentinela != -1) {
                System.out.println("Quanto é " + numero1 + " x " + numero2 + "?");
                int respostaCorreta = numero1*numero2;

                int resposta = scanner.nextInt();

                if (resposta == respostaCorreta){
                    mensagem(true);
                    sentinela = -1;
                    acertos++;
                    pergunta(dificuldade);
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