// Figura 3.8: Account.java
/*

    (Removendo código duplicado no método main) Na classe AccountTest da Figura 3.9 o método main contém seis instruçõess
e cada uma exibe name e balance do objeto Account. Estude essas instruções e você perceberá que elas só dizem no objeto
Account sendo manipulado - Account1 ou Account2. Neste exercício, Você difinirá um novo método displayAccount que contém
uma cópia dessa instrução de saída. O parametro do método será um objeto Account e o método irá gerar name e balance dele.
Então você substiruirá as seis instruções duplicadas em main por chamadas para displayAccount passando como argumento o
objeto específico Account para saída.
    Modifique a classe AccountTest da Figura 3.9 para declarar o seguinte método displayAccount após a chave direita de
fechamento de main antes da chave direita de fechamento da classe AccountTest:

public static void displayAccount(Account accountToDisplay){
        // coloque aqui a instrução que exibe
        // o name e o balance de accountToDisplay
}

    Substitua o comentário no corpo do método por uma instrução que exiba name e balance de accountToDisplay.
Le mbre-se de que main é um método static, assim pode ser chamado sem antes criar um objeto da classe em que é declarado.
Também declaramos p método displayAccount como método static. Quando main tem de chamar outro método na mesma classe
sem antes criar um objeto dela, o outro método também deve ser declarado static.


 */

public class Account {

    private String name; // Variavel de instância
    private double balance;

    //Construtor de Account que recebe dois parâmetros
    public Account(String name, double balance){
        this.name = name;// Atribui name á variavel de instância name.

        // Valida que o balance é maior que 0.0; se não for.
        // a variável de instância balance mantém seu valor inicial padrão de 0.0.
        if (balance > 0.0){ // se o saldo for válido
            this.balance = balance;
        }

    }

    //Modifique a classe Account (Figura 3.8) para fornecer um método chamado withdraw que retira dinheiro de uma Account.
    //Assegure que o valor de débito não exceda o saldo de Account. Se exceder o saldo deve ser deixado inalterado e o método
    //deve imprimir uma mensagem que indica "Withdrawal amount exceeded account balance"
    public void withdrawal(double withdrawalAmount){
        if (withdrawalAmount <= balance) {
            balance = balance - withdrawalAmount;
        } else {
            System.out.println("Withdrawal amount exceeded account balance");
        }

    }


    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) //Se depositAmount for válido
            this.balance = balance + depositAmount; // O adiciona ao saldo
    }

    public double getBalance(){
        return balance;
    }

    //Método que define o nome
    public void setName(String name){
        this.name = name;
    }

    //Método que retorna o nome
    public String getName(){
        return name;// Retorna o valor de name ao chamador
    } // Fim do método getName.
} // Fim da classe Account
