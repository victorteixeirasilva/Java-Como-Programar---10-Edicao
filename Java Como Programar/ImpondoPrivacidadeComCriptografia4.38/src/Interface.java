import javax.swing.*;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 */
public class Interface {

    public static String bemVindo(){
        return JOptionPane.showInputDialog(
                "BEM VINDO AO NOSSO SOFTWARE DE CRIPTOGRAFIA! \n" +
                        "1 - Para criptografar dados. \n" +
                        "2 - Para descriptografar dados."
        );
    }

    public static void criptografar() {
        String dado = JOptionPane.showInputDialog("Informe o número de 4 digitos que deseja criptografar:");
        if (dado.length()!=4){
            JOptionPane.showMessageDialog(null,"Você não digitou um número de 4 digitos!");
            criptografar();
        }
        Criptigrafia.criptografar(Integer.parseInt(dado));
    }

    public static void descriptografar() {
        String dado = JOptionPane.showInputDialog("Informe o número que deseja descriptografar:");
        Criptigrafia.descriptografar(Integer.parseInt(dado));
    }
}
