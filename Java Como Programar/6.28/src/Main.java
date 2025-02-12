import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @descrição 6.28 - Escreva um método qualityPoints que insere a média de um aluno e retorna 4 se for 90 a 100, 3 se
 *            80 a 89, 2 se 70 a 79, 1 se 60 a 69 e 0 se menor que 60. Incorpore o método a um aplicativo que lê dois
 *            valores de usuário e exibe o resultado.
 */
public class Main {

    public static int qualityPoints(double media){
        if (media >= 90 && media <= 100){
            return 4;
        } else if (media >= 80 && media <= 89) {
            return 3;
        } else if (media >= 70 && media <= 79) {
            return 2;
        } else if (media >= 60 && media <= 69) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe sua primeira nota: ");
        double priemiraNota = scanner.nextDouble();

        System.out.println("Informe sua segunda nota: ");
        double segundaNota = scanner.nextDouble();

        System.out.println(qualityPoints((priemiraNota+segundaNota)/2));
    }
}