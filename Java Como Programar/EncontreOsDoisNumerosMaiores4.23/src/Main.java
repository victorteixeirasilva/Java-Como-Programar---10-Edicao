/*

    (Encontre os dois números maiores) Utilizando uma abordagem semelhante àquela do Exercício 4.21, encontre os dois
maiores valores entre os 10 valores inseridos [Observação: você só pode inserir cada número uma vez.]

Anotações:

    Repita 10 vezes
        Sistema solicita entrada do número
        Sistema verifica se o número já não foi inserido
            Se não foi, sistema adiciona a lista.
        Se foi, solicitar novo número.
    Fim Repita

    Sistema compara todos os números adicionado a lista e imprime os dois maiores

 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        int countador = 1;
       List<Double> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        double ultimoMaior = 0;
        double maior = 0;

        while (countador <= 10){
            System.out.println("Informe um número: ");
            Double numero = scanner.nextDouble();
            lista.add(numero);
            for (Double numero1 : lista) {
                if (numero >= numero1 && numero >= maior){
                    ultimoMaior = maior;
                    maior = numero;
                }
            }
            for (Double numero2 : lista){
                if (numero2 != maior) {
                    if (numero2 >= ultimoMaior){
                        ultimoMaior = numero2;
                    }
                }
            }

            countador++;
        }

        System.out.println("O dois maiores números são: "+ultimoMaior+" "+maior);

    }
}