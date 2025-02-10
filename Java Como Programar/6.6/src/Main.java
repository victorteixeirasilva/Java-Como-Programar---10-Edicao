import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 6.6 - Declare o método sphereVolume para calcular e retornar o volume da esfera. Utilize a seguinte
 *              instrução para calcular o volume:
 *                  double volume = (4.0 / 3.0) * Math.pow(radius, 3)
 *              Escreva um aplicativo Java que solicita ao usuário o raio do tipo double de uma esfera, chama
 *              sphereVolume para calcular o volume e exibe o resultado.
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o raio: ");
        double raio = scanner.nextDouble();

        sphereVolume(raio);


    }

    public static void sphereVolume(double radius){
        double volume = (4.0 / 3.0) * Math.pow(radius, 3);
        System.out.println("O volume da esfera é: "+volume);
    }
}