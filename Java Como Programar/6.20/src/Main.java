import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 6.20 - (Área de círculo) Escreva um aplicativo que solicita ao usuário o raio de um círculo e utiliza um
 *              método chamado circleArea para calcular a área do círculo.
 */
public class Main {
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double radius = scanner.nextDouble();

        double area = circleArea(radius);

        System.out.println("A área do círculo é: " + area);

        scanner.close();
    }
}