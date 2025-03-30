public class Parallelogram extends Quadrilateral{
    private double base;
    private double height;

    public Parallelogram(Point p1, Point p2, Point p3, Point p4, double base, double height) {
        super(p1, p2, p3, p4);
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return base * height;
    }
}
