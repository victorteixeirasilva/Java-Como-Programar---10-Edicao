/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description Qual o valor de x depois que cada uma das seguintes instruções é executada?
 *                  x = Math.abs(7.5);
 *                  x = Math.floor(7.5);
 *                  x = Math.abs(0.0);
 *                  x = Math.ceil(0.0);
 *                  x = Math.abs(-6.4);
 *                  x = Math.ceil(-6.4);
 *                  x = Math.ceil(-Math.abs(-8 + Math.floor(-5.5)));
 */
public class Main {
    public static void main(String[] args) {
        double x;
        x = Math.abs(7.5);
        System.out.println("x = "+x);

        x = Math.floor(7.5);
        System.out.println("x = "+x);

        x = Math.abs(0.0);
        System.out.println("x = "+x);

        x = Math.ceil(0.0);
        System.out.println("x = "+x);

        x = Math.abs(-6.4);
        System.out.println("x = "+x);

        x = Math.ceil(-6.4);
        System.out.println("x = "+x);

        x = Math.ceil(-Math.abs(-8 + Math.floor(-5.5)));
        System.out.println("x = "+x);

    }
}