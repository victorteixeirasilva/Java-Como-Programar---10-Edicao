import java.security.SecureRandom;
import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 5.0
 *
 * @description 6.38 - 6.39 - (Instrução auxiliada por computador: variando  os tipos de problema) Modifique o programa
 *              da Questão 6.38 a fim de permitir ao usuário selecionar um tipo de problema aritmética a ser estudado.
 *              Uma opção de
 *              1 significa apenas problemas de adição,
 *              2 significa apenas problemas de subtração,
 *              3, de multiplicação,
 *              4, de divisão e
 *              5, uma combinação aleatória de problemas de todos esses tipos.
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

        System.out.println("Selecione o tipo de problema que deseja resolver:");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. x");
        System.out.println("4. /");
        System.out.println("5. (+, -, x e /)");
        int tipo = scanner.nextInt();

        System.out.println("Informe uma dificuldade de 1 a 9, \nlembrando o valor que você colocar,\n representa a quantidade de digitos dos números: ");
        int dificuldade = scanner.nextInt();
        pergunta(dificuldade, tipo);

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

    public static void pergunta(int dificuldade, int tipo){
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
                int respostaCorreta = 0;
                int resposta = 0;

                switch (tipo){
                    case 1:
                        System.out.println("Quanto é " + numero1 + " + " + numero2 + "?");
                        respostaCorreta = numero1+numero2;
                        break;
                    case 2:
                        System.out.println("Quanto é " + numero1 + " - " + numero2 + "?");
                        respostaCorreta = numero1-numero2;
                        break;
                    case 3:
                        System.out.println("Quanto é " + numero1 + " x " + numero2 + "?");
                        respostaCorreta = numero1*numero2;
                        break;
                    case 4:
                        System.out.println("Quanto é " + numero1 + " / " + numero2 + "?");
                        respostaCorreta = numero1/numero2;
                        break;
                    case 5:
                        int todos = random.nextInt(1, 4);
                        switch (todos) {
                            case 1:
                                System.out.println("Quanto é " + numero1 + " + " + numero2 + "?");
                                respostaCorreta = numero1+numero2;
                                break;
                            case 2:
                                System.out.println("Quanto é " + numero1 + " - " + numero2 + "?");
                                respostaCorreta = numero1-numero2;
                                break;
                            case 3:
                                System.out.println("Quanto é " + numero1 + " x " + numero2 + "?");
                                respostaCorreta = numero1*numero2;
                                break;
                            case 4:
                                System.out.println("Quanto é " + numero1 + " / " + numero2 + "?");
                                respostaCorreta = numero1/numero2;
                                break;
                        }
                        break;
                    default:
                        System.out.println("Tipo de problema invalido!");
                        acertosEErros();
                }

                resposta = scanner.nextInt();

                if (resposta == respostaCorreta){
                    mensagem(true);
                    sentinela = -1;
                    acertos++;
                    pergunta(dificuldade, tipo);
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