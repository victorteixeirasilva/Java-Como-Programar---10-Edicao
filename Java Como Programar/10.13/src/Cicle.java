public class Cicle extends TwoDimensionalShape{

    public Cicle(float x, float y) {
        super(x, y);
    }

    @Override
    public float getArea() {
        return (float) (Math.PI * Math.pow((getX()/2),2));
    }
}
