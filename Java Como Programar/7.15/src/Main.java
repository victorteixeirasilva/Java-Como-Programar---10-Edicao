/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 7.15 - (Argumentos de linha de comando) Reescreva a Figura 7.2 para que o tamanho do array seja
 *              especificado pelo primeiro argumento de linha de comando. Se nenhum argumento de linha de comando for
 *              fornecido, utilize 10 como o tamanho padrão do array.
 */
public class Main {
    public static void main(String[] args) {
        int[] array;
        if (args.length>=1){
            array = new int[args.length];
        } else {
            array = new int[10]; // cria o objeto array
        }
        System.out.printf("%s%8s%n", "Index", "Value"); // títulos de coluna

        // gera saída do valor de cada elemento do array
        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }
}