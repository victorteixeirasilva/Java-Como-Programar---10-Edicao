import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 6.8 - (Taxas de estacionamento) Um estacionamento cobra uma tarifa mínima de R$ 2,00 para estacionar por
 *              até três horas. Um adicional de R$ 0,50 por hora não necessariamente inteira é cobrado após as três
 *              primeiras horas. A tarifa máxima para qualquer dado período de 24 horas é R$ 10,00. Suponha que nenhum
 *              carro fique estacionado por mais de 24 horas por vez. Escreva um aplicativo que calcule e exiba as
 *              tarifas de estacionamento para cada cliente que estacionou nessa garagem ontem. Você deve inserir as
 *              horas de estacionamento para cada cliente. O programa deve exibir a cobrança para o cliente atual e
 *              calcular e exibir o total dos recibos de ontem. Ele deve utilizar o método calculateCharges para
 *              determinar a tarifa para cada cliente.
 *
 */
public class Main {
    public static void main(String[] args) {

        double valorTotalFaturadoOntem = 0;
        int sentinela = 0;
        Scanner scanner = new Scanner(System.in);

        while (sentinela != -1){

            System.out.println("Informe 1 se deseja calcular tarifa e 2 se deseja finalizar e ver valor total de faturamento de ontem.");
            int opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Informe a quantidade de horas que o carro permaneceu no estacionamento: ");
                    double qtdHoras = scanner.nextDouble();
                    double valorTarifa = calculateCharges(qtdHoras);

                    System.out.println("O valor da tarifa que precisa ser paga é: "+valorTarifa);
                    valorTotalFaturadoOntem += valorTarifa;
                    break;
                case 2:
                    sentinela = -1;
                    break;
                default:
                    System.out.println("Opção invalida!");
            }


        }
        System.out.println("O faturamento de ontem foi: "+valorTotalFaturadoOntem);
        System.exit(1);




    }

    public static double calculateCharges(double qtdHoras) {
        double valor = 0.00;
        if (qtdHoras < 24) {
            valor = 2;
            if (qtdHoras > 3){
                valor = valor + (qtdHoras-3)*0.50;
            }
        } else {
            valor = 10.00;
        }
        return valor;
    }
}