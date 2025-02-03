/*
    5.13 - (Fatoriais) Fatoriais costumam ser utilizados em problemas de probabilidade. O fatorial de um inteiro
    positivo n (escrito como n! e pronuncia como “fatorial de n”) é igual ao produto dos números inteiros positivos
    de 1 a n. Escreva um aplicativo que calcula fatoriais de 1 a 20. Utilize o tipo long. Exiba os resultados em
    formato tabular. Que dificuldade poderia impedir você de calcular o fatorial de 100?
 */
/**
 * @author Victor Teixeira Silva
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            long fatorial = calcularFatorial(i);
            System.out.println("O fatorial de " + i + " é " + fatorial);
        }
    }

    private static long calcularFatorial(int n) {
        if (n == 0){
            return 1;
        }

        long fatorial = 1;
        for (int i = 1; i <= n; i++){
            fatorial *= i;
        }
        return fatorial;

    }
}