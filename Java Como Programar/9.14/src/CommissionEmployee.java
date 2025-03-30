// Figura 9.10: CommissionEmployee.java
// A classe CommissionEmployee usa métodos para manipular suas
// variáveis de instância private.
public class CommissionEmployee extends Employee{
    private double grossSales; // vendas brutas semanais
    private double commissionRate; // porcentagem da comissãoÿ

    // construtor de cinco argumentos
    public CommissionEmployee(String firstName, String lastName,
                              String socialSecurityNumber, double grossSales,
                              double commissionRate) {
        // chamada implícita para o construtor Object ocorre aqui

        //
        super(firstName, lastName, socialSecurityNumber);

        // se grossSales é inválido, lança uma exceção
        if (grossSales < 0.0)
            throw new IllegalArgumentException(
                    "Gross sales must be >= 0.0");

        // se commissionRate é inválido, lança uma exceção
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException(
                    "Commission rate must be > 0.0 and < 1.0");

        super.setFirstName(firstName);
        super.setLastName(lastName);
        super.setSocialSecurityNumber(socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    } // fim do construtor


    // configura a quantidade de vendas brutas
    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0)
            throw new IllegalArgumentException(
                    "Gross sales must be >= 0.0");

        this.grossSales = grossSales;
    }

    // retorna a quantidade de vendas brutas
    public double getGrossSales() {
        return grossSales;
    }

    // configura a taxa de comissão
    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException(
                    "Commission rate must be > 0.0 and < 1.0");

        this.commissionRate = commissionRate;
    }

    // retorna a taxa de comissão
    public double getCommissionRate() {
        return commissionRate;
    }

    // calcula os lucros
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    // retorna a representação String do objeto CommissionEmployee
    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
                "commission employee", getFirstName(), getLastName(),
                "social security number", getSocialSecurityNumber(),
                "gross sales", getGrossSales(),
                "commission rate", getCommissionRate());
    }
} // fim da classe CommissionEmployee