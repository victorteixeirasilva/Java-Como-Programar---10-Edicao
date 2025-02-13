import java.security.SecureRandom;
import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 6.30 - (Adivinhe o número) Escreva um aplicativo que execute “adivinhe o número” como mostrado a seguir:
 *              seu programa escolhe o número a ser adivinhado selecionando um inteiro no intervalo de 1 a 1.000. O
 *              aplicativo exibe o prompt Guess a number between 1 and 1000 [adivinhe o número entre 1 e 1000]. O
 *              jogador insere a primeira suposição. Se o palpite do jogador estiver incorreto, seu programa deve exibir
 *              Too high. Try again [Muito alto. tente novamente]. ou Too low. Try again [Muito baixo. Tente novamente]
 *              para ajudar o jogador a alcançar a resposta correta. O programa deve solicitar ao usuário o próximo
 *              palpite. Quando o usuário insere a resposta correta, exibe Congratulations. You guessed the number.
 *              [Parabéns, você adivinhou o número!] e permite que o usuário escolha se quer jogar novamente.
 *              [Observação: a técnica de adivinhação empregada nesse problema é semelhante a uma pesquisa binária,
 *              discutida no Capítulo 19, “Pesquisa, classificação e Big 0”.]
 */
public class Main {

    public static void adivinheONumero(){
        SecureRandom secureRandom = new SecureRandom();
        int numeroEsperado = secureRandom.nextInt(1, 1000);
        Scanner scanner = new Scanner(System.in);

        System.out.println("De um palpite do número: ");
        int numeroDigitado = scanner.nextInt();


        while (numeroEsperado != numeroDigitado) {
            if (numeroEsperado < numeroDigitado){
                System.out.println("Too high. Try again [Muito alto. tente novamente].");
                System.out.println("De um palpite do número: ");
                numeroDigitado = scanner.nextInt();
            } else {
                System.out.println("Too low. Try again [Muito baixo. Tente novamente]");
                System.out.println("De um palpite do número: ");
                numeroDigitado = scanner.nextInt();
            }
        }
        System.out.println("Congratulations. You guessed the number. [Parabéns, você adivinhou o número!]");
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