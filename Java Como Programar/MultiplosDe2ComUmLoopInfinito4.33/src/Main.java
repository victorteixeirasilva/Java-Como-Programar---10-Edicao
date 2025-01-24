/*
    (Múltiplos de 2 com um loop infinito) Escreva um aplicativo que continue exibindo na janela de comando os múltiplos
do inteiro 2 - a saber, 2,4,8,16,32,64 e assim por diante. Seu loop não deve terminar (isto é, deve criar um loop infinito).

    O que acontece quando você executa esse programa?
        Resposta: Após chegar num determinado multiplo o programa quebra e começa a imprimir apenas 0s, entendo que
                    isso se da por conta do tipo primitivo "int", que não suporta o tamanho do número.
                    (1073741824, -2147483648, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0).
 */

import java.math.BigInteger;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
            int multiplo = 2;
            int numero = 2;

        System.out.print("2, ");
        while (true){
            System.out.print(numero*multiplo+", ");
            numero = numero*multiplo;
        }
    }
}