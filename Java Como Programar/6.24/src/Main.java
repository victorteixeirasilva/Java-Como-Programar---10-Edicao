/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 6.24 - (Números perfeitos) Dizemos que o número inteiro é um número perfeito se a soma de seus fatores,
 *              incluindo 1 (mas não o próprio número), for igual ao número. Por exemplo, 6 é um número perfeito porque
 *              6 = 1 + 2 + 3. Escreva um método isPerfect que determina se parâmetro number é um número perfeito.
 *              Utilize esse método em um applet que determina e exibe todos os números perfeitos entre 1 e 1.000. Exiba
 *              os fatores de cada número perfeito confirmando que ele é de fato perfeito. Desafie o poder de computação
 *              do seu computador testando números bem maiores que 1.000. Exiba os resultados.
 */
public class Main {

    public static boolean isPerfect(int number) {
        if (number <= 1) {
            return false; // Números menores ou iguais a 1 não são perfeitos
        }

        int sum = 1; // Inicializa a soma dos fatores com 1
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                sum += i;
                if (i * i != number) { // Evita adicionar o mesmo fator duas vezes (ex: 28 = 2 * 14, já adicionamos 2, não precisamos adicionar 14)
                    sum += number / i;
                }
            }
        }
        return sum == number;
    }

    public static void findAndPrintPerfectNumbers(int limit) {
        for (int number = 1; number <= limit; number++) {
            if (isPerfect(number)) {
                System.out.print(number + " é um número perfeito porque " + number + " = 1");
                int sum = 1;
                for (int i = 2; i * i <= number; i++) {
                    if (number % i == 0) {
                        System.out.print(" + " + i);
                        sum += i;
                        if (i * i != number) {
                            System.out.print(" + " + number / i);
                            sum += number / i;
                        }
                    }
                }
                System.out.println(".");
            }
        }
    }

    public static void main(String[] args) {
        int limit = 1000;
        System.out.println("Números perfeitos entre 1 e " + limit + ":");
        findAndPrintPerfectNumbers(limit);

        // Desafiando o poder de computação (testando números maiores)
        limit = 10000; // Aumente este valor para testar números ainda maiores
        System.out.println("\nTestando números maiores (até " + limit + "):");
        findAndPrintPerfectNumbers(limit);
    }
}