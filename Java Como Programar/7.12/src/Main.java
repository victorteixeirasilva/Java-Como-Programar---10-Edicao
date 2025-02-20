import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 7.12 - (Eliminação de duplicatas) Utilize um array unidimensional para resolver o seguinte problema:
 *              Escreva um aplicativo que insere cinco números, cada um entre 10 e 100, inclusive. Enquanto cada número
 *              é lido, exiba-o somente se ele não tiver uma duplicata de um número já lido. Cuide de tratar o “pior
 *              caso”, em que todos os cinco números são diferentes. Utilize o menor array possível para resolver esse
 *              problema. Exiba o conjunto completo de valores únicos inseridos depois que o usuário inserir cada valor
 *              novo.
 *
 */
public class Main {
    public static void main(String[] args) {
        // Variavel do Objeto Scanner resposavel por receber entradas de teclado do usuário
        Scanner scanner = new Scanner(System.in);
        //Array inicial para que seja inserido 5 números
        int[] array = new int[5];

        // Loop de repetição para solicitar 5 entrada de dados
        for (int a = 0; a < 5; a++){

            //Variavel booleana para controlar o loop que valida o número informado
            boolean sentinela = true;
            //Validação do número
            while (sentinela){
                System.out.println("Informe um número de 10 a 100");
                int numero = scanner.nextInt();

                if (numero >= 10 && numero <= 100){
                    array[a] = numero;

                    sentinela = false;
                } else {
                    System.out.println("Número invalido, certifique de inserir um número entre 10 e 100.");
                }
            }
        }

        //Array sem duplicata que será exibido.
        ArrayList<Integer> arraySemDuplicata = new ArrayList<>();

        //Loop para percorrer o array
        for (int x = 0; x < 5; x++){
            //Variavel do tipo inteiro, que armazena o número que será testado
            int numeroTestar = array[x];

            //Loop responsavel por testar se o número a ser testado já existe dentro do array a ser exibido.
            for (int a = x; a < 5; a++) {
                if (arraySemDuplicata.contains(numeroTestar)) {
                    break;
                } else {
                    arraySemDuplicata.add(array[x]);
                }
            }
        }

        //Exibindo resultado.
        for (int numero:arraySemDuplicata){
            System.out.println(numero);
        }

    }
}