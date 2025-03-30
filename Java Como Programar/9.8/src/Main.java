public class Main {
    public static void main(String[] args) {
        // Pontos genéricos
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 0);
        Point p3 = new Point(4, 3);
        Point p4 = new Point(0, 3);

        // Instanciação de objetos das classes
        Trapezoid trapezoid = new Trapezoid(p1, p2, p3, p4, 4, 6, 5);
        Parallelogram parallelogram = new Parallelogram(p1, p2, p3, p4, 4, 3);
        Rectangle rectangle = new Rectangle(p1, p2, p3, p4, 4, 3);
        Square square = new Square(p1, p2, p3, p4, 4);

        // Exibição das áreas
        System.out.printf("Área do Trapezoid: %.2f%n", trapezoid.area());
        System.out.printf("Área do Parallelogram: %.2f%n", parallelogram.area());
        System.out.printf("Área do Rectangle: %.2f%n", rectangle.area());
        System.out.printf("Área do Square: %.2f%n", square.area());
    }
}