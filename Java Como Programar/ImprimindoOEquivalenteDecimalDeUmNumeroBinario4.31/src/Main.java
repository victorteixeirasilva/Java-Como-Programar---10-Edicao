/*
    (Imprimindo o equivalente decimal de um número binário) Escreva um aplicativo que insere um número inteiro que contém
somente 0s e 1s (isto é, um número inteiro binário) e imprime o seu equivalente decimal. [Dica: utilize os operadores de
resto e divisão para pegar os dígitos do número binário um de cada vez da direita para a esqueda. No sistema de números
decimais, o dígito mais à direita tem um valor posicional de 1 e o próximo dígito à esquerda um valor posicional de 10,
e depois de 100, depois 1000 e assim por diante. O número decimal 234 pode ser interpretado como 4 * 1 + 3 * 10 + 2 * 100.
No sistema de número binário, o dígito mais à direita tem um valor posicional de 1, o próximo dígito à esquerda um valor
posicional de 2, depois 4, depois 8 e assim por diante. O equivalente decimal do binário 1101 é  1*1 + 0*2 + 1*4 + 1*8
ou 1+0+8 ou 13.]

 */

import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número binário: ");
        String numeroBinario = scanner.nextLine();

        int decimal = converterBinarioParaDecimal(numeroBinario);

        System.out.println("O número decimal equivalente é: " + decimal);
    }

    public static int converterBinarioParaDecimal(String binario) {
        int decimal = 0;
        int potencia = 0;

        // Percorre os dígitos do binário da direita para a esquerda
        for (int i = binario.length() - 1; i >= 0; i--) {
            int digito = Character.getNumericValue(binario.charAt(i));
            decimal += digito * Math.pow(2, potencia);
            potencia++;
        }

        return decimal;
    }
}