import java.util.Arrays;

public class IntegerSet {

    private final boolean[] set; // Array de booleans para armazenar o conjunto

    // Construtor sem argumentos: inicializa com um conjunto vazio
    public IntegerSet() {
        set = new boolean[101]; // Conjunto com índices de 0 a 100, todos false
    }

    // Método para criar a união de dois conjuntos
    public static IntegerSet union(IntegerSet set1, IntegerSet set2) {
        IntegerSet unionSet = new IntegerSet();
        for (int i = 0; i < unionSet.set.length; i++) {
            unionSet.set[i] = set1.set[i] || set2.set[i];
        }
        return unionSet;
    }

    // Método para criar a interseção de dois conjuntos
    public static IntegerSet intersection(IntegerSet set1, IntegerSet set2) {
        IntegerSet intersectionSet = new IntegerSet();
        for (int i = 0; i < intersectionSet.set.length; i++) {
            intersectionSet.set[i] = set1.set[i] && set2.set[i];
        }
        return intersectionSet;
    }

    // Método para inserir um elemento no conjunto
    public void insertElement(int k) {
        if (k >= 0 && k <= 100) {
            set[k] = true;
        } else {
            System.out.println("Erro: Elemento fora do intervalo (0-100)");
        }
    }

    // Método para excluir um elemento do conjunto
    public void deleteElement(int m) {
        if (m >= 0 && m <= 100) {
            set[m] = false;
        } else {
            System.out.println("Erro: Elemento fora do intervalo (0-100)");
        }
    }

    // Método para converter o conjunto em uma String
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        boolean isEmpty = true;

        for (int i = 0; i < set.length; i++) {
            if (set[i]) {
                result.append(i).append(" ");
                isEmpty = false;
            }
        }

        return isEmpty ? "---" : result.toString().trim();
    }

    // Método para verificar se dois conjuntos são iguais
    public boolean isEqualTo(IntegerSet otherSet) {
        return Arrays.equals(this.set, otherSet.set);
    }



}
