public class HourlyEmployee extends Employee {
    private double hours; // horas trabalhadas
    private double wage; // salário por hora

    // Construtor
    public HourlyEmployee(String firstName, String lastName,
                          String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);

        // Validações para salário por hora e horas trabalhadas
        if (wage < 0.0) {
            throw new IllegalArgumentException("Wage must be >= 0.0");
        }

        if (hours < 0.0 || hours > 168.0) { // máximo de horas em uma semana
            throw new IllegalArgumentException("Hours must be >= 0.0 and <= 168.0");
        }

        this.wage = wage;
        this.hours = hours;
    }

    // Configura o salário por hora
    public void setWage(double wage) {
        if (wage < 0.0) {
            throw new IllegalArgumentException("Wage must be >= 0.0");
        }
        this.wage = wage;
    }

    // Retorna o salário por hora
    public double getWage() {
        return wage;
    }

    // Configura as horas trabalhadas
    public void setHours(double hours) {
        if (hours < 0.0 || hours > 168.0) {
            throw new IllegalArgumentException("Hours must be >= 0.0 and <= 168.0");
        }
        this.hours = hours;
    }

    // Retorna as horas trabalhadas
    public double getHours() {
        return hours;
    }

    // Calcula os rendimentos
    @Override
    public double earnings() {
        if (hours <= 40.0) {
            return wage * hours; // sem horas extras
        } else {
            return (40 * wage) + ((hours - 40) * wage * 1.5); // horas extras
        }
    }

    // Retorna a representação de String de HourlyEmployee
    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
                "hourly employee", getFirstName(), getLastName(),
                "social security number", getSocialSecurityNumber(),
                "hourly wage", getWage(),
                "hours worked", getHours(),
                "earnings", earnings());
    }
}