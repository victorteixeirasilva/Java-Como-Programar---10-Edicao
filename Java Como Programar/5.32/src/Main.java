import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 5.32 - (Alternativas para o planejamento tributário; o “Imposto justo”) Há muitas propostas para tornar
 *              a tributação mais justa. Verifique a iniciativa FairTax norte-america em www.fairtax.org. Pesquise como
 *              o FairTax proposta funciona. Uma sugestão é eliminar imposto de renda e a maioria dos outros impostos a
 *              favor de um imposto de consumo de 23% sobre todos os produtos e serviços que você compra. Alguns
 *              oponentes do FairTax questionam o percentual de 23% e afirmam que, por causa da maneira como o imposto é
 *              calculado seria mais exato dizer que a taxa é 30% — verifique isso cuidadosamente. Escreva um programa
 *              que peça ao usuário para inserir despesas nas várias categorias de despesas que ele tem (por exemplo,
 *              moradia, alimentação, vestuário, transporte, educação, assistência médica e férias) e então imprima o
 *              FairTax estimado que a pessoa pagaria.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor da sua despesas:");
        double despesas = scanner.nextDouble();

        double fairtax = despesas*0.23;

        System.out.println("De acordo como FairTax, você deveria pagar um total de\n" +
                "R$ " + fairtax);
    }
}