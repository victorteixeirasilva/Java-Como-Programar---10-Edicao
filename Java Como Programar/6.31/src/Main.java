import java.security.SecureRandom;
import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 6.31 - (Adivinhe a modificação de número) Modifique o programa do Exercício 6.30 para contar o número de
 *              adivinhações que o jogador faz. Se o número for 10 ou menos, exibe Either you know the secret or you got
 *              lucky! [Você sabe o segredo ou tem muita sorte!]; se o jogador adivinhar o número em 10 tentativas,
 *              exiba Aha! You know the secret! [Aha! Você sabe o segredo!]; Se o jogador fizer mais de 10 adivinhações,
 *              exiba You should be able to do better! [Você deve ser capaz de fazer melhor]. Por que esse jogo não deve
 *              precisar de mais que 10 suposições? Bem, com cada “boa adivinhação” o jogador deve ser capaz de eliminar
 *              a metade dos números, depois a metade dos números restantes, e assim por diante.
 */
public class Main {
    public static void adivinheONumero(){
        SecureRandom secureRandom = new SecureRandom();
        int numeroEsperado = secureRandom.nextInt(1, 1000);
        Scanner scanner = new Scanner(System.in);

        System.out.println("De um palpite do número: ");
        int numeroDigitado = scanner.nextInt();
        int palpites = 1;

        while (numeroEsperado != numeroDigitado) {
            if (numeroEsperado < numeroDigitado){
                System.out.println("Too high. Try again [Muito alto. tente novamente].");
                System.out.println("De um palpite do número: ");
                numeroDigitado = scanner.nextInt();
                palpites++;
            } else {
                System.out.println("Too low. Try again [Muito baixo. Tente novamente]");
                System.out.println("De um palpite do número: ");
                numeroDigitado = scanner.nextInt();
                palpites++;
            }
        }
        System.out.println("Congratulations. You guessed the number. [Parabéns, você adivinhou o número!]");
        if (palpites < 10){
            System.out.println("Either you know the secret or you got lucky! [Você sabe o segredo ou tem muita sorte!]");
        } else if (palpites == 10){
            System.out.println("Aha! You know the secret! [Aha! Você sabe o segredo!]");
        } else {
            System.out.println("You should be able to do better! [Você deve ser capaz de fazer melhor]");
        }

        System.out.println("Deseja jogar novamente:");
        System.out.println("1. SIM");
        System.out.println("2. NÃO");

        int opcao = scanner.nextInt();


        if (opcao == 1){
            adivinheONumero();
        }

    }

    public static void main(String[] args) {
        adivinheONumero();
    }
}