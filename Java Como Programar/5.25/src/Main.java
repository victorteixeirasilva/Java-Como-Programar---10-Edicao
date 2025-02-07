import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 5.25 - (Programa de impressão de losangos modificado) Modifique o aplicativo que você escreveu na
 *              questão 5.24 para ler um número ímpar no intervalo 1 a 19 para especificar o número de linhas no
 *              losango. O seu programa então deve exibir um losango do tamanho apropriado.
 */
public class Main {
    public static void main(String[] args) {

        receberDados();


    }

    public static void receberDados(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número impar de 1 a 19, para reproduzir o losangulo");
        int numero = scanner.nextInt();
        Losangulo.criarLosangulo(numero);
    }
}