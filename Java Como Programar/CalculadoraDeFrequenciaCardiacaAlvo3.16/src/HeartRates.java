/*
    @Autor Victor Teixeira Silva

    5- Os atributos da classe devem incluir o nome, sobrenome e data de nascimento da pessoa

    6- Sua classe deve ter um construtor que receba esses dados como parâmetros. Para cada atributo forneça métodos set e get.

    8- A classe HeartRates dete incluir um método que calcule e retorne a frequência cardíaca máxima

    9- A classe HeartRates dete incluir um método que calcule e retorne a frequência cardíaca alvo da pessoa.

    1- frquência cardiaca máxima por minuto é 220 menos a idade em anos.

    2- Sua frequência cardiaca alvo é um intervalo entre 50-85% da sua frequência cardíaca máxima.

 */
public class HeartRates {

    private String firstName;
    private String lastName;
    private DateOfBirth dateOfBirth;

    public HeartRates(String firstName, String lastName, DateOfBirth dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String targetHeartRate(){
        double targetHeartRate50 = maximumHeartRate()*0.5;
        double targetHeartRate85 = maximumHeartRate()*0.85;

        return targetHeartRate50 + "-" + targetHeartRate85;
    }

    public int maximumHeartRate() {
        int maximumHeartRate = 220 - dateOfBirth.ageInYears();
        return maximumHeartRate;
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

    public DateOfBirth getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(DateOfBirth dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
