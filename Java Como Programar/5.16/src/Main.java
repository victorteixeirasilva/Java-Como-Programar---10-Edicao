/*
    5.16 (Gráfico de barras do programa de impressão) Uma aplicação interessante dos computadores é exibir diagramas e
    gráficos de barras. Escreva um aplicativo que leia cinco números entre 1 e 30. Para cada número que é lido, seu
    programa deve exibir o mesmo número de asteriscos adjacentes. Por exemplo, se seu programa lê o número 7, ele deve
    exibir *******. Exiba barras dos asteriscos depois de ler os cinco números.
 */

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {

        List<Integer> graficos = new ArrayList<Integer>();

        for (int i = 1; i <= 5; i++){
            String numeroString = JOptionPane.showInputDialog("Informe o número de 1 a 30:");
            int numero = Integer.parseInt(numeroString);
            if ((numero >= 1) && (numero <= 30)) {
                graficos.add(i);
            } else {
                JOptionPane.showMessageDialog(null, "O número tem que estar entre 1 e 30.");
            }
        }

        String resultado = "\n" + "Grafico em Barra\n";
        for (int numero : graficos){
            for (int i = 1; i<=numero; i++){
                resultado += "*";
            }
            resultado += "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);


    }
}