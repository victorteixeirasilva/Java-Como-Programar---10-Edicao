public class Main {
    public static void main(String[] args) {
        // Itera por todas as constantes do enum TrafficLight
        for (TrafficLight light : TrafficLight.values()) {
            // Exibe o nome da constante e sua duração
            System.out.println(light + " - Duração: " + light.getDuration() + " segundos");
        }

    }
}