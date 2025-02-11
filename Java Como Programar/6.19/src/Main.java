import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 6.19 - (Exibindo um quadrado de qualquer caractere) Modifique o método criado no exercício 6.18 para
 *              receber um segundo parâmetro do tipo char chamado fillCharacter. Forme o quadrado utilizando o char
 *              fornecido como argumento. portanto se side for 5 e fillCharacter for #, o método deve exibir:
 *              #####
 *              #####
 *              #####
 *              #####
 *              #####
 *              Utilize a seguinte instrução (em que input é um objeto Scanner) para ler um caractere do usuário no teclado:
 *              char fill = input.next().charAt(0);
 */
public class Main {
    public static void squareOfAnyCharacter(int side, char fillCharacter) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print(fillCharacter);
            }
            System.out.println(); // Muda de linha após cada linha de caracteres
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um inteiro para o lado do quadrado: ");
        int side = scanner.nextInt();

        System.out.print("Digite um caractere para preencher o quadrado: ");
        char fillCharacter = scanner.next().charAt(0); // Lê um caractere do teclado

        squareOfAnyCharacter(side, fillCharacter);

        scanner.close();
    }
}