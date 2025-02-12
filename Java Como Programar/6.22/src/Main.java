import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 6.22 - (Conversão de temperatura) Implemente os seguintes métodos inteiros:
 *              A) O método celsius retorna o equivalente em Celsius de uma temperatura em Fahrenheit utilizando o cálculo
 *                  celsius = 5.0 / 9.0 * (fahrenheit - 32);
 *              B) O método fahrenheit retorna o equivalente em Fahrenheit de uma temperatura em Celsius utilizando o cálculo:
 *                  fahrenheit = 9.0 / 5.0 * celsius + 32;
 *              C) Utilize os métodos nas partes (a) e (b) para escrever um aplicativo que permite ao usuário inserir uma
 *              temperatura em Fahrenheit e exibir o equivalente em Celsius ou inserir uma temperatura em Celsius e exibir
 *               o equivalente em Fahrenheit.
 */
public class Main {
    public static double celsius(double fahrenheit){
        return 5.0 / 9.0 * (fahrenheit -32);
    }
    public static double fahrenheit(double celsius){
        return 9.0 / 5.0 * celsius + 32;
    }
    public static void menu(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe conversão que desa fazer:");
        System.out.println("1 - Fahrenheit -> Celsius");
        System.out.println("2 - Celsius -> Fahrenheit");

        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.print("Informe a temperatura em Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                System.out.println("A temperatura em graus Celsius é: " + celsius(fahrenheit));
                break;
            case 2:
                System.out.print("Informe a temperatura em Celsius: ");
                double celsius = scanner.nextDouble();
                System.out.println("A temperatura em Fahrenheit é: " + fahrenheit(celsius));
                break;
            default:
                System.out.println("Opção invalida!");
                menu();
        }
    }
    public static void main(String[] args) {
        menu();
    }
}