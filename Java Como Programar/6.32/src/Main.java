import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 6.32 - (Distância entre pontos) Escreva um método distance para calcular a distância entre dois pontos
 *              (x1, y1) e (x2, y2). Todos os números e valores de retorno devem ser do tipo double. Incorpore esse
 *              método a um aplicativo que permite o usuário insira as coordenadas de pontos.
 */
public class Main {

    public static double distance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as coordenadas do primeiro ponto (x1 y1):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Digite as coordenadas do segundo ponto (x2 y2):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distancia = distance(x1, y1, x2, y2);

        System.out.println("A distância entre os pontos é: " + distancia);

        scanner.close();
    }
}