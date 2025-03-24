public enum TrafficLight {
    RED(30),     // Duração da luz vermelha: 30 segundos
    GREEN(45),   // Duração da luz verde: 45 segundos
    YELLOW(5);   // Duração da luz amarela: 5 segundos

    private final int duration; // Campo para armazenar a duração da luz

    // Construtor do enum
    TrafficLight(int duration) {
        this.duration = duration;
    }

    // Método para obter a duração da luz
    public int getDuration() {
        return duration;
    }
}
