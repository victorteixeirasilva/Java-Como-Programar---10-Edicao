import javax.swing.*;

/*

    Uma questão relacionada à assistência médica discutida ultimamente nos veículos de comunicação é a computadorização
dos registros de saúde. Essa possibilidade está sendo abordada de maneira cautelosa por causa da preocupação quanto à
privacidade e à segurança de dados sigilosos, entre outros motivos. [Iremos discutir essas preocupações em exercícios
posteriores.] A computadorização dos registros de saúde pode facilitar que pacientes compartilhem seus perfis e histórico
de saúde entre vários profissionais de saúde. Isso talvez aprimore a qualidade da assistência médica, ajude a evitar
conflitos e prescrições erradas de medicamentos. reduza custos ambulatórios e salve vidas. Neste exercício, você projetará
uma classe HealthProfile "inicial" para uma pessoa. Os atributos da classe devem incluir nome, sexo, data de nascimento
(consistindo em atributos separados para mês, dia e ano de nascimento), altura (em metros) e peso (em quilogramas) da pessoa.
Sua classe deve ter um construtor que receba esses dados. Para cada atributo, forneça métodos set e get. A classe também
deve incluir métodos que calculem e retornem a idade do usuário em anos, intervalo de frequência cardíaca máxima e
frequencia cardíaca alvo (Veja o Exercício 3.16), além de massa corporal (IMC; veja o Exercício 2.33). Escreva um aplicativo
Java que solicite as informações da pessoa, instancie um objeto da classe HealthProfile para ela e imprima as informações
a partir desse objeto - Incluindo nome, sobrenome, sexo, data de nascimento, altura e peso da pessoa -, e então calcule e
imprima a idadde em anos, IMC, intervalo de frequência cardíaca máxima e frequência cardíaca alvo. Ele também deve exibir
o gráfico de valores IMC do Exercício 2.33

Use JOptionPane

Anotações para solução:

    Escreva um aplicativo Java que solicite as informações da pessoa, instancie um objeto da classe HealthProfile para
ela e imprima as informações a partir desse objeto - Incluindo nome, sobrenome, sexo, data de nascimento, altura e peso
da pessoa -, e então calcule e imprima a idadde em anos, IMC, intervalo de frequência cardíaca máxima e frequência
cardíaca alvo. Ele também deve exibir o gráfico de valores IMC do Exercício 2.33

    1- Crie a Classe DateOfBirth semelhante a do 3.16

    2- A classe também deve incluir métodos que calculem e retornem a idade do usuário em anos

    2- Crie a classe HealthProfile "inicial" para uma pessoa.

    3- Os atributos da classe devem incluir nome, sexo, data de nascimento, altura (em metros) e peso (em quilogramas) da pessoa.

    4- Sua classe deve ter um construtor que receba esses dados. Para cada atributo

    5- forneça métodos set e get.

    6- Adapte a classe HeartRates para Usar o HealthProfile para os cálculos.

    7- Crie a classe Imc adptando o código do exercicio 2.33.

    8- Crie um Front-End em JOptionPane que solicite as informações (Nome, Sobrenome, Sexo, Data de Nascimento, Altura(Metros) e Peso(Quilogramas)).

    9- Crie um Front-End em JOptionPane que mostre as informações pessoais
    (Nome, Sobrenome, Sexo, Data de Nascimento, Altura, Peso,
    Idade em Anos, IMC, frequência cardiaca maxima, intervalo de frequencia alvo e Grafico de valores IMC).


 */
/**
 * @author Victor Teixeira Silva
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,
                "Bem Vindo! \n" +
                        "Computadorização Dos Registros de Saúde \n" +
                        "Desenvolvido por: Victor Teixeira Silva \n" +
                        "Versão 1.0");

        String firtsName = JOptionPane.showInputDialog("Informe seu primeiro nome:");
        String lastName = JOptionPane.showInputDialog("Informe seu sobrenome:");
        String sex = JOptionPane.showInputDialog("Informe seu sexo (F = Feminino / M = Masculino):");
        String year = JOptionPane.showInputDialog("Informe o ano em que você nasceu (Exemplo = 2003):");
        String month = JOptionPane.showInputDialog("Informe o mês em que você nasceu (Exemplo = 8):");
        String day = JOptionPane.showInputDialog("Informe o dia em que você nasceu (Exemplo = 23):");
        String height = JOptionPane.showInputDialog("Informe a sua altura em metros (Exemplo = 1.73):");
        String weight = JOptionPane.showInputDialog("Informe a seu peso em quilogramas (Exemplo = 72.5):");

        DateOfBirth dateOfBirth = new DateOfBirth(Integer.parseInt(day),Integer.parseInt(month),Integer.parseInt(year));

        HealthProfile healthProfile = new HealthProfile(firtsName,lastName,sex,dateOfBirth,Double.parseDouble(height),Double.parseDouble(weight));


        //(Nome, Sobrenome, Sexo, Data de Nascimento, Altura, Peso,
        //Idade em Anos, IMC, frequência cardiaca maxima,
        // intervalo de frequencia alvo e Grafico de valores IMC).

        JOptionPane.showMessageDialog(null,
                "\n" +
                        "\n" +
                        "Nome: " + healthProfile.getFirstName() + " " + healthProfile.getLastName() + ",\n" +
                        "Sexo: " + healthProfile.getSexo() + ",\n" +
                        "Data de Nascimento: " + dateOfBirth + ",\n" +
                        "Altura: " + healthProfile.getHeight() + " metros,\n" +
                        "Peso: " + healthProfile.getHeight() + " quilogramas, \n" +
                        "Idade em Anos: " + dateOfBirth.ageInYears() + " anos,\n" +
                        "IMC:" + Imc.myIMC(healthProfile) + ",\n" +
                        "Frequência Cardiaca Maxima: " + HeartRates.maximumHeartRate(healthProfile) + ",\n" +
                        "Intervalo de fequencia alvo: " + HeartRates.targetHeartRate(healthProfile) + ",\n" +
                        "Abaixo segue grafico IMC para comparação:\n" + Imc.showImcGraph() + "\n" +
                        "\n" +
                        "\n");











    }
}