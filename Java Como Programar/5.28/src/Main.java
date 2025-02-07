/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description Descreva de maneira geral como você removeria qualquer instrução continue de um loop em um programa e a
 * substituiria por alguma equivalente estruturada. Utilize a técnica que você desenvolve aqui para remover a instrução
 * continue do programa na Figura 4.14.
 */
public class Main {
    public static void main(String[] args) {
        for (int count = 1; count <= 10; count++) { // faz o loop 10 vezes
            if (count == 5) {
                System.out.println("Continue");
            } else {
                System.out.println(count);
            }
        }
        System.out.printf("%nUsed continue to skip printing 5%n");
    }
}