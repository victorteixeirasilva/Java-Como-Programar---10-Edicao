/*
   5.12 - (Calculando o produto de números inteiros ímpares) Escreva um aplicativo que calcula o produto dos números
   inteiros ímpares   de 1 a 15.
 */

import javax.swing.*;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        int produto = 1;
        for (int i = 1; i <= 15; i += 2){
            produto *= i;
        }
        JOptionPane.showMessageDialog(null, "O produto dos números ímpares de 1 a 15 é: " + produto);
    }
}