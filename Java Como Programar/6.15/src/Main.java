/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 6.15 - ( is argumentos do tipo double e retornar a hipotenusa como double. Incorpore esse método a um
 *              aplicativo que lê valores de side1 e side2 e realiza como cálculo com o método hypotenuse. Utilize os
 *              métodos Math pow e sqrt para determinar o tamanho da hipotenusa de cada um dos triângulos na figura
 *              6.15. [Observação: a classe Math também fornece o método hypot para realizar esse cálculo.]
 *              | Triângulo | Lado 1 | Lado 2 |
 *              |    ---    |   ---  |   ---  |
 *              | 1         | 3.0    | 4.0    |
 *              | 2         | 5.0    | 12.0   |
 *              | 3         | 8.0    | 15.0   |
 */
public class Main {
    public static void main(String[] args) {

        System.out.println(hypotenuse(3.0, 4.0));
        System.out.println(hypotenuse(5.0, 12.0));
        System.out.println(hypotenuse(8.0, 15.0));

    }
    public static double hypotenuse(double side1, double side2){
        double hypotenuse = 0;

        hypotenuse = Math.sqrt(Math.pow(side1, 2.0) + Math.pow(side2, 2.0));

        return hypotenuse;
    }
}