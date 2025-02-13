/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 6.34 - (Tabela de números binários, octais e hexadecimais) Escreva um aplicativo que exibe uma tabela de
 *              equivalentes binários, octais e hexadecimais dos números decimais no intervalo de 1 a 256. Se você não
 *              estiver familiarizado com esses sistemas de números, leia primeiro o Apêndice J, em inglês na Sala
 *              Virtual do Livro.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Decimal\tBinário\t\tOctal\tHexadecimal");
        System.out.println("----------------------------------------");

        for (int decimal = 1; decimal <= 256; decimal++) {
            String binario = Integer.toBinaryString(decimal);
            String octal = Integer.toOctalString(decimal);
            String hexadecimal = Integer.toHexString(decimal).toUpperCase(); // Converte para maiúsculas

            // Adiciona espaços para alinhar as colunas (ajuste conforme necessário)
            System.out.printf("%d\t\t%s\t\t%s\t\t%s\n", decimal, binario, octal, hexadecimal);
        }
    }
}