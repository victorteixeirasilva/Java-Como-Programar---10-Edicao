// Figura 10.4: Employee.java
// Superclasse abstrata Employee.

public abstract class Employee
{
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private final Date birthDate;

    // construtor
    public Employee(String firstName, String lastName,
                    String socialSecurityNumber, Date birthDate)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.birthDate = birthDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    // retorna o nome
    public String getFirstName()
    {
        return firstName;
    }

    // retorna o sobrenome
    public String getLastName()
    {
        return lastName;
    }

    // retorna o número do seguro social
    public String getSocialSecurityNumber()
    {
        return socialSecurityNumber;
    }

    // retorna a representação de String do objeto Employee
    @Override
    public String toString()
    {
        return String.format("%s %s%nsocial security number: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber());
    }

    // O método abstract deve ser sobrescrito pelas subclasses concretas
    public abstract double earnings(); // nenhuma implementação aqui
} // fim da classe abstrata Employee