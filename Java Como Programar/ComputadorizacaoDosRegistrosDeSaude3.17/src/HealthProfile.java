/*
    2- Crie a classe HealthProfile "inicial" para uma pessoa.

    3- Os atributos da classe devem incluir nome, sexo, data de nascimento, altura (em metros) e peso (em quilogramas) da pessoa.

    4- a sua classe deve ter um construtor que receba esses dados. Para cada atributo

    5- forneça métodos set e get.

 */
/**
 * @author Victor Teixeira Silva
 * @version 1.0
 */
public class HealthProfile {

    private String firstName;
    private String lastName;
    private String sexo;
    private DateOfBirth dateOfBirth;
    private double height;
    private double weight;

    public HealthProfile(String firstName, String lastName, String sexo, DateOfBirth dateOfBirth, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        if(sexo.equalsIgnoreCase("m")) {
        this.sexo = "MASCULINO";
        } else if (sexo.equalsIgnoreCase("f")) {
        this.sexo = "FEMININO";
        }
        this.dateOfBirth = dateOfBirth;
        this.height = height;
        this.weight = weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if(sexo == "m" || sexo == "M") {
            this.sexo = "MASCULINO";
        } else if (sexo == "f" || sexo == "F") {
            this.sexo = "FEMININO";
        }
    }

    public DateOfBirth getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(DateOfBirth dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
