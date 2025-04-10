public class Triangle extends TwoDimensionalShape{
    public Triangle(float x, float y) {
        super(x, y);
    }

    @Override
    public float getArea() {
        return (getX()*getY())/2;
    }
}
