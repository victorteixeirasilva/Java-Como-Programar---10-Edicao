/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 7.14 - (Lista de argumentos de comprimento variável) Escreva um aplicativo que calcula o produto de uma
 *              série de inteiros passados para um metodo product utilizando uma lista de argumentos de comprimento
 *              variável.
 */
public class Main {
    public static void main(String[] args) {
        // Exemplo de uso do método product
        int resultado1 = product(2, 3, 4);
        int resultado2 = product(1, 5, 7, 2);

        System.out.println("Produto de 2, 3, 4: " + resultado1);
        System.out.println("Produto de 1, 5, 7, 2: " + resultado2);
    }


    // Método product que recebe uma lista de argumentos de comprimento variável
    public static int product(int... numeros) {
        int produto = 1;
        for (int num : numeros) {
            produto *= num;
        }
        return produto;
    }
}