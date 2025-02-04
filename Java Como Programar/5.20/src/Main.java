/*

 */
/**
 * @author Victor Teixeira Silva
 * @version 1.0
 */
public class Main {
    public static double calcularPi(int termos) {
        double pi = 0;
        for (int i = 0; i < termos; i++) {
            int denominador = 2 * i + 1;
            double termo = 4.0 / denominador;
            if (i % 2 == 0) {
                pi += termo;
            } else {
                pi -= termo;
            }
        }
        return pi;
    }

    public static int encontrarTermosPi(double valorEsperado) {
        int termos = 0;
        double pi = 0;
        while (true) {
            termos++;
            pi = calcularPi(termos);
            String piStr = String.valueOf(pi);
            if (piStr.startsWith(String.valueOf(valorEsperado))) {
                return termos;
            }
        }
    }

    public static void main(String[] args) {
        int termos = 200000;
        double pi = calcularPi(termos);

        System.out.println("Valor aproximado de PI com " + termos + " termos: " + pi);

        System.out.println("\nTabela mostrando a convergência de PI:");
        System.out.println("----------------------------------");
        System.out.println("| Termos | Valor de PI             |");
        System.out.println("----------------------------------");

        for (int i = 1000; i <= termos; i += 1000) {
            pi = calcularPi(i);
            System.out.printf("| %6d | %20f |\n", i, pi);
        }

        System.out.println("----------------------------------");

        int termos314159 = encontrarTermosPi(3.14159);
        System.out.println("\nSão necessários " + termos314159 + " termos para obter um valor de PI que começa com 3,14159.");
    }





}