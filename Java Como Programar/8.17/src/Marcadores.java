public enum Marcadores {
    X("X"),
    O("O"),
    EMPTY("EMPTY");

    private final String value; // Campo para armazenar o valor associado

    // Construtor que aceita o valor como argumento
    Marcadores(String value) {
        this.value = value;
    }

    // Método para obter o valor associado
    public String getValue() {
        return value;
    }
}
