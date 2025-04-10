import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Shape> lista = new ArrayList<>();
        lista.add(new Cicle(20, 20));
        lista.add(new Square(30, 30));
        lista.add(new Triangle(20, 20));
        lista.add(new Sphere(20, 20, 20));
        lista.add(new Tetrahedron(20, 20, 20));
        lista.add(new Cube(20, 20, 20));

        for (Shape shape:lista){
            if (shape instanceof TwoDimensionalShape s) {
                System.out.println(s.getArea());
            } else if (shape instanceof  ThreeDimensionalShape s) {
                System.out.println(s.getArea());
            }
        }
    }
}