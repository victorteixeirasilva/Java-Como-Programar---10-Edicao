public class Trapezoid extends Quadrilateral{
    private double base1; // Base menor
    private double base2; // Base maior
    private double height; // Altura

    public Trapezoid(Point p1, Point p2, Point p3, Point p4, double base1, double base2, double height) {
        super(p1, p2, p3, p4);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double area() {
        return ((base1 + base2) * height) / 2;
    }
}
