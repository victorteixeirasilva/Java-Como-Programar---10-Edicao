import java.util.Random;
import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 6.29 - (Cara ou coroa) Escreva um aplicativo que simula o jogo cara ou coroa. Deixe o programa lançar uma
 *              moeda toda vez que o usuário escolher a opção “Toss Coin” no menu. Conte o número de vezes que cada lado
 *              da moeda aparece. Exiba os resultados. O programa deve chamar um método flip separado que não aceita
 *              argumentos e retorna um valor a partir de um Coin enum (HEADS e TAILS). [Observação: se o programa
 *              simular de modo realista o arremesso de moeda, cada lado da moeda deve aparecer aproximadamente metade
 *              das vezes.]
 */
public class Main {

    public static Coin flip() {
        Random random = new Random();
        return random.nextBoolean() ? Coin.HEADS : Coin.TAILS;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int headsCount = 0;
        int tailsCount = 0;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Toss Coin");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Coin result = flip();
                    if (result == Coin.HEADS) {
                        headsCount++;
                        System.out.println("It's HEADS!");
                    } else {
                        tailsCount++;
                        System.out.println("It's TAILS!");
                    }
                    break;
                case 2:
                    System.out.println("\nResults:");
                    System.out.println("Heads: " + headsCount);
                    System.out.println("Tails: " + tailsCount);
                    System.out.println("Total flips: " + (headsCount + tailsCount));
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}