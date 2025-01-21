/*
    Para os exercícios de 4.17 a 4.20, execute cada um dos seguintes passos:
        a) Leia a declaração do problema.
        b) Formule o algoritmo utilizando pseudocódigo e refinamento passo a passo de cima para baixo (top-down stepwise).
        c) Escreva um programa Java.
        d) Teste, depure e execute o programa Java.
        e) Processe três conjuntos completos de dados.

    (Calculador de limite de crédito) Desenvolva um aplicativo Java que determine se um cliente de uma loja de departamentos
exedeu o limite de crédito numa conta-corrente. Para cada cliente, os seguintes dados estão dosponíveis:
        a) Número de conta.
        b) Saldo no início do mês.
        c) Total de todos os itens cobrados desse cliente no mês.
        d) Total de créditos aplicados ao cliente no mês.
        e) Limite de crédito autorizado.
    O programa deve inserir todos esses dados como inteiros, calcular o novo saldo (=saldo inicial + despesas - créditos),
exibir o novo saldo e determinar se o novo saldo excede ao limite de crédito do cliente. Para aqueles clientes cujo
limite de crédito foi excedido, o programa deve exibir a mensagem "Limite de crédito excedido".

Anotações:
Para cada cliente:
    Ler número da conta
    Ler saldo inicial
    Ler total de itens cobrados
    Ler total de créditos aplicados
    Ler limite de crédito

    Calcular novo saldo = saldo inicial + itens cobrados - créditos aplicados

    Se novo saldo > limite de crédito então
        Exibir "Limite de crédito excedido"
    Senão
        Exibir "Novo saldo: ", novo saldo
    Fim se
Fim para

 */

import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Número da conta (0 para sair): ");
            int numeroConta = input.nextInt();

            if (numeroConta == 0) {
                break;
            }

            System.out.print("Saldo inicial: ");
            int saldoInicial = input.nextInt();
            System.out.print("Total de itens cobrados: ");
            int itensCobrados = input.nextInt();
            System.out.print("Total de créditos aplicados: ");
            int creditosAplicados = input.nextInt();
            System.out.print("Limite de crédito: ");
            int limiteCredito = input.nextInt();

            int novoSaldo = saldoInicial + itensCobrados - creditosAplicados;

            if (novoSaldo > limiteCredito) {
                System.out.println("Limite de crédito excedido.");
            } else {
                System.out.println("Novo saldo: " + novoSaldo);
            }
        }

        input.close();

    }
}