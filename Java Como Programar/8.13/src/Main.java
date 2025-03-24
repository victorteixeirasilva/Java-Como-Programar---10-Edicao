public class Main {
    public static void main(String[] args) {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();

        // Inserir elementos em ambos os conjuntos
        set1.insertElement(10);
        set1.insertElement(20);
        set2.insertElement(20);
        set2.insertElement(30);

        // Exibir os conjuntos
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        // União dos conjuntos
        IntegerSet unionSet = IntegerSet.union(set1, set2);
        System.out.println("União: " + unionSet);

        // Interseção dos conjuntos
        IntegerSet intersectionSet = IntegerSet.intersection(set1, set2);
        System.out.println("Interseção: " + intersectionSet);

        // Verificar igualdade
        System.out.println("Set 1 é igual ao Set 2? " + set1.isEqualTo(set2));

        // Excluir um elemento de set1
        set1.deleteElement(10);
        System.out.println("Set 1 após exclusão: " + set1);

        // Testar conjunto vazio
        IntegerSet emptySet = new IntegerSet();
        System.out.println("Conjunto vazio: " + emptySet);

    }
}