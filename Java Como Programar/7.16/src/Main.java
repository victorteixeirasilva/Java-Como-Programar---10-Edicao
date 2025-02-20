/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 7.16 - (Usando a instrução for aprimorada) Escreva um aplicativo que usa uma instrução for aprimorada
 *              para somar os valores double passados pelos argumentos de linha de comando. [Dica: utilize o método
 *              static parseDouble da classe Double para converter uma String em um valor double.]
 */
public class Main {
    public static void main(String[] args) {

        double soma = 0;

        for (String valor:args){
            soma += Double.parseDouble(valor);
        }

        System.out.println(soma);
    }
}