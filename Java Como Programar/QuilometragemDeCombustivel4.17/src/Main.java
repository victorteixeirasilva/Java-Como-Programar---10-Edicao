/*
    Para os exercícios de 4.17 a 4.20, execute cada um dos seguintes passos:
        a) Leia a declaração do problema. ok
        b) Formule o algoritmo utilizando pseudocódigo e refinamento passo a passo de cima para baixo (top-down stepwise). ok
        c) Escreva um programa Java.
        d) Teste, depure e execute o programa Java.
        e) Processe três conjuntos completos de dados.

    (Quilometragem de combustível) Os motoristas se proecupam com a quilometragem obtida por seus automóveis.
Um motorista monitorou várias viagens registrando a quilometragem dirigida e a quantidade de combustível em litros
utilizados para cada tanque cheio. Desenvolva um aplicativo Java que receba como entrada os quilômetros dirigidos e os
litros de gasolina consumidos (ambos como inteiros) para cada viagem. O programa deve calcular e exibir o consumo em
quilômetros/litros para cada viagem e imprimir a quilometragem total e a soma total de litros de combustível consumidos
até esse ponto para todas as viagens. Todos os cálculos de média devem produzir resultados de ponto flutuante. Utilize
a classe JOp e repetição controlada por sentinela para obter os dados do usuário.

Anotações:
    -> O programa deve receber a quilometragem rodada e os litros consumidos de cada viagem e retornar a media de km/l de
cada viagem e ao fim do programa, mostrar o total de km e de litros de todas as viagens.

    -> Repetir processo de receber os dados da viagem até que o usuário digite -1

       Sistema soma os totais e exibe ao usuário.

    -> Repetir processo até que o usuário digite -1
            Usuário informa o km percorridos na viagem
            Usuário informa a quantidade de combustivel consumido
            Sistema soma essas informações no total
            Sistema exibe média km/l

       Sistema soma os totais e exibe ao usuário.


 */

import javax.swing.*;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        int sentinela = 0;
        int totalKm = 0;
        int totalL = 0;
        while (sentinela != -1) {
          String quilometragem = JOptionPane.showInputDialog("Quantos Km percorreu na viagem?");
          String litros = JOptionPane.showInputDialog(null, "Quantos litros de gasolina gastou?");

          double mediaKmL = (double) Integer.parseInt(quilometragem)/Integer.parseInt(litros);

          totalL += Integer.parseInt(litros);
          totalKm += Integer.parseInt(quilometragem);

          JOptionPane.showMessageDialog(null, "A média de KM/L da sua viagem foi "+mediaKmL);
          String opcao = JOptionPane.showInputDialog("Digite (s) caso queira ver a soma e a média de todas as viagens.\n" +
                                                    "Caso queira continuar adicionando viagens, digite (n)");
          if (opcao.equalsIgnoreCase("s")){
              sentinela = -1;
          }
        }
        JOptionPane.showMessageDialog(null,
                "\n" +
                        "No total você percorreu " + totalKm + " Quilometros.\n" +
                        "No total você gastou " + totalL + " Litros de gasolina.\n" +
                        "Sua média de KM/L no total foi: "  + (double) totalKm/totalL + ".\n"+
                        "\n");

    }
}