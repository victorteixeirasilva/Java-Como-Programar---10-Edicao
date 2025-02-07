/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 5.33 (Crescimento da base de usuários do Facebook) De acordo com o CNNMoney.com o facebook alcançou um
 *              bilhão de usuários em outubro de 2012. Usando a técnica de crescimento composto que você aprendeu na
 *              Figura 5.6 e supondo que a base de usuários cresça a uma taxa de 4% ao mês, quantos meses levarão para
 *              que o Facebook aumente sua base de usuários para 1,5 bilhão? Quantos meses serão necessários para que o
 *              Facebook expanda sua base de usuários para dois bilhões?
 */
public class Main {
    public static void main(String[] args) {


        long user = 1000000000;
        long meta = 2000000000;

        for (long i = user; i <= meta; i = (long) (i+(i*0.4))){
            System.out.println(i);
        }

    }
}