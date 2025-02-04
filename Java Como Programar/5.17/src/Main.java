/*
    5.17 - (Calculando vendas) Um varejista on-line vende cinco produtos cujos preços no varejo são como a seguir:
    produto 1, US$ 2,98; produto 2, US$ 4,50; produto 3, US$ 9,98; produto 4, US$ 6,87. Escreva um aplicativo que
    leia uma série de pares de números como segue:

    a) número do produto

    b) quantidade vendida

    Seu programa deve utilizar uma instrução switch para determinar o preço de varejo de cada produto. Você deve
    calcular e exibir o valor de varejo total de todos os produtos vendidos. Utilize um ‘loop’ controlado por sentinela
    para determinar quando o programa deve parar o ‘loop’ e exibir os resultados.
 */

import javax.swing.*;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto(1, 2.98);
        Produto produto2 = new Produto(2, 4.5);
        Produto produto3 = new Produto(3, 9.98);
        Produto produto4 = new Produto(4, 6.87);
        boolean sentinela = true;

        int quatidadeVendida1 = 0, quatidadeVendida2 = 0, quatidadeVendida3 = 0, quatidadeVendida4 = 0;


        while (sentinela){
            String opcaoString = JOptionPane.showInputDialog("Informe o número do produto: ( 1, 2, 3 ou 4 ) ou informe (-1) para exibir o resultado total.");
            switch (Integer.parseInt(opcaoString)){
                case 1:
                    quatidadeVendida1 = Integer.parseInt(
                            JOptionPane.showInputDialog("Informe a quantidade vendida do produto 1:"));
                    break;
                case 2:
                    quatidadeVendida2 = Integer.parseInt(
                            JOptionPane.showInputDialog("Informe a quantidade vendida do produto 2:"));
                    break;
                case 3:
                    quatidadeVendida3 = Integer.parseInt(
                            JOptionPane.showInputDialog("Informe a quantidade vendida do produto 3:"));
                    break;
                case 4:
                    quatidadeVendida4 = Integer.parseInt(
                            JOptionPane.showInputDialog("Informe a quantidade vendida do produto 4:"));
                    break;
                case -1:
                    sentinela = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Produto não encontrado!");
            }
        }

        JOptionPane.showMessageDialog(null,
                "\n" +
                        "Valor total vendido do produto 1: " + produto1.getValue()*quatidadeVendida1 + "\n" +
                        "Valor total vendido do produto 2: " + produto2.getValue()*quatidadeVendida2 + "\n" +
                        "Valor total vendido do produto 3: " + produto3.getValue()*quatidadeVendida3 + "\n" +
                        "Valor total vendido do produto 4: " +  produto4.getValue()*quatidadeVendida4 + "\n" +
                        "\n");



    }
}