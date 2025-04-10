public class Square extends TwoDimensionalShape{
    public Square(float x, float y) {
        super(x, y);
    }

    @Override
    public float getArea() {
        return getX()*getY();
    }
}
