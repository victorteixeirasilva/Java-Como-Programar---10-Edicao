/*
    (Localize o menor valor) Escreva um aplicativo que localiza o menor de vários números inteiros.
    Suponha que o primeiro valor lido especifica o número de valores a serem inseridos pelo usuário.
 */

import javax.swing.*;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {

        String quantidadeNumerosString = JOptionPane.showInputDialog(
                "Hoje vamos localizar o menor valor entre uma sequencia de números." +
                "\nEspecifique o número de valores que deseja inserir:");

        double quantidadeNumeros = Double.parseDouble(quantidadeNumerosString);
        double menorNumero = 0;

        if (quantidadeNumeros >= 2){
            for (int i = 1; i <= quantidadeNumeros; i++){
                String numeroString = JOptionPane.showInputDialog("Informe o número: ("+i+")");
                double numero = Double.parseDouble(numeroString);
                if (i == 1){
                    menorNumero = numero;
                } else if (numero < menorNumero) {
                    menorNumero = numero;
                }
            }
            JOptionPane.showMessageDialog(null, "O menor número informado foi: "+menorNumero);
        }


    }

}