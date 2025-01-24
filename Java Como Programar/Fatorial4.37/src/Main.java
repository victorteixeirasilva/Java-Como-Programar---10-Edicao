/*
    (Fatorial) O fatorial de um inteiro negativo n é escrito como n! (pronuncia-se "n fatorial") e é definido como segue:
n!=n*(n-1)*(n-2)*...* (Para valores de n ou iguais a 1) e n!=1 (para n=0) Por exemplo, 5!=5*4*3*2*1, o que dá 120.
        a) Escreva um aplicativo que lê um inteiro não negativo, calcula e imprime seu fatorial.
        b) Escreva um aplicativo que estima o valor da constante matemátiva e utilizando a fórmula a seguir. Permita ao
usuário inserir o número de termos a calcular.
e = 1 + 1/1! + 1/2! + 1/3! + ...
        c) Escreva um aplicativo que computa o valor de e^x utilizando a fórmula a seguir. Permita ao usuário inserir o
número de termos a calcular.
e^x = 1 + x/1! + x^2/2! + x^3/3! + ...

 */

import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro não negativo: ");
        int n = scanner.nextInt();

        long fatorial = calcularFatorial(n);

        System.out.println(n + "! = " + fatorial);
    }
    public static long calcularFatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calcularFatorial(n - 1);
        }
    }
}