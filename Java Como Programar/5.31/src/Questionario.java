import java.util.Scanner;

public class Questionario {

    private int resposta1;
    private int resposta2;
    private int resposta3;
    private int resposta4;
    private int resposta5;
    private Scanner scanner = new Scanner(System.in);

    private void resultado(int qtdAcertos){
        switch (qtdAcertos) {
            case 5:
                System.out.println("\nExcelente!\n");
                break;
            case 4:
                System.out.println("\nMuito bom!\n");
                break;
            default:
                System.out.println(
                        "\nÉ o momento de aprimorar seu conhecimento sobre o aquecimento global. \n" +
                        "O aquecimento global é um problema sério que afeta a todos nós, e é \n" +
                        "importante que estejamos informados para tomarmos decisões conscientes \n" +
                        "e contribuirmos para a construção de um futuro melhor. Consulte os sites \n" +
                        "listados abaixo para aprender mais sobre o tema."
                );
        }
    }

    private int qtdDeAcertos(int resposta1, int resposta2, int resposta3, int resposta4, int resposta5){
        int qtdAcertos = 0;

        if (resposta1 == 2){
            qtdAcertos++;
        }
        if (resposta2 == 3) {
            qtdAcertos++;
        }
        if (resposta3 == 1) {
            qtdAcertos++;
        }
        if (resposta4 == 2) {
            qtdAcertos++;
        }
        if (resposta5 == 3) {
            qtdAcertos++;
        }

        return qtdAcertos;
    }

    private int validarResposta(int resposta){
        if (resposta >= 5 || resposta <= 0){
            System.out.println("\nResposta Invalida!\n");
            return 0;
        }
        return resposta;
    }

    public Questionario() {
        setResposta1();
        setResposta2();
        setResposta3();
        setResposta4();
        setResposta5();
        resultado(qtdDeAcertos(this.resposta1, this.resposta2, this.resposta3, this.resposta4, this.resposta5));
    }


    public void setResposta1() {
        System.out.println(
                "\nQual das seguintes opções descreve melhor o consenso científico sobre o aquecimento global?\n" +
                        "\n" +
                        "1 - A maioria dos cientistas concorda que o aquecimento global é um fenômeno natural sem influência humana.\n" +
                        "2 - A maioria dos cientistas concorda que o aquecimento global é real e causado principalmente por atividades humanas.\n" +
                        "3 - Não há consenso científico sobre o aquecimento global.\n" +
                        "4 - O aquecimento global é uma farsa inventada por políticos e cientistas. \n"
        );
        System.out.print("\nInforme o número da sua resposta:");
        this.resposta1 = validarResposta(scanner.nextInt());
        if (resposta1 == 0){
            setResposta1();
        }
    }


    public void setResposta2() {
        System.out.println(
                "\nQual das seguintes atividades humanas contribui significativamente para o aumento do efeito estufa?\n" +
                        "\n" +
                        "1 - Uso de energias renováveis, como solar e eólica.\n" +
                        "2 - Reflorestamento e plantio de árvores.\n" +
                        "3 - Queima de combustíveis fósseis, como carvão, petróleo e gás natural.\n" +
                        "4 - Uso de transporte público e bicicletas."
        );

        System.out.print("\nInforme o número da sua resposta:");
        this.resposta2 = validarResposta(scanner.nextInt());
        if (resposta2 == 0){
            setResposta2();
        }
    }


    public void setResposta3() {
        System.out.println(
                "\nQuais são algumas das possíveis consequências do aquecimento global?\n" +
                        "\n" +
                        "1 - Aumento do nível do mar, eventos climáticos extremos mais frequentes e intensos, e mudanças nos padrões de precipitação.\n" +
                        "2 - Diminuição do nível do mar, redução da frequência de eventos climáticos extremos e aumento da produtividade agrícola.\n" +
                        "3 - Não há evidências de que o aquecimento global cause quaisquer consequências significativas.\n" +
                        "4 - O aquecimento global é benéfico para o planeta, pois aumenta a biodiversidade e a área de terras cultiváveis."
        );

        System.out.print("\nInforme o número da sua resposta:");
        this.resposta3 = validarResposta(scanner.nextInt());
        if (resposta3 == 0){
            setResposta3();
        }
    }


    public void setResposta4() {
        System.out.println(
                "\nO que é o Painel Intergovernamental sobre Mudanças Climáticas (IPCC)?\n" +
                        "\n" +
                        "1 - Uma organização de céticos do aquecimento global que busca desacreditar a ciência climática.\n" +
                        "2 - Um grupo de cientistas da ONU que avalia as pesquisas sobre mudanças climáticas e publica relatórios sobre o tema.\n" +
                        "3 - Uma empresa de energia que investe em tecnologias para reduzir as emissões de gases de efeito estufa.\n" +
                        "4 - Uma organização não governamental que promove a educação ambiental e o consumo consciente."
        );

        System.out.print("\nInforme o número da sua resposta:");
        this.resposta4 = validarResposta(scanner.nextInt());
        if (resposta4 == 0){
            setResposta4();
        }
    }


    public void setResposta5() {
        System.out.println(
                "\nO que você pode fazer para contribuir para a redução do aquecimento global?\n" +
                        "\n" +
                        "1 - Usar apenas carros a gasolina, pois são mais potentes e eficientes.\n" +
                        "2 - Ignorar o problema, pois as ações individuais não fazem diferença.\n" +
                        "3 - Adotar práticas sustentáveis no dia a dia, como economizar energia, usar transporte público ou bicicleta, reduzir o consumo de carne, e apoiar empresas que se preocupam com o meio ambiente.\n" +
                        "4 - Acreditar que a tecnologia resolverá todos os problemas ambientais, sem necessidade de mudanças em nossos hábitos."
        );

        System.out.print("\nInforme o número da sua resposta:");
        this.resposta5 = validarResposta(scanner.nextInt());
        if (resposta5 == 0){
            setResposta5();
        }
    }
}
