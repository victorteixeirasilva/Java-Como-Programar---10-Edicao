// Figura 3.8: Account.java
// Classe Account com uma variável de instância balance do tipo double e um construtor.
// e método deposit que executa a validação.

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
