import java.security.SecureRandom;
import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 6.35 - (Instrução assistida por computador) O uso de computadores na educação é chamado de instrução
 *              assistida por computador (CAI). Escreva um programa que ajudará um aluno da escola elementar a aprender
 *              multiplicação.
 *
 *              Utilize um objeto SecureRandom para produzir dois inteiros positivos de um algarismo.
 *
 *              O programa deve então fazer ao usuário uma pergunta, como (Quanto é 6 vezes 7?).
 *
 *              O aluno insere então a resposta.
 *
 *              Em seguida o programa verifica a resposta do aluno.
 *
 *              Se estiver correta, exiba a mensagem “Muito bem!” e faça uma outra pergunta de multiplicação.
 *
 *              Se a resposta estiver errada, exiba a mensagem “Não. Por favor, tente de novo.” e deixe que o aluno
 *              tente a mesma pergunta várias vezes até que por fim acerte.
 *
 *              Um método separado deve ser utilizado para gerar cada nova pergunta. Esse método deve ser
 *              chamado uma vez quando a aplicação inicia a execução e toda vez que o usuário responde a pergunta
 *              corretamente.
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
                System.out.println("Muito Bem!");
                sentinela = -1;
                pergunta();
            }
        }
    }

}