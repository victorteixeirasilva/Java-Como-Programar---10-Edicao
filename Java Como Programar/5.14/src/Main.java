/*
    (Programa de juros compostos modificado) Modifique o aplicativo de juros compostos da Figura 5.6
    para repetir os passos para taxas de juros de 5%, 6%, 7%, 8%, 9% e 10%. Utilize um loop for para variar a taxa de juros.
 */
/**
 * @author Victor Teixeira Silva
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {

        double amount; // Quantia em depósitos ao fim de cada ano
        double principal = 1000.0; // Quantidade inicial antes dos juros
        double rate = 0; // Taxa de juros.

        // Exibe cabeçalhos
        System.out.printf("%s   %n", "Year", "Amount on deposit");

        for (double r = 5; r <= 10; r++) {
            System.out.println("Rate: " + r + "%");
            rate =  r / 10;

            for (int year = 1; year <= 10; ++year) {
                // Calcula nova quantidade durante ano especificado.
                amount = principal * Math.pow(1.0 + rate, year);

                // Exibe o ano e a quantidade
                System.out.printf("%4d%,20.2f%n", year, amount);

            }
        }
    }
}