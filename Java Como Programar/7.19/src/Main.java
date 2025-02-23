import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 7.19 - (Sistema de reservas de passagens aéreas) Uma pequena companhia aérea acabou de comprar um
 *              computador para seu novo sistema automatizado de reservas. Você foi solicitado a desenvolver o novo
 *              sistema. Você escreverá um aplicativo para atribuir assentos em cada voo da companhia aérea (capacidade:
 *              10 assentos). Seu aplicativo deve exibir as seguintes alternativas: Please type 1 for First Class e
 *              Please type 2 for Economy. [Por favor digite 1 para Primeira Classe e digite 2 para Classe Econômica].
 *              Se o usuário digitar 1, seu aplicativo deve atribuir assentos na primeira classe (poltronas 1 a 5). Se o
 *              usuário digitar 2, seu aplicativo deve atribuir um assento na classe econômica (poltronas 6 a 10). Seu
 *              aplicativo deve exibir um cartão de embarque indicando o número da poltrona da pessoa e se ela está na
 *              primeira classe ou na classe econômica. Utilize um array unidimensional do tipo primitivo boolean para
 *              representar o gráfico de assentos do avião. Inicialize todos os elementos do array como false para
 *              indicar que todas as poltronas estão desocupadas. A medida que cada assento é atribuído, configure o
 *              elemento correspondente do array como true para indicar que o assento não está mais disponível. Seu
 *              aplicativo nunca deve atribuir uma poltrona que ja foi reservada. Quando a classe econômica estiver
 *              , seu aplicativo deve perguntar à pessoa se ela aceita ficar na primeira classe (e vice-versa). Se sim
 *              faça a atribuição apropriada de assento. Se não exiba a mensagem “NextFlight leaves in 3 hours” [ O
 *              próximo voo parte em 3 horas].
 */
public class Main {
    public static <exibindo> void main(String[] args) {
        //Iniciando o array para armazenar poltronas
        ArrayList<Boolean> assentos = new ArrayList<Boolean>(10);

        //Iniciando scanner para receber os dados.
        Scanner scanner = new Scanner(System.in);

        //Declarando os 10 objetos do array como false
        for (int i = 1; i <= 10; i++){
            assentos.add(false);
        }

        while (true) {
            // Instrução para entrada de dados.
            System.out.println("Please type 1 for First Class\n" +
                                "Please type 2 for Economy.\n" +
                                "[Por favor digite 1 para Primeira Classe e digite 2 para Classe Econômica]");

            boolean sentinela = true;
            while (sentinela){
                int opcao = scanner.nextInt();
                switch (opcao){
                    case 1:
                        //Exibir assentos diponíveis na primeira classe.
                        System.out.println("Os assentos como false estão disponíveis:");

                        //Exibindo poltronas
                        System.out.println("Poltrona    |   Ocupada?");
                        for (int a = 1; a <= 5; a++){
                            System.out.println(a + "        |       " + assentos.get(a-1));
                        }

                        //Selecionando Poltrona.
                        System.out.println("Dentre as poltronas disponíveis informadas, qual você deseja?");
                        int poltronaFirstClass = scanner.nextInt()-1;

                        boolean sentinela2 = true;
                        while (sentinela2) {
                            if (assentos.get(poltronaFirstClass)){
                                System.out.println("Poltrona ocupada, escolha outra!");
                            } else {
                                assentos.add(poltronaFirstClass, true);
                                sentinela2 = false;
                            }
                        }

                        //Exibindo cartão de embarque
                        System.out.println("\nCartão de Embarque:");
                        if (poltronaFirstClass <= 5){
                            System.out.println("Primeira Classe!");
                            int accento = poltronaFirstClass+1;
                            System.out.println("Poltrona: " + accento);
                        } else {
                            System.out.println("Classe Economica");
                            int accento = poltronaFirstClass+1;
                            System.out.println("Poltrona: " + accento);
                        }

                        sentinela = false;
                        break;
                    case 2:
                        //Exibir assentos diponíveis na classe economica.
                        System.out.println("Os assentos como false estão disponíveis:");

                        //Exibindo poltronas
                        System.out.println("Poltrona    |   Ocupada?");
                        for (int a = 6; a <= 10; a++){
                            System.out.println(a + "        |       " + assentos.get(a-1));
                        }

                        //Selecionando Poltrona.
                        System.out.println("Dentre as poltronas disponíveis informadas, qual você deseja?");
                        int poltrona = scanner.nextInt()-1;

                        boolean sentinela3 = true;
                        while (sentinela3) {
                            if (assentos.get(poltrona)){
                                System.out.println("Poltrona ocupada, escolha outra!");
                            } else {
                                assentos.add(poltrona, true);
                                sentinela3 = false;
                            }
                        }

                        //Exibindo cartão de embarque
                        System.out.println("\nCartão de Embarque:");
                        if (poltrona <= 5){
                            System.out.println("Primeira Classe!");
                            int accento = poltrona+1;
                            System.out.println("Poltrona: " + accento);
                        } else {
                            System.out.println("Classe Economica");
                            int accento = poltrona+1;
                            System.out.println("Poltrona: " + accento);
                        }

                        sentinela = false;
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            }
        }



    }
}