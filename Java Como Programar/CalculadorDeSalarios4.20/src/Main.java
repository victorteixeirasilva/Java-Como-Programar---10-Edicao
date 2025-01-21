/*
    Para os exercícios de 4.17 a 4.20, execute cada um dos seguintes passos:
        a) Leia a declaração do problema.
        b) Formule o algoritmo utilizando pseudocódigo e refinamento passo a passo de cima para baixo (top-down stepwise).
        c) Escreva um programa Java.
        d) Teste, depure e execute o programa Java.
        e) Processe três conjuntos completos de dados.

    (Calculador de salários) Desenvolva um aplicativo Java que determina o salário bruto de cada um de três empregados.
A empresa paga as horas normais pelas primeiras 40 horas trabalhadas por cada funcionário e 50% a mais por todas as horas
trabalhadas além das 40 horas. Você recebe uma lista de empregados, o número de horas trabalhadas por eles na semana
passada e o salário-hora de cada um. Seu programa deve aceitar a entrada dessas informações para cada empregado e, então,
determinar e exibir o salário bruto do empregado. Utilize a classe Scanner par inserir os dados.

Anotações:
    Programa recebe informações de 3 empregados, e retorna o salário bruto do empregado.

    Repita 3 vezes
       Sistema recebe nome do empregado.
       Sistema recebe o número de horas trabalhadas na semana passsada.
       Sistema recebe o salário-hora.

       Sistema Calcula e Exibe o salário do empregado


 */

import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 1;

        while (count <= 3){
            System.out.println("Informe o nome do empregado: ");
            String nome = scanner.nextLine();
            System.out.println("Informe as horas trabalhadas na ultima semana: ");
            double numHoras = scanner.nextInt();
            System.out.println("Informe o valor do salario-hora: ");
            double salHora = scanner.nextInt();
            double horasExtras = 0;
            double salario;

            if (numHoras > 40){
                horasExtras = numHoras-40;
            }

            salario = salHora*40;
            salario += horasExtras*((salHora*0.5)+salHora);

            System.out.println(nome);
            System.out.println("Seu salário bruto é: "+salario);
            count++;
        }


    }
}