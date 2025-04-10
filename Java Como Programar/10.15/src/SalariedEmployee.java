/// Figura 10.5: SalariedEmployee.java
// A classe concreta SalariedEmployee estende a classe abstrata Employee.

public class SalariedEmployee extends Employee
{
    private double weeklySalary;

    // construtor
    public SalariedEmployee(String firstName, String lastName,
                            String socialSecurityNumber, double weeklySalary, Date date)
    {
        super(firstName, lastName, socialSecurityNumber, date);

        if (weeklySalary < 0.0)
            throw new IllegalArgumentException(
                    "Weekly salary must be >= 0.0");

        this.weeklySalary = weeklySalary;
    }

    // configura o salário
    public void setWeeklySalary(double weeklySalary)
    {
        if (weeklySalary < 0.0)
            throw new IllegalArgumentException(
                    "Weekly salary must be >= 0.0");

        this.weeklySalary = weeklySalary;
    }

    // retorna o salário
    public double getWeeklySalary()
    {
        return weeklySalary;
    }


    // retorna a representação String do objeto SalariedEmployee
    @Override
    public String toString()
    {
        return String.format("salaried employee: %s%n%s: $%,.2f",
                super.toString(), "weekly salary", getWeeklySalary());
    }

    @Override
    public double getPaymentAmount() {
        return getWeeklySalary();
    }
} // fim da classe SalariedEmployee