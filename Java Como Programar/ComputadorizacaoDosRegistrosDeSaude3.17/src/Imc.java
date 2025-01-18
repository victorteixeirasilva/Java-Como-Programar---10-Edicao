/*
    @Autor: Victor Teixeira Silva.

    7- Crie a classe Imc adptando o código do exercicio 2.33.

 */
public class Imc {


    public static double myIMC(HealthProfile healthProfile){
        return healthProfile.getWeight() / (healthProfile.getHeight() * healthProfile.getHeight());
    }

    public static String showImcGraph(){
        return "================================\n" +
                "BMI VALUES\n" +
                "Underweight: less than 18.5\n" +
                "Normal: between 18.5 and 24.9\n" +
                "Overweight: beetween 25 and 29.9\n" +
                "Obese: 30 or greater\n" +
                "================================";
    }


}
