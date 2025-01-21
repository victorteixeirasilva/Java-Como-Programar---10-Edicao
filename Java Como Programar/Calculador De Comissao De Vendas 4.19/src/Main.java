
/*
    Para os exercícios de 4.17 a 4.20, execute cada um dos seguintes passos:
        a) Leia a declaração do problema.
        b) Formule o algoritmo utilizando pseudocódigo e refinamento passo a passo de cima para baixo (top-down stepwise).
        c) Escreva um programa Java.
        d) Teste, depure e execute o programa Java.
        e) Processe três conjuntos completos de dados.

    (Calculador de comissão de vendas) Uma grande empresa paga seu pessoal de vendas com base em comissões. O pessoal de
vendas recebe R$ 200 por semana mais 9% de suas vendas brutas durante esse período. Por exemplo, um vendedor que realiza
um total de vendas de mercadorias R$ 5000 em uma semana recebe R$ 200 mais 9% de R$ 5.000, um total de R$ 650. Foi-lhe
fornecida uma lista dos itens vendidos por cada vendedor. Os valores desses itens são como segue:

    item | value
    1       239.99
    2       129.75
    3       99.95
    4       350.89

    Desenvolva um aplicativo Java que recebe entrada de itens vendidos por um vendedor durante a última semana e calcula
e exibe os rendimentos do vendedor. Não existe nenhum limite para o número de itens que pode ser vendido.

Anotações:
Iniciar
    Definir constante COMISSAO_PERCENTUAL = 9%
    Definir constante SALARIO_BASE = 200
    Definir variáveis:
        valorTotalVendas, item, valorItem, salarioTotal

    Inicializar valorTotalVendas com 0

    Repetir
        Ler item
        Se item diferente de 0 então
            Obter valorItem baseado no item
            Adicionar valorItem a valorTotalVendas
        Senão
            Sair do loop
        Fim se
    Até que item seja igual a 0

    Calcular comissao = valorTotalVendas * COMISSAO_PERCENTUAL
    Calcular salarioTotal = SALARIO_BASE + comissao

    Exibir "Salário total: R$", salarioTotal
Fim

 */

import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        final double COMISSAO_PERCENTUAL = 0.09;
        final double SALARIO_BASE = 200;

        Scanner input = new Scanner(System.in);

        double valorTotalVendas = 0;
        int item;

        System.out.println("Digite o número do item (0 para sair): ");
        while ((item = input.nextInt()) != 0) {
            switch (item) {
                case 1:
                    valorTotalVendas += 239.99;
                    break;
                case 2:
                    valorTotalVendas += 129.75;
                    break;
                case 3:
                    valorTotalVendas += 99.95;
                    break;
                case 4:
                    valorTotalVendas += 350.89;
                    break;
                default:
                    System.out.println("Item inválido.");
            }
            System.out.print("Digite o próximo item (0 para sair): ");
        }

        double comissao = valorTotalVendas * COMISSAO_PERCENTUAL;
        double salarioTotal = SALARIO_BASE + comissao;

        System.out.printf("Salário total: R$%.2f%n", salarioTotal);

        input.close();
    }
}