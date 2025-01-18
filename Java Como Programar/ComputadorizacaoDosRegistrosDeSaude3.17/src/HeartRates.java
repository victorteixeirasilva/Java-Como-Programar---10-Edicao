/*
    @Autor: Victor Teixeira Silva

    6- Adapte a classe HeartRates para Usar o HealthProfile para os calculos.

 */
public class HeartRates {


    public static String targetHeartRate(HealthProfile healthProfile){
        double targetHeartRate50 = maximumHeartRate(healthProfile)*0.5;
        double targetHeartRate85 = maximumHeartRate(healthProfile)*0.85;

        return targetHeartRate50 + "-" + targetHeartRate85;
    }

    public static int maximumHeartRate(HealthProfile healthProfile) {
        int maximumHeartRate = 220 - healthProfile.getDateOfBirth().ageInYears();
        return maximumHeartRate;
    }


}
