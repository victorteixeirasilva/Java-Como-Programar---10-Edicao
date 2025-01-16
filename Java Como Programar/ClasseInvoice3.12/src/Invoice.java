/*

    @Autor: Victor Teixeira Silva

    (Classe Invoice) Crie uma classe chamada Invoice para que uma loja de suprimentos de informática a utilize para representar
    uma fatura de um item vendido nela. Uma Invoice (fatura) deve incluir quatro partes das informações como variáveis de instância -
    O número (tipo String), a descrição (tipo String), a quantidade comprada detro variáveis de instância.
    um item (tipo int) e o preço por item (double).
    Sua classe deve ter um construtor que inicializa as quatro e forneça um método set e get para cada uma variável
    de instáncia. Além disso, forneça um método chamado getInvoiceAmount que calcula o valor da fatura (insto é, multiplica a quantidade
    pelo preço por item) e depois retorna esse valor como double. Se a quantidade não for positiva, ela deve ser configurada como 0.
    Se o preço por item não for positivo, ele deve ser configurado como 0.0. Escreva um aplicativo chamado InvoiceTest que demonstra as
    capacidades da classe invoice.

 */

public class Invoice {


    //Variáveis de Instância.
    private String invoice;
    private String description;
    private int quantity;
    private double value;

    //Construtor que recebe as 4 variáveis de instância
    public Invoice(String invoice, String description, int quantity, double value){
        this.invoice = invoice;
        this.description = description;
        this.quantity = quantity;
        this.value = value;
    }

    public double getInvoiceAmount(Invoice invoice){

        double invoiceAmount = 0.00;
        if(invoice.quantity <= 0){
            if (invoice.value <= 0) {
                invoiceAmount = 0;
            } else {
                invoiceAmount = 0.00*invoice.value;
            }
        } else if (invoice.value <= 0) {
            invoiceAmount = invoice.quantity*0.00;
        } else {
            invoiceAmount = invoice.quantity*invoice.value;
        }

        return invoiceAmount;
    }

    //Métodos set e get.
        //Métodos set.
    public void setInvoice(String invoice){
        this.invoice = invoice;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public void setValue(double value){
        this.value = value;
    }
        //Métodos get.
    public String getInvoice(){
        return invoice;
    }

    public String getDescription(){
        return description;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getValue(){
        return value;
    }

}
